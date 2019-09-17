package com.live.liveteam.entity;

public class ShoppingCar {
    private Long id;

    private Long userId;

    private Long gId;

    private Long gNum;

    private Long createTime;

    private Long updateTime;

    public ShoppingCar(Long id, Long userId, Long gId, Long gNum, Long createTime, Long updateTime) {
        this.id = id;
        this.userId = userId;
        this.gId = gId;
        this.gNum = gNum;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public ShoppingCar() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getgId() {
        return gId;
    }

    public void setgId(Long gId) {
        this.gId = gId;
    }

    public Long getgNum() {
        return gNum;
    }

    public void setgNum(Long gNum) {
        this.gNum = gNum;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}