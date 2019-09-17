package com.live.liveteam.vo;

import com.live.liveteam.entity.Goods;

/**
 * author:许承斌
 * date:2019/9/12 11:39
 * description:
 */
public class ShoppingCarVO {
    private Long userId;

    private Long gId;

    private Long gNum;

    private Long createTime;

    private Long updateTime;

    private Goods goods;

    public ShoppingCarVO() {
    }

    public ShoppingCarVO(Long userId, Long gId, Long gNum, Long createTime, Long updateTime, Goods goods) {
        this.userId = userId;
        this.gId = gId;
        this.gNum = gNum;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.goods = goods;
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

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}
