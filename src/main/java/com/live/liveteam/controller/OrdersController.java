package com.live.liveteam.controller;


import com.live.liveteam.common.result.PageVO;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.service.OrdersService;
import com.live.liveteam.vo.OrderListVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


        return  orderService.queryOrderList(pageNum,pageSize,openId,orderStatus);
    }


}
