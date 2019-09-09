package com.live.liveteam.entity;

public class UserLevelRight {
    private Integer id;

    private String levelName;

    private Integer rightCouponsNumber;

    private Integer rightCouponsValue;

    private Long rightCouponsTimeout;

    private Integer rightBirthGift;

    private Integer rightScoreRatio;

    private Integer rightDiscount;

    public UserLevelRight(Integer id, String levelName, Integer rightCouponsNumber, Integer rightCouponsValue, Long rightCouponsTimeout, Integer rightBirthGift, Integer rightScoreRatio, Integer rightDiscount) {
        this.id = id;
        this.levelName = levelName;
        this.rightCouponsNumber = rightCouponsNumber;
        this.rightCouponsValue = rightCouponsValue;
        this.rightCouponsTimeout = rightCouponsTimeout;
        this.rightBirthGift = rightBirthGift;
        this.rightScoreRatio = rightScoreRatio;
        this.rightDiscount = rightDiscount;
    }

    public UserLevelRight() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
    }

    public Integer getRightCouponsNumber() {
        return rightCouponsNumber;
    }

    public void setRightCouponsNumber(Integer rightCouponsNumber) {
        this.rightCouponsNumber = rightCouponsNumber;
    }

    public Integer getRightCouponsValue() {
        return rightCouponsValue;
    }

    public void setRightCouponsValue(Integer rightCouponsValue) {
        this.rightCouponsValue = rightCouponsValue;
    }

    public Long getRightCouponsTimeout() {
        return rightCouponsTimeout;
    }

    public void setRightCouponsTimeout(Long rightCouponsTimeout) {
        this.rightCouponsTimeout = rightCouponsTimeout;
    }

    public Integer getRightBirthGift() {
        return rightBirthGift;
    }

    public void setRightBirthGift(Integer rightBirthGift) {
        this.rightBirthGift = rightBirthGift;
    }

    public Integer getRightScoreRatio() {
        return rightScoreRatio;
    }

    public void setRightScoreRatio(Integer rightScoreRatio) {
        this.rightScoreRatio = rightScoreRatio;
    }

    public Integer getRightDiscount() {
        return rightDiscount;
    }

    public void setRightDiscount(Integer rightDiscount) {
        this.rightDiscount = rightDiscount;
    }
}