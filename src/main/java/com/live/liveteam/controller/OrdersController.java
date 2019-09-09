package com.live.liveteam.controller;


import com.live.liveteam.common.result.PageVO;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.result.SimpleResultVO;
import com.live.liveteam.entity.OrderDetails;
import com.live.liveteam.service.OrdersService;
import com.live.liveteam.vo.OrderDetailsVO;
import com.live.liveteam.vo.OrderListVO;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;
import java.util.Map;

/**
 * 作者：木木豹
 * 时间2019-09-08 13:26
 * 描述：
 */
@Api(description = "订单接口")
@RestController
@RequestMapping("order")
public class OrdersController {

    @Autowired
    private OrdersService orderService;


    @ApiOperation("获取我的订单列表")
    @GetMapping("queryOrderList")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页条数", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "openId", value = "openId", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "orderStatus", value = "订单状态 0 待确认 1待支付 2待发货 3待确认收货 4已完成 5已取消 ", dataType = "int", paramType = "query")
    })
    public ResultVO<PageVO<OrderListVO>> queryOrderList(Integer pageNum, Integer pageSize, String openId, Integer orderStatus) {


        return orderService.queryOrderList(pageNum, pageSize, openId, orderStatus);
    }


    @ApiOperation("创建订单")
    @PostMapping("insertOrder")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "openId", value = "用户ID", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "addressId", value = "收货地址ID", dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "priceTotal", value = "商品总价（小数点后两位乘100，传整数）", dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "couponsIds", value = "使用优惠券ID，','逗号分隔", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "orderScore", value = "订单使用积分", dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "goodstotal", value = "订单商品总数", dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "orderCouponsPrice", value = "订单优惠金额", dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "goodsId", value = "订单商品ID数组','逗号分隔（与商品数量数组对应）", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "goodsNum", value = "订单商品数量数组','逗号分隔（与订单商品对应）", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "goodsUrls", value = "商品图片','逗号分隔（与订单商品对应）", dataType = "String", paramType = "query")


    })
    public SimpleResultVO insertOrder(String openId, Integer addressId, Long priceTotal, String couponsIds,Long goodstotal,
                                                     Long orderScore, Long orderCouponsPrice, String goodsId,String goodsNum,String goodsUrls) {

        return orderService.insertOrder(openId,addressId,priceTotal,couponsIds,orderScore,orderCouponsPrice,goodsId,goodsNum,goodsUrls);
    }


    @ApiOperation("获取订单详情")
    @GetMapping("selectOrderDetails")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderNum", value = "订单ID", dataType = "String", paramType = "query"),
    })
    public ResultVO<OrderDetailsVO> selectOrderDetails(String orderNum) {
        return orderService.selectOrderDetails(orderNum);
    }


    @ApiOperation("删除订单")
    @PostMapping("dropOrder")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderNum", value = "订单ID", dataType = "String", paramType = "query"),
    })
    public SimpleResultVO dropOrder(String orderNum) {
        return orderService.dropOrder(orderNum);
    }


    @ApiOperation("取消订单")
    @PostMapping("updateOrder")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderNum", value = "订单ID", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "orderCancelCause", value = "订单取消原因", dataType = "String", paramType = "query"),
    })
    public SimpleResultVO updateOrder(String orderNum, String orderCancelCause) {

        return orderService.updateOrder(orderNum, orderCancelCause);
    }


}
