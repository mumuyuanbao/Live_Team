package com.live.liveteam.entity;

public class Coupons {
    private Long id;

    private String openId;

    private Integer couponsType;

    private Integer couponsValue;

    private Integer couponsRequire;

    private Long couponsGoodsId;

    private Integer couponsState;

    private Long couponsStartTime;

    private Long couponsUseTime;

    private String couponsDesc;

    public Coupons(Long id, String openId, Integer couponsType, Integer couponsValue, Integer couponsRequire, Long couponsGoodsId, Integer couponsState, Long couponsStartTime, Long couponsUseTime, String couponsDesc) {
        this.id = id;
        this.openId = openId;
        this.couponsType = couponsType;
        this.couponsValue = couponsValue;
        this.couponsRequire = couponsRequire;
        this.couponsGoodsId = couponsGoodsId;
        this.couponsState = couponsState;
        this.couponsStartTime = couponsStartTime;
        this.couponsUseTime = couponsUseTime;
        this.couponsDesc = couponsDesc;
    }

    public Coupons() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Integer getCouponsType() {
        return couponsType;
    }

    public void setCouponsType(Integer couponsType) {
        this.couponsType = couponsType;
    }

    public Integer getCouponsValue() {
        return couponsValue;
    }

    public void setCouponsValue(Integer couponsValue) {
        this.couponsValue = couponsValue;
    }

    public Integer getCouponsRequire() {
        return couponsRequire;
    }

    public void setCouponsRequire(Integer couponsRequire) {
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

    public Long getCouponsStartTime() {
        return couponsStartTime;
    }

    public void setCouponsStartTime(Long couponsStartTime) {
        this.couponsStartTime = couponsStartTime;
    }

    public Long getCouponsUseTime() {
        return couponsUseTime;
    }

    public void setCouponsUseTime(Long couponsUseTime) {
        this.couponsUseTime = couponsUseTime;
    }

    public String getCouponsDesc() {
        return couponsDesc;
    }

    public void setCouponsDesc(String couponsDesc) {
        this.couponsDesc = couponsDesc == null ? null : couponsDesc.trim();
    }
}