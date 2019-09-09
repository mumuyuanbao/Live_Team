package com.live.liveteam.service.impl;

import com.live.liveteam.common.enums.EnumResult;
import com.live.liveteam.common.result.SimpleResultVO;
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
 * 描述: 只涉及用户积分明细的service类,不涉及总积分的计算
 */
@Service
public class UserScoreDetailServiceImpl implements UserScoreDetailService {

    @Autowired
    private UserScoreDetailMapper userScoreDetailMapper;

    /**
     * 返回该用户所有的积分明细信息
     *
     * @param openId 传入的用户openId
     * @return
     */
    @Override
    public List<UserScoreDetail> queryScoreDetailByOpenId(String openId) {
        UserScoreDetailExample example = new UserScoreDetailExample();
        UserScoreDetailExample.Criteria criteria = example.createCriteria();
        criteria.andOpenIdEqualTo(openId);
        List<UserScoreDetail> details = userScoreDetailMapper.selectByExample(example);
        System.out.println("details = " + details);
        return details;
    }

    /**
     * (后台使用)返回所有用户的积分明细信息
     *
     * @return
     */
    @Override
    public List<UserScoreDetail> queryAll() {
        List<UserScoreDetail> userScoreDetails = userScoreDetailMapper.selectByExample(null);
        System.out.println(userScoreDetails);
        return userScoreDetails;
    }

    /**
     * 插入用户积分明细信息
     *
     * @param userScoreDetail
     * @return
     */
    @Override
    public SimpleResultVO insertScoreDetail(UserScoreDetail userScoreDetail) {
        SimpleResultVO result = new SimpleResultVO();
        try {
            userScoreDetailMapper.insert(userScoreDetail);
        } catch (Exception e) {
            // 发生任何错误就返回添加失败
            result.setCode(EnumResult.INSERT_ERROR.getCode());
            result.setMsg(EnumResult.INSERT_ERROR.getMsg());
            return result;
        }
        result.setCode(EnumResult.SUCCESS.getCode());
        result.setMsg(EnumResult.SUCCESS.getMsg());
        return result;
    }
}
