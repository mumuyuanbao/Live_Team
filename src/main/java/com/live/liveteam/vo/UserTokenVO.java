package com.live.liveteam.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 作者：木木豹
 * 时间2019-09-10 15:18
 * 描述：
 */
@ApiModel("登录返回用户标识")
public class UserTokenVO {
    @ApiModelProperty("用户token（每次登录会更新，token=openId）")
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
