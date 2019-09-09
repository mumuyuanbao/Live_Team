package com.live.liveteam.vo;


import com.live.liveteam.entity.OrderDetails;
import com.live.liveteam.entity.Orders;

import java.util.List;

/**
 * 作者：木木豹
 * 时间2019-09-09 11:08
 * 描述：返回商品详情
 */
public class OrderDetailsVO {

    private String orderNum;

    private Long openId;

    private Integer orderStatus;

    private Long addressId;

    private Long orderPriceTotal;

    private Long orderGoodsNum;

    private String couponsIds;

    private Long orderAffirm;

    private String orderCancelCause;

    private Long orderPayTime;

    private Long createTime;

    private Long orderUpdate;

    private Long orderCouponsPrice;

    private Long orderScore;

    private Long orderCancelTime;

   private List<OrderDetails> orderDetailsList;


    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Long getOpenId() {
        return openId;
    }

    public void setOpenId(Long openId) {
        this.openId = openId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Long getOrderPriceTotal() {
        return orderPriceTotal;
    }

    public void setOrderPriceTotal(Long orderPriceTotal) {
        this.orderPriceTotal = orderPriceTotal;
    }

    public Long getOrderGoodsNum() {
        return orderGoodsNum;
    }

    public void setOrderGoodsNum(Long orderGoodsNum) {
        this.orderGoodsNum = orderGoodsNum;
    }

    public String getCouponsIds() {
        return couponsIds;
    }

    public void setCouponsIds(String couponsIds) {
        this.couponsIds = couponsIds;
    }

    public Long getOrderAffirm() {
        return orderAffirm;
    }

    public void setOrderAffirm(Long orderAffirm) {
        this.orderAffirm = orderAffirm;
    }

    public String getOrderCancelCause() {
        return orderCancelCause;
    }

    public void setOrderCancelCause(String orderCancelCause) {
        this.orderCancelCause = orderCancelCause;
    }

    public Long getOrderPayTime() {
        return orderPayTime;
    }

    public void setOrderPayTime(Long orderPayTime) {
        this.orderPayTime = orderPayTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getOrderUpdate() {
        return orderUpdate;
    }

    public void setOrderUpdate(Long orderUpdate) {
        this.orderUpdate = orderUpdate;
    }

    public Long getOrderCouponsPrice() {
        return orderCouponsPrice;
    }

    public void setOrderCouponsPrice(Long orderCouponsPrice) {
        this.orderCouponsPrice = orderCouponsPrice;
    }

    public Long getOrderScore() {
        return orderScore;
    }

    public void setOrderScore(Long orderScore) {
        this.orderScore = orderScore;
    }

    public Long getOrderCancelTime() {
        return orderCancelTime;
    }

    public void setOrderCancelTime(Long orderCancelTime) {
        this.orderCancelTime = orderCancelTime;
    }

    public List<OrderDetails> getOrderDetailsList() {
        return orderDetailsList;
    }

    public void setOrderDetailsList(List<OrderDetails> orderDetailsList) {
        this.orderDetailsList = orderDetailsList;
    }
}
