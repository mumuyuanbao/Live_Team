package com.live.liveteam.controller;


import com.github.pagehelper.PageInfo;
import com.live.liveteam.common.enums.EnumResult;
import com.live.liveteam.common.result.PageVO;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.result.SimpleResultVO;
import com.live.liveteam.common.utils.UserUtil;
import com.live.liveteam.entity.Goods;
import com.live.liveteam.entity.GoodsSnapUp;
import com.live.liveteam.entity.User;
import com.live.liveteam.service.GoodsService;
import com.live.liveteam.vo.GoodsDetailVO;
import com.live.liveteam.vo.GoodsListVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.hamcrest.core.Is;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 作者：木木豹
 * 时间2019-09-10 20:24
 * 描述：商品列表
 */
@Api(description = "商品列表")
@RestController
@RequestMapping("goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;
    /**
     * 获取商品列表|按条件搜索
     */
    @ApiOperation(value = "搜索商品列表")
    @GetMapping("qureyGoodsList")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页条数", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "keyName", value = "商品关键字", dataType = "String", paramType = "query")
    })
    public ResultVO<PageVO<GoodsListVO>> qureyGoodsList(Integer pageNum, Integer pageSize, String keyName) {

        return goodsService.qureyGoodsList(pageNum,pageSize,keyName) ;
    }

    /**
     * 获取商品详情
     */
    @ApiOperation(value = "获取分类商品列表")
    @GetMapping("queryTypeOne")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页条数", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "typeOne", value = "商品所属分类-一级分类(一级或二级只能传一个)", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "typeTwo", value = "商品所属分类-二级分类", dataType = "int", paramType = "query")
    })
    public ResultVO<PageVO<Goods>> queryTypeOne(Integer pageNum,Integer pageSize,Long typeOne,Long typeTwo) {

        return goodsService.queryTypeOne(pageNum,pageSize,typeOne,typeTwo);
    }

    /**
     * 获取商品详情
     */
    @ApiOperation(value = "获取商品详情")
    @GetMapping("queryGoodsDetail")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "gId", value = "商品ID", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "isSnapUpGoods", value = "是否为抢购商品 0-是 1-否", dataType = "int", paramType = "query")
    })
    public ResultVO<GoodsDetailVO> queryGoodsDetail(@RequestParam(value = "gId",required = true)Long gId,@RequestParam(value = "isSnapUpGoods",required = true) Integer isSnapUpGoods) {

        return goodsService.queryGoodsDetail(gId,isSnapUpGoods);
    }

    /**
     * 获取搜索历史
     */
    @ApiOperation(value = "获取个人搜索历史")
    @GetMapping("querySearchRecord")
    public ResultVO<List<String>> querySearchRecord(String token) {
        return goodsService.querySearchRecord(token);
    }

    /**
     * 获取搜索历史
     */
    @ApiOperation(value = "清空个人搜索历史")
    @GetMapping("dropSearchRecord")
    public SimpleResultVO dropSearchRecord(String token) {
        return goodsService.dropSearchRecord(token);
    }

    /**
     * 获取抢购商品
     */
    @ApiOperation(value = "获取抢购商品")
    @GetMapping("queryGoodsSnapUp")
    public ResultVO<List<GoodsSnapUp>> queryGoodsSnapUp() {
        return goodsService.queryGoodsSnapUp();
    }

    /**
     * 获取精选商品 先查缓存，后台每次更新删除缓存，缓存失效，查询数据库，更新缓存
     */
    @ApiOperation(value = "获取精选商品")
    @GetMapping("queryGoodsOnlyChoose")
    public ResultVO<List<Goods>> queryGoodsOnly() {
        return goodsService.queryGoodsOnlyChoose();
    }

    /**
     * 获取新品 3个
     */
    @ApiOperation(value = "获取新品")
    @GetMapping("queryNewGoods")
    public ResultVO<List<Goods>> queryNewGoods() {
        return goodsService.queryNewGoods();
    }


}
