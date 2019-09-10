package com.live.liveteam.service.impl;

import com.live.liveteam.common.enums.EnumResult;
import com.live.liveteam.common.enums.EnumScoreDetailInfo;
import com.live.liveteam.common.exception.BizException;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.result.SimpleResultVO;
import com.live.liveteam.common.utils.DateUtils;
import com.live.liveteam.common.utils.EmptyUtils;
import com.live.liveteam.common.utils.RedisUtil;
import com.live.liveteam.entity.UserScoreDetail;
import com.live.liveteam.entity.UserScoreDetailExample;
import com.live.liveteam.mapper.UserScoreDetailMapper;
import com.live.liveteam.service.UserScoreDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者: XW
 * 时间: 2019/9/7 11:34
 * 描述: 积分模块service类
 */
@Service
public class UserScoreDetailServiceImpl implements UserScoreDetailService {

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private UserScoreDetailMapper userScoreDetailMapper;

    /**
     * (前端)返回该用户所有的积分明细信息
     *
     * @param openId
     * @return
     */
    @Override
    public ResultVO<List<UserScoreDetail>> queryScoreDetailByOpenId(String openId) {
        if (openId == null) {
            EmptyUtils.throwParamNull();
        }
        ResultVO<List<UserScoreDetail>> result = new ResultVO<>();
        UserScoreDetailExample example = new UserScoreDetailExample();
        UserScoreDetailExample.Criteria criteria = example.createCriteria();
        criteria.andOpenIdEqualTo(openId);
        List<UserScoreDetail> details = userScoreDetailMapper.selectByExample(example);
        result.setData(details);
        result.setMsg(EnumResult.SUCCESS.getMsg());
        result.setCode(EnumResult.SUCCESS.getCode());
        return result;
    }

    /**
     * (后台使用)返回所有用户的积分明细信息
     *
     * @return
     */
    @Override
    public ResultVO<List<UserScoreDetail>> queryAll() {
        ResultVO<List<UserScoreDetail>> result = new ResultVO<>();
        List<UserScoreDetail> details = userScoreDetailMapper.selectByExample(null);
        result.setData(details);
        result.setCode(EnumResult.SUCCESS.getCode());
        result.setMsg(EnumResult.SUCCESS.getMsg());
        return result;
    }

    /**
     * 返回当前用户的总积分 若用户无积分明细记录或用户不存在则抛出异常
     *
     * @param openId 用户openId
     * @return 当前用户的总积分
     */
    @Override
    public ResultVO<Integer> queryTotalScore(String openId) {
        ResultVO<Integer> result = new ResultVO<>();
        String key = RedisUtil.USER_SCORE_STRING + openId;
        if (redisUtil.hasKey(key)) {
            Object totalScore = redisUtil.get(key);
            result.setCode(EnumResult.SUCCESS.getCode());
            result.setMsg(EnumResult.SUCCESS.getMsg());
            result.setData((Integer) totalScore);
            return result;
        } else {
            throw new BizException(EnumResult.SCORE_FIND_USER_FAIL.getCode(), EnumResult.SCORE_FIND_USER_FAIL.getMsg());
        }
    }

    /**
     * (后端使用)插入一条用户的积分明细数据
     *
     * @param openId 用户openId
     * @param info 订单明细产生方式
     * @param value 订单明细产生的值
     * @return 插入结果
     */
    @Override
    public SimpleResultVO insertScoreDetail(String openId, EnumScoreDetailInfo info, Integer value) {
        SimpleResultVO result = new SimpleResultVO();
        if (openId == null || info == null || value == null) {
            throw new BizException(EnumResult.PARAM_NULL.getCode(), EnumResult.PARAM_NULL.getMsg());
        }
        try {
            // 添加积分明细到数据库
            UserScoreDetail detail = new UserScoreDetail(null, openId, value,
                    info.getInfo(), DateUtils.getTimeStamp());
            userScoreDetailMapper.insertSelective(detail);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BizException(EnumResult.SCORE_INSERT_DATABASE_FAIL.getCode(), EnumResult.SCORE_INSERT_DATABASE_FAIL.getMsg());
        }
        try {
            // 对Redis中的总积分数据进行修改
            String key = RedisUtil.USER_SCORE_STRING + openId;
            // 判断在Redis中是否存在改用户的key
            if (redisUtil.hasKey(key)) {
                if (value > 0) {
                    redisUtil.incr(key, value.longValue());
                } else {
                    redisUtil.decr(key, value.longValue());
                }
            } else {
                // 不存在则创建
                redisUtil.set(key, value);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new BizException(EnumResult.SCORE_INSERT_REDIS_FAIL.getCode(), EnumResult.SCORE_INSERT_REDIS_FAIL.getMsg());
        }
        result.setCode(EnumResult.SUCCESS.getCode());
        result.setMsg(EnumResult.SUCCESS.getMsg());
        return result;
    }
}
