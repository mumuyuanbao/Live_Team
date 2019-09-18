package com.live.liveteam.controller;

import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.result.SimpleResultVO;
import com.live.liveteam.service.ShoppingCarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * author:许承斌
 * date:2019/9/10 11:57
 * description:
 */
@Api(description = "购物车接口")
@RestController
@RequestMapping("shoppingcar")
public class ShoppingCarController {

    @Autowired
    private ShoppingCarService shoppingCarService;

    @ApiOperation("购物车添加商品")
    @PostMapping("add")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "openId", value = "openId", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "goodsId", value = "商品id", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "goodsNum", value = "商品数量", dataType = "String", paramType = "query")
    })
    public ResultVO carAdd(String openId, String goodsId, String goodsNum){

        return  shoppingCarService.insertShoppingCar(openId,goodsId,goodsNum);
    }

    @ApiOperation("购物车删除商品")
    @PostMapping("drop")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "openId", value = "openId", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "goodsIds", value = "商品id的集合,只删除单个商品集合中就放一个商品id", dataType = "String", paramType = "query"),
    })
    public ResultVO carDrop(String openId, String goodsIds){
        return shoppingCarService.dropShoppingCar(openId,goodsIds);
    }

    @ApiOperation("购物车修改商品数量")
    @PostMapping("update")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "openId", value = "openId", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "goodsId", value = "商品id", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "goodsNum", value = "商品数量", dataType = "String", paramType = "query")
    })
    public ResultVO carUpdate(String openId, String goodsId, String goodsNum){
        return shoppingCarService.updateShoppingCar(openId,goodsId,goodsNum);
    }

    @ApiOperation("查询购物车")
    @PostMapping("query")
    public ResultVO carQuery(String openId){
        return shoppingCarService.queryShoppingCar(openId);
    }
}
