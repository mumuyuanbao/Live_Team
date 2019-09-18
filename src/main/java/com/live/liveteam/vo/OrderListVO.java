package com.live.liveteam.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * 作者：木木豹
 * 时间2019-09-08 13:52
 * 描述：订单列表VO
 */
@ApiModel("订单列表")
public class OrderListVO {
    @ApiModelProperty("订单创建时间")
    private Long createTime;
    @ApiModelProperty("订单商品数量")
    private Long orderGoodsNum;
    @ApiModelProperty("商品图片URL集合")
    private List goodsUrls;
    @ApiModelProperty("商品总价")
    private Long orderPriceTotal;
    @ApiModelProperty("订单状态  0 待确认 1待支付 2待发货 3待确认收货 4已完成 5已取消 ")
    private Integer orderStauts;
    @ApiModelProperty("订单编号")
    private String orderNum;

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getOrderGoodsNum() {
        return orderGoodsNum;
    }

    public void setOrderGoodsNum(Long orderGoodsNum) {
        this.orderGoodsNum = orderGoodsNum;
    }

    public List getGoodsUrls() {
        return goodsUrls;
    }

    public void setGoodsUrls(List goodsUrls) {
        this.goodsUrls = goodsUrls;
    }

    public Long getOrderPriceTotal() {
        return orderPriceTotal;
    }

    public void setOrderPriceTotal(Long orderPriceTotal) {
        this.orderPriceTotal = orderPriceTotal;
    }

    public Integer getOrderStauts() {
        return orderStauts;
    }

    public void setOrderStauts(Integer orderStauts) {
        this.orderStauts = orderStauts;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }
}
