package com.live.liveteam.common.exception;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.live.liveteam.common.enums.EnumResult;

/**
 * 自定义异常
 */
public class CustomException extends RuntimeException {

    private Integer code;

    /**
     * 通用异常
     * @param resultEnum
     */
    public CustomException(EnumResult resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    /**
     * 非通用异常
     * @param code 异常码
     * @param msg 异常信息
     */
    public CustomException(Integer code,String msg) {
        super(msg);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
