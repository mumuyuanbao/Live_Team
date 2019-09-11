package com.live.liveteam.controller;

import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.service.GoodsTypeService;
import com.live.liveteam.vo.GoodsTypeNameVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 作者：张钰磊
 * 时间2019/9/8 14:03
 * 描述商品无级分类
 */
@Api(description = "商品分类")
@RestController
@RequestMapping("goodsType")
public class GoodsTypeController {

    @Autowired
    private GoodsTypeService goodsTypeService;

        @PostMapping("firstclassify")
        @ApiOperation(value = "获取一级分类")
        public ResultVO<List<GoodsTypeNameVO>> firstClassify(){
            return  goodsTypeService.queryTypeList();
         }


    @GetMapping("secondclassify")
    @ApiOperation(value = "获取二级分类")
    @ApiImplicitParam(name = "pId", value = "pid（父类）", dataType = "String", paramType = "query")
    public ResultVO<List<GoodsTypeNameVO>> secondClassify(long pId){
        return goodsTypeService.querySecondTypeList(pId);
    }


}
