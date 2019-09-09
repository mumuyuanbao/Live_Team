package com.live.liveteam.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.live.liveteam.common.enums.EnumResult;
import com.live.liveteam.common.exception.BizException;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.utils.RedisUtil;
import com.live.liveteam.entity.User;
import com.live.liveteam.entity.UserScoreDetail;
import com.live.liveteam.service.UserScoreDetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 作者: XW
 * 时间: 2019/9/7 14:26
 * 描述: 用户积分明细接口
 */
@Api(description = "用户积分明细接口")
@RestController
@RequestMapping("score")
public class UserScoreDetailController {

    @Autowired
    private UserScoreDetailService userScoreDetailService;

    private RedisUtil redisUtil;
    /**
     * 提供前台页面返回单个用户的积分明细信息接口
     * @param token
     * @return
     */
    @GetMapping("QureyScoreDetail")
    @ApiOperation(value = "返回单个用户的积分明细信息")
    @ApiImplicitParam(name = "token", value = "", dataType = "String", paramType = "query")
    public ResultVO<List<UserScoreDetail>> queryUserScoreDetail(@RequestParam(value = "token", required = true) String token) {
        ResultVO<List<UserScoreDetail>> result = new ResultVO<>();
        if (token != null) {
            throw new BizException(EnumResult.USER_TOKEN_NULL.getCode(), EnumResult.USER_TOKEN_NULL.getMsg());
        }
        Object userInfo = redisUtil.get(RedisUtil.LOGIN_USER_STRING + token);
        if (userInfo == null) {
            throw new BizException(EnumResult.USER_TOKEN_LOSE.getCode(), EnumResult.USER_TOKEN_LOSE.getMsg());
        }
        String s = JSON.toJSONString(userInfo);
        User user = JSONObject.parseObject(s, User.class);
        return result;
    }

    @GetMapping("QueryScoreAll")
    @ApiOperation(value = "返回所有用户的积分明细信息")
    public ResultVO<List<UserScoreDetail>> queryUserScoreAll() {
        ResultVO<List<UserScoreDetail>> result = new ResultVO<>();

        return result;
    }

}
