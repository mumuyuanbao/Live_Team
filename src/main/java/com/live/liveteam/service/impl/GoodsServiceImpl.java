package com.live.liveteam.service.impl;


import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.entity.Goods;
import com.live.liveteam.entity.GoodsExample;
import com.live.liveteam.mapper.GoodsMapper;
import com.live.liveteam.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 作者：木木豹
 * 时间2019-09-10 20:48
 * 描述：
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    /**
     * 按条件查询商品列表
     * @param pageNum
     * @param pageSize
     * @param keyName
     * @param typeOne
     * @param typeTwo
     * @return
     */
    @Override
    public ResultVO<Goods> qureyGoodsList(Integer pageNum, Integer pageSize, String keyName, String typeOne, String typeTwo) {
        //商品必然属于二级分类，搜索一级分类先搜索一级分类下二级分类的ID，再搜索所有二级分类ID
        Map<String,Object> map = new HashMap<String,Object>();
        if (keyName!=null&&keyName.length()>0){
            map.put("g_name",keyName);
        }
        if (typeOne!=null){
//            map.put("")
        }



        return null;
    }
}
