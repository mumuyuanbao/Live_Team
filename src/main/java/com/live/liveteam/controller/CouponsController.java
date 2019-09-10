package com.live.liveteam.controller;

import com.live.liveteam.common.result.PageVO;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.entity.Coupons;
import com.live.liveteam.service.CouponsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;
import java.util.Map;

/**
 * 作者: XW
 * 时间: 2019/9/10 11:14
 * 描述:
 */
@Api(description = "用户优惠券接口")
@RestController
@RequestMapping("coupon")
public class CouponsController {

    @Autowired
    private CouponsService couponsService;

    @ApiOperation("获取用户所有优惠券列表")
    @GetMapping("queryCoupons")
    @ApiImplicitParam(name = "openId", value = "openId", dataType = "String", paramType = "query")
    public ResultVO<Map> queryCoupons(String openId) {

        return couponsService.queryCouponsAll(openId);
    }

    @ApiOperation("获取用户可用优惠券数量")
    @GetMapping("queryCouponsNumber")
    @ApiImplicitParam(name = "openId", value = "openId", dataType = "String", paramType = "query")
    public ResultVO<Integer> queryCouponsNumber(String openId) {

        return couponsService.queryCouponsUsefulNumber(openId);
    }


}
