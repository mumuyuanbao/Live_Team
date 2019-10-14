package com.live.liveteam.common.enums;

import io.swagger.models.auth.In;

/**
 * 作者: XW
 * 时间: 2019/9/9 11:02
 * 描述: 积分发生变化的方式枚举类
 */
public enum EnumScoreDetailInfo {

    // -------------------------- 获得积分的类型 -----------------------
    // 通过注册方式获得
    GET_FROM_REGIST(1, "首次注册"),
    // 通过邀请好友获得
    GET_FROM_INVITE_USER(2, "邀请好友"),
    // 通过分享商品获得
    GET_FROM_SHARE_GOODS(3, "分享商品"),
    // -------------------------- 失去积分的类型 -----------------------
    // 通过商品消费失去
    LOSE_BY_BUY_GOODS(4, "订单消费")
    ;

    private String info;

    private Integer id;

    private EnumScoreDetailInfo() {}

    private EnumScoreDetailInfo(Integer id, String info) {
        this.id = id;
        this.info = info;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
