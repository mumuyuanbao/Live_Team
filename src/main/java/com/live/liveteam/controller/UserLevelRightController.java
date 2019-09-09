package com.live.liveteam.controller;

import com.alibaba.fastjson.JSONObject;
import com.live.liveteam.common.enums.EnumResult;
import com.live.liveteam.common.exception.BizException;
import com.live.liveteam.common.utils.WechatUtil;
import com.live.liveteam.entity.UserLevelRight;
import com.live.liveteam.service.UserLevelRightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * author:许承斌
 * date:2019/9/9 20:49
 * description:会员权益信息接口
 */
@Controller
public class UserLevelRightController {

    @Autowired
    private UserLevelRightService userLevelRightService;

    @GetMapping("userlevel")
    public UserLevelRight userLevelRight (@RequestParam(value = "code") String code){
        // 1.接收小程序发送的code
        JSONObject SessionKeyOpenId = WechatUtil.getSessionKeyOrOpenId(code);
        String openid = SessionKeyOpenId.getString("openid");

        //2.如果openid为null代表code错误，微信服务器无此用户
        if (openid==null){
            throw  new BizException(EnumResult.USER_CHECK_LOGIN_ERROR.getCode(),EnumResult.USER_CHECK_LOGIN_ERROR.getMsg());
        }
        //3.根据openid查询对应会员权益信息对象
        UserLevelRight userLevel = userLevelRightService.selectUserLevel(openid);
        return userLevel;
    }
}
