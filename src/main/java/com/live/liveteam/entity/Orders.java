package com.live.liveteam.entity;

import com.live.liveteam.common.utils.DateUtils;

public class Orders {
    private String orderNum;

    private String openId;

    private Integer orderStatus;

    private Long addressId;

    private Integer isShow;

    private String goodsUrls;

    private Long orderPriceTotal;

    private Long orderGoodsNum;

    private String couponsIds;

    private Long orderAffirm;

    private Integer orderScore;

    private Long orderCouponsPrice;

    private String orderCancelCause;

    private Long orderPayTime;

    private Long createTime;

    private Long orderUpdate;

    private Long orderCancelTime;

    public Orders(String orderNum, String openId, Integer orderStatus, Long addressId, Integer isShow, String goodsUrls, Long orderPriceTotal, Long orderGoodsNum, String couponsIds, Long orderAffirm, Integer orderScore, Long orderCouponsPrice, String orderCancelCause, Long orderPayTime, Long createTime, Long orderUpdate, Long orderCancelTime) {
        this.orderNum = orderNum;
        this.openId = openId;
        this.orderStatus = orderStatus;
        this.addressId = addressId;
        this.isShow = isShow;
        this.goodsUrls = goodsUrls;
        this.orderPriceTotal = orderPriceTotal;
        this.orderGoodsNum = orderGoodsNum;
        this.couponsIds = couponsIds;
        this.orderAffirm = orderAffirm;
        this.orderScore = orderScore;
        this.orderCouponsPrice = orderCouponsPrice;
        this.orderCancelCause = orderCancelCause;
        this.orderPayTime = orderPayTime;
        this.createTime = createTime;
        this.orderUpdate = orderUpdate;
        this.orderCancelTime = orderCancelTime;
    }

    public static Orders newUserEntity(){
        Orders orders = new Orders();
        orders.setOrderStatus(1);
        orders.setIsShow(1);
        orders.setCreateTime(DateUtils.getTimeStamp());
        return orders;


    }

    public Orders() {
        super();
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
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

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public String getGoodsUrls() {
        return goodsUrls;
    }

    public void setGoodsUrls(String goodsUrls) {
        this.goodsUrls = goodsUrls == null ? null : goodsUrls.trim();
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
        this.couponsIds = couponsIds == null ? null : couponsIds.trim();
    }

    public Long getOrderAffirm() {
        return orderAffirm;
    }

    public void setOrderAffirm(Long orderAffirm) {
        this.orderAffirm = orderAffirm;
    }

    public Integer getOrderScore() {
        return orderScore;
    }

    public void setOrderScore(Integer orderScore) {
        this.orderScore = orderScore;
    }

    public Long getOrderCouponsPrice() {
        return orderCouponsPrice;
    }

    public void setOrderCouponsPrice(Long orderCouponsPrice) {
        this.orderCouponsPrice = orderCouponsPrice;
    }

    public String getOrderCancelCause() {
        return orderCancelCause;
    }

    public void setOrderCancelCause(String orderCancelCause) {
        this.orderCancelCause = orderCancelCause == null ? null : orderCancelCause.trim();
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

    public Long getOrderCancelTime() {
        return orderCancelTime;
    }

    public void setOrderCancelTime(Long orderCancelTime) {
        this.orderCancelTime = orderCancelTime;
    }
}