package com.live.liveteam.vo;


import io.swagger.annotations.ApiModelProperty;

/**
 * 作者：木木豹
 * 时间2019-09-07 11:29
 * 描述：
 */
public class UpdateUserVO {
    @ApiModelProperty(value = "头像地址URL", required = true)
    private String avatarUrl;
    /**
     * 性别
     */
    @ApiModelProperty(value = "性别0-女 1-男", required = true)
    private Integer gender;
    /**
     * 网名
     */
    @ApiModelProperty(value = "用户名", required = true)
    private String nickName;
    /**
     * 用户生日时间戳
     */
    @ApiModelProperty(value = "用户生日-只允许修改一次", required = true)
    private Long userBirthday;


    @ApiModelProperty("用户生日是否可修改  默认只能修改一次 0-可修改 1不可修改")
    private boolean userIsNot;

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Long getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Long userBirthday) {
        this.userBirthday = userBirthday;
    }

    public boolean isUserIsNot() {
        return userIsNot;
    }

    public void setUserIsNot(boolean userIsNot) {
        this.userIsNot = userIsNot;
    }
}
