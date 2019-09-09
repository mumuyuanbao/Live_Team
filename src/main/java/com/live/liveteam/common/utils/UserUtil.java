package com.live.liveteam.common.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.live.liveteam.common.enums.EnumResult;
import com.live.liveteam.common.exception.BizException;
import com.live.liveteam.entity.User;

/**
 * 作者: XW
 * 时间: 2019/9/9 17:07
 * 描述:
 */
public class UserUtil {

    private static RedisUtil redisUtil;

    /**
     * 用于验证登录的工具类
     * @param token
     * @return 若已登录返回用户信息
     */
    public static User loginCheck(String token) {
        if (token != null) {
            throw new BizException(EnumResult.USER_TOKEN_NULL.getCode(), EnumResult.USER_TOKEN_NULL.getMsg());
        }
        Object userInfo = redisUtil.get(RedisUtil.LOGIN_USER_STRING + token);
        if (userInfo == null) {
            throw new BizException(EnumResult.USER_TOKEN_LOSE.getCode(), EnumResult.USER_TOKEN_LOSE.getMsg());
        }
        String s = JSON.toJSONString(userInfo);
        User user = JSONObject.parseObject(s, User.class);
        return user;
    }

}
