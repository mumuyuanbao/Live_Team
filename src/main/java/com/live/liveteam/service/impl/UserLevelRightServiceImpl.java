package com.live.liveteam.service.impl;

import com.live.liveteam.entity.User;
import com.live.liveteam.entity.UserLevelRight;
import com.live.liveteam.mapper.UserLevelRightMapper;
import com.live.liveteam.mapper.UserMapper;
import com.live.liveteam.service.UserLevelRightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author:许承斌
 * date:2019/9/9 21:09
 * description:
 */
@Service
public class UserLevelRightServiceImpl implements UserLevelRightService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserLevelRightMapper userLevelRightMapper;

    @Override
    public UserLevelRight queryUserLevel(String openid) {
        //1.根据openid获取对应用户信息
        User user = userMapper.selectByPrimaryKey(openid);
        //2.获取用户会员类型
        Integer userLevelId = user.getUserForm();
        //3.根据userLevelId会员权益Id获取对应权益信息
        UserLevelRight userLevel = userLevelRightMapper.selectByPrimaryKey(userLevelId);

        return userLevel;
    }
}
