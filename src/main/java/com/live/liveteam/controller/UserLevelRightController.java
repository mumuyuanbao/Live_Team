package com.live.liveteam.controller;

import com.alibaba.fastjson.JSONObject;
import com.live.liveteam.common.enums.EnumResult;
import com.live.liveteam.common.exception.BizException;
import com.live.liveteam.common.utils.WechatUtil;
import com.live.liveteam.entity.UserLevelRight;
import com.live.liveteam.service.UserLevelRightService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:许承斌
 * date:2019/9/9 20:49
 * description:会员权益信息接口
 */
@Api(description = "会员权益信息接口")
@RestController
@RequestMapping("userlevel")
public class UserLevelRightController {

    @Autowired
    private UserLevelRightService userLevelRightService;

    @ApiOperation("获取会员权益信息")
    @GetMapping("getUserLevel")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "levelName", value = "等级名字", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "rightCouponsNumber", value = "发放优惠券数量", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "rightCouponsValue", value = "优惠券面值", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "rightCouponsTimeout", value = "优惠券到期时间", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "rightBirthGift", value = "生日礼包,0没有,1有", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "rightScoreRatio", value = "享受的积分倍率(实际值为该值除100)", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "rightDiscount", value = "享受的全场折扣（实际折扣为该值除100）", dataType = "int", paramType = "query")
    })


    public UserLevelRight userLevelRight (@RequestParam(value = "code") String code){
        // 1.接收小程序发送的code
        JSONObject SessionKeyOpenId = WechatUtil.getSessionKeyOrOpenId(code);
        String openid = SessionKeyOpenId.getString("openid");

        //2.如果openid为null代表code错误，微信服务器无此用户
        if (openid==null){
            throw  new BizException(EnumResult.USER_CHECK_LOGIN_ERROR.getCode(),EnumResult.USER_CHECK_LOGIN_ERROR.getMsg());
        }
        //3.根据openid查询对应会员权益信息对象
        UserLevelRight userLevel = userLevelRightService.queryUserLevel(openid);

        return userLevel;
    }
}
