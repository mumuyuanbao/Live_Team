package com.live.liveteam.common.utils;



/**
 * author:许承斌
 * date:2019/9/16 21:42
 * description:
 */
public class StringUtils {
    public String RedisKey(String openid){
        return new StringBuffer().append("user:shoppingcar:").append(openid).toString();
    }
}
