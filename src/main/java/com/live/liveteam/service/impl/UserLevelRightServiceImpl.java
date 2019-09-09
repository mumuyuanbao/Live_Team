package com.live.liveteam.service.impl;

import com.live.liveteam.entity.User;
import com.live.liveteam.entity.UserLevelRight;
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

    @Override
    public UserLevelRight selectUserLevel(String openid) {
        User user = userMapper.selectByPrimaryKey(openid);

        return null;
    }
}
