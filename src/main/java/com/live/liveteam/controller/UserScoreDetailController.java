package com.live.liveteam.controller;

import com.live.liveteam.common.enums.EnumResult;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.utils.RedisUtil;
import com.live.liveteam.common.utils.UserUtil;
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
        User user = UserUtil.loginCheck(token);
        List<UserScoreDetail> details = userScoreDetailService.queryScoreDetailByOpenId(user.getOpenId());
        result.setData(details);
        result.setCode(EnumResult.SUCCESS.getCode());
        result.setMsg(EnumResult.SUCCESS.getMsg());
        return result;
    }

    @GetMapping("QueryScoreAll")
    @ApiOperation(value = "返回所有用户的积分明细信息")
    public ResultVO<List<UserScoreDetail>> queryUserScoreAll() {
        ResultVO<List<UserScoreDetail>> result = new ResultVO<>();
        List<UserScoreDetail> details = userScoreDetailService.queryAll();
        result.setData(details);
        result.setCode(EnumResult.SUCCESS.getCode());
        result.setMsg(EnumResult.SUCCESS.getMsg());
        return result;
    }

}
