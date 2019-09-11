package com.live.liveteam.controller;

import com.live.liveteam.common.result.SimpleResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:许承斌
 * date:2019/9/10 11:57
 * description:
 */
@Api(description = "购物车接口")
@RestController
@RequestMapping("shoppingcar")
public class ShoppingCar {

    @ApiOperation("购物车添加商品")
    @PostMapping("carAdd")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "openId", value = "openId", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "goodsId", value = "商品id", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "goodsNum", value = "商品数量", dataType = "String", paramType = "query")
    })
    public SimpleResultVO carAdd(String openId,String goodsId,String goodsNum){

        return  null;
    }
}
