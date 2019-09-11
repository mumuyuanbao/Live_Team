package com.live.liveteam.controller;


import com.github.pagehelper.PageInfo;
import com.live.liveteam.common.enums.EnumResult;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.utils.UserUtil;
import com.live.liveteam.entity.Goods;
import com.live.liveteam.entity.User;
import com.live.liveteam.service.GoodsService;
import com.live.liveteam.vo.GoodsListVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者：木木豹
 * 时间2019-09-10 20:24
 * 描述：商品列表
 */
@Api("商品列表")
@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;
    /**
     * 获取商品列表|按条件搜索
     */
    @ApiOperation(value = "获取商品列表")
    @GetMapping("qureyGoodsList")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页条数", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "keyName", value = "商品关键字", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "type", value = "商品所属分类", dataType = "String", paramType = "query")
    })
    public ResultVO<PageInfo<GoodsListVO>> qureyGoodsList(Integer pageNum, Integer pageSize, String keyName, Long type) {

        return goodsService.qureyGoodsList(pageNum,pageSize,keyName,type) ;
    }

    /**
     * 获取商品详情
     */
    @ApiOperation(value = "获取商品详情")
    @GetMapping("queryGoodsDetail")
    public ResultVO<Goods> queryGoodsDetail(String token) {

        return null;
    }

    /**
     * 获取搜索历史
     */
    @ApiOperation(value = "获取搜索历史")
    @GetMapping("querySearchRecord")
    public ResultVO<Goods> querySearchRecord(String token) {

        return null;
    }

}
