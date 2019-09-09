package com.live.liveteam.entity;

public class OrderDetails {
    private Long id;

    private String orderNum;

    private String openId;

    private Long addressId;

    private Long gId;

    private Long orderPrice;

    private Long orderPriceCoupons;

    private String gName;

    private Long gPrice;

    private Integer gNum;

    private Long gPriceCount;

    private String goodsUrl;

    public OrderDetails(Long id, String orderNum, String openId, Long addressId, Long gId, Long orderPrice, Long orderPriceCoupons, String gName, Long gPrice, Integer gNum, Long gPriceCount, String goodsUrl) {
        this.id = id;
        this.orderNum = orderNum;
        this.openId = openId;
        this.addressId = addressId;
        this.gId = gId;
        this.orderPrice = orderPrice;
        this.orderPriceCoupons = orderPriceCoupons;
        this.gName = gName;
        this.gPrice = gPrice;
        this.gNum = gNum;
        this.gPriceCount = gPriceCount;
        this.goodsUrl = goodsUrl;
    }

    public OrderDetails() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Long getgId() {
        return gId;
    }

    public void setgId(Long gId) {
        this.gId = gId;
    }

    public Long getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Long orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Long getOrderPriceCoupons() {
        return orderPriceCoupons;
    }

    public void setOrderPriceCoupons(Long orderPriceCoupons) {
        this.orderPriceCoupons = orderPriceCoupons;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public Long getgPrice() {
        return gPrice;
    }

    public void setgPrice(Long gPrice) {
        this.gPrice = gPrice;
    }

    public Integer getgNum() {
        return gNum;
    }

    public void setgNum(Integer gNum) {
        this.gNum = gNum;
    }

    public Long getgPriceCount() {
        return gPriceCount;
    }

    public void setgPriceCount(Long gPriceCount) {
        this.gPriceCount = gPriceCount;
    }

    public String getGoodsUrl() {
        return goodsUrl;
    }

    public void setGoodsUrl(String goodsUrl) {
        this.goodsUrl = goodsUrl == null ? null : goodsUrl.trim();
    }
}