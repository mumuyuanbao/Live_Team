package com.live.liveteam.service.impl;

import com.live.liveteam.common.enums.EnumResult;
import com.live.liveteam.common.enums.EnumScoreDetailInfo;
import com.live.liveteam.common.exception.BizException;
import com.live.liveteam.common.result.SimpleResultVO;
import com.live.liveteam.common.utils.DateUtils;
import com.live.liveteam.common.utils.RedisUtil;
import com.live.liveteam.common.utils.UserUtil;
import com.live.liveteam.entity.User;
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
     * @param token
     * @return 用户积分明细 可能为null
     */
    @Override
    public List<UserScoreDetail> queryScoreDetailByOpenId(String token) {
        User user = UserUtil.loginCheck(token);
        UserScoreDetailExample example = new UserScoreDetailExample();
        UserScoreDetailExample.Criteria criteria = example.createCriteria();
        criteria.andOpenIdEqualTo(user.getOpenId());
        List<UserScoreDetail> details = userScoreDetailMapper.selectByExample(example);
        return details;
    }

    /**
     * (后台使用)返回所有用户的积分明细信息
     *
     * @return 所有用户积分明细 可能为null
     */
    @Override
    public List<UserScoreDetail> queryAll() {
        List<UserScoreDetail> userScoreDetails = userScoreDetailMapper.selectByExample(null);
        return userScoreDetails;
    }

    /**
     * (后端使用)返回当前用户的总积分 若用户无积分明细记录或用户不存在则抛出异常
     *
     * @param openId 用户openId
     * @return 当前用户的总积分
     */
    @Override
    public Integer queryTotalScore(String openId) {
        String key = RedisUtil.USER_SCORE_STRING + openId;
        if (redisUtil.hasKey(key)) {
            Object totalScore = redisUtil.get(key);
            return (Integer) totalScore;
        } else {
            throw new BizException(EnumResult.SCORE_FIND_USER_FAIL.getCode(), EnumResult.SCORE_FIND_USER_FAIL.getMsg());
        }
    }

    /**
     * (后端使用)插入一条用户的积分明细数据
     *
     * @param user 用户信息 希望控制层要做好非空检查
     * @param info 订单明细产生方式
     * @param value 订单明细产生的值
     * @return 插入结果
     */
    @Override
    public SimpleResultVO insertScoreDetail(User user, EnumScoreDetailInfo info, Integer value) {
        SimpleResultVO result = new SimpleResultVO();
        if (user == null || info == null || value == null) {
            throw new BizException(EnumResult.PARAM_NULL.getCode(), EnumResult.PARAM_NULL.getMsg());
        }
        try {
            // 添加积分明细到数据库
            UserScoreDetail detail = new UserScoreDetail(null, user.getOpenId(), value,
                    info.getInfo(), DateUtils.getTimeStamp());
            userScoreDetailMapper.insertSelective(detail);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BizException(EnumResult.SCORE_INSERT_DATABASE_FAIL.getCode(), EnumResult.SCORE_INSERT_DATABASE_FAIL.getMsg());
        }
        try {
            // 对Redis中的总积分数据进行修改
            String key = RedisUtil.USER_SCORE_STRING + user.getOpenId();
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
