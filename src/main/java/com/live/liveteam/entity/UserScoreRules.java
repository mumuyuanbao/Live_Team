package com.live.liveteam.entity;

public class UserScoreRules {
    private Integer id;

    private String ruleDesc;

    private Integer ruleValue;

    private Integer ruleType;

    private Long updateTime;

    public UserScoreRules(Integer id, String ruleDesc, Integer ruleValue, Integer ruleType, Long updateTime) {
        this.id = id;
        this.ruleDesc = ruleDesc;
        this.ruleValue = ruleValue;
        this.ruleType = ruleType;
        this.updateTime = updateTime;
    }

    public UserScoreRules() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc == null ? null : ruleDesc.trim();
    }

    public Integer getRuleValue() {
        return ruleValue;
    }

    public void setRuleValue(Integer ruleValue) {
        this.ruleValue = ruleValue;
    }

    public Integer getRuleType() {
        return ruleType;
    }

    public void setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}