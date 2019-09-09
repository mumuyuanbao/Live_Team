package com.live.liveteam.controller;

import com.live.liveteam.common.enums.EnumResult;
import com.live.liveteam.common.exception.BizException;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.utils.RedisUtil;
import com.live.liveteam.entity.UserScoreDetail;
import com.live.liveteam.service.UserScoreDetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    @ApiImplicitParam(name = "token", value = "", dataType = "String", paramType = "query")
    public ResultVO<List<UserScoreDetail>> queryUserScoreDetail(String token) {
        ResultVO<List<UserScoreDetail>> result = new ResultVO<>();

        return result;
    }



}
