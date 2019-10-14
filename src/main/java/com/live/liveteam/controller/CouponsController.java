package com.live.liveteam.controller;

import com.live.liveteam.common.constant.BizConstant;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.service.CouponsService;
import com.live.liveteam.vo.CouponVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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

    @ApiOperation("获取用户可用优惠券数量")
    @GetMapping("queryNumber")
    @ApiImplicitParam(name = "openId", value = "openId", dataType = "String", paramType = "query")
    public ResultVO<Long> queryCouponsNumber(String openId) {

        return couponsService.queryCouponsNumber(openId, null, null);
    }

    @ApiOperation("获取用户所有优惠券列表(未使用)")
    @GetMapping("queryUnused")
    @ApiImplicitParam(name = "openId", value = "openId", dataType = "String", paramType = "query")
    public ResultVO<List<CouponVO>> queryUnused(String openId) {

        return couponsService.queryCouponsAll(openId, BizConstant.COUPON_UNUSED, null, null);
    }

    @ApiOperation("获取用户所有优惠券列表(已使用)")
    @GetMapping("queryUsed")
    @ApiImplicitParam(name = "openId", value = "openId", dataType = "String", paramType = "query")
    public ResultVO<List<CouponVO>> queryUsed(String openId) {

        return couponsService.queryCouponsAll(openId, BizConstant.COUPON_USED, null, null);
    }

    @ApiOperation("(订单界面)获取用户可用优惠券数量")
    @GetMapping("queryOrderNumber")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "openId", value = "openId", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "goodsId", value = "订单商品ID数组','逗号分隔（与商品数量数组对应）", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "priceTotal", value = "商品总价（小数点后两位乘100，传整数）", dataType = "Integer", paramType = "query"),
    })
    public ResultVO<Long> queryCouponsOrderNumber(String openId, String goodsId, Long priceTotal) {

        return couponsService.queryCouponsNumber(openId, goodsId, priceTotal);
    }

    @ApiOperation("(订单界面)获取用户可用优惠券")
    @GetMapping("queryOrderDetail")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "openId", value = "openId", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "goodsId", value = "订单商品ID数组','逗号分隔（与商品数量数组对应）", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "priceTotal", value = "商品总价（小数点后两位乘100，传整数）", dataType = "Integer", paramType = "query")
    })
    public ResultVO<List<CouponVO>> queryCouponsOrder(String openId, String goodsId, Long priceTotal) {

        return couponsService.queryCouponsAll(openId, BizConstant.COUPON_UNUSED, goodsId, priceTotal);
    }

}
