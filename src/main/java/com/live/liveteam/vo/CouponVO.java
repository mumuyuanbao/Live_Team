package com.live.liveteam.vo;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 作者: XW
 * 时间: 2019/10/14 16:48
 * 描述:
 */
@ApiModel(value = "优惠券页面展示对象")
public class CouponVO {

    @ApiModelProperty("优惠券对应id")
    private Long id;
    @ApiModelProperty("对应优惠券左上角的名称")
    private String name;
    @ApiModelProperty("对应优惠券右侧显示，满减券为面值，兑换券为兑换券")
    private String value;
    @ApiModelProperty("商品id，在去使用时使用,满减券为-1")
    private Long productId;
    @ApiModelProperty("对应商品名称，满减券该值为 所有商品，直接显示在适用范围下")
    private String productName;
    @ApiModelProperty("优惠券种类")
    private Integer type;

    public CouponVO() {
    }

    public CouponVO(Long id, String name, String value, Long productId, String productName, Integer type) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.productId = productId;
        this.productName = productName;
        this.type = type;
    }

    @Override
    public String toString() {
        return "CouponVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", productId=" + productId +
                ", productName='" + productName + '\'' +
                ", type=" + type +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }


}
