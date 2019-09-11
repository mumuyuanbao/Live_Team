package com.live.liveteam.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 作者: XW
 * 时间: 2019/9/11 11:16
 * 描述: 优惠券VO
 */
@ApiModel("优惠券")
public class CouponsVO {

    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("优惠券种类")
    private Integer couponsType;
    @ApiModelProperty("满减类优惠券面值")
    private Double couponsValue;
    @ApiModelProperty("满减类优惠券门槛")
    private Double couponsRequire;
    @ApiModelProperty("兑换类优惠券对应商品Id")
    private Long couponsGoodsId;
    @ApiModelProperty("优惠券状态")
    private Integer couponsState;
    @ApiModelProperty("优惠券描述")
    private String couponsDesc;

    public CouponsVO() {
    }

    public CouponsVO(Long id, Integer couponsType, Double couponsValue, Double couponsRequire, Long couponsGoodsId, Integer couponsState, String couponsDesc) {
        this.id = id;
        this.couponsType = couponsType;
        this.couponsValue = couponsValue;
        this.couponsRequire = couponsRequire;
        this.couponsGoodsId = couponsGoodsId;
        this.couponsState = couponsState;
        this.couponsDesc = couponsDesc;
    }

    @Override
    public String toString() {
        return "CouponsVO{" +
                "id=" + id +
                ", couponsType=" + couponsType +
                ", couponsValue=" + couponsValue +
                ", couponsRequire=" + couponsRequire +
                ", couponsGoodsId=" + couponsGoodsId +
                ", couponsState=" + couponsState +
                ", couponsDesc='" + couponsDesc + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCouponsType() {
        return couponsType;
    }

    public void setCouponsType(Integer couponsType) {
        this.couponsType = couponsType;
    }

    public Double getCouponsValue() {
        return couponsValue;
    }

    public void setCouponsValue(Double couponsValue) {
        this.couponsValue = couponsValue;
    }

    public Double getCouponsRequire() {
        return couponsRequire;
    }

    public void setCouponsRequire(Double couponsRequire) {
        this.couponsRequire = couponsRequire;
    }

    public Long getCouponsGoodsId() {
        return couponsGoodsId;
    }

    public void setCouponsGoodsId(Long couponsGoodsId) {
        this.couponsGoodsId = couponsGoodsId;
    }

    public Integer getCouponsState() {
        return couponsState;
    }

    public void setCouponsState(Integer couponsState) {
        this.couponsState = couponsState;
    }

    public String getCouponsDesc() {
        return couponsDesc;
    }

    public void setCouponsDesc(String couponsDesc) {
        this.couponsDesc = couponsDesc;
    }
}
