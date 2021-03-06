package com.live.liveteam.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("积分明细")
public class UserScoreDetail {
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("用户openId")
    private String openId;
    @ApiModelProperty("积分改变的值")
    private Integer scoreValue;
    @ApiModelProperty("积分获得方式")
    private String scoreGetWay;
    @ApiModelProperty("积分获得时间")
    private Long scoreGetTime;

    public UserScoreDetail() {
    }

    public UserScoreDetail(Long id, String openId, Integer scoreValue, String scoreGetWay, Long scoreGetTime) {
        this.id = id;
        this.openId = openId;
        this.scoreValue = scoreValue;
        this.scoreGetWay = scoreGetWay;
        this.scoreGetTime = scoreGetTime;
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

    public Integer getScoreValue() {
        return scoreValue;
    }

    public void setScoreValue(Integer scoreValue) {
        this.scoreValue = scoreValue;
    }

    public String getScoreGetWay() {
        return scoreGetWay;
    }

    public void setScoreGetWay(String scoreGetWay) {
        this.scoreGetWay = scoreGetWay == null ? null : scoreGetWay.trim();
    }

    public Long getScoreGetTime() {
        return scoreGetTime;
    }

    public void setScoreGetTime(Long scoreGetTime) {
        this.scoreGetTime = scoreGetTime;
    }

    @Override
    public String toString() {
        return "UserScoreDetail{" +
                "id=" + id +
                ", openId='" + openId + '\'' +
                ", scoreValue=" + scoreValue +
                ", scoreGetWay='" + scoreGetWay + '\'' +
                ", scoreGetTime=" + scoreGetTime +
                '}';
    }
}