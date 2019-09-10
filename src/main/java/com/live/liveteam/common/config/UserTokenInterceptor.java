package com.live.liveteam.common.config;


import com.live.liveteam.common.enums.EnumResult;
import com.live.liveteam.common.exception.BizException;
import com.live.liveteam.common.utils.MD5Utils;
import com.live.liveteam.common.utils.RedisUtil;
import com.live.liveteam.entity.User;
import com.live.liveteam.mapper.UserMapper;
import com.live.liveteam.vo.UserTokenVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


/**
 * 检验公共参数，以及获取当前用户信息
 */
public class UserTokenInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        // TODO 会话拦截，权限验证
        String userToken = request.getHeader("token");
        //如果不在mysql中，代表未授权，跳转到登录页
        if(userToken==null){
            throw  new BizException(EnumResult.USER_NOT_LOGIN);
        }
        if(redisUtil.get(userToken)==null){
            throw  new BizException(EnumResult.USER_NOT_LOGIN);
        }
//        User user = userMapper.selectByPrimaryKey(userToken);
//        if (user==null){
//            throw  new BizException(EnumResult.USER_NOT_LOGIN);
//        }
        return true;
    }
}