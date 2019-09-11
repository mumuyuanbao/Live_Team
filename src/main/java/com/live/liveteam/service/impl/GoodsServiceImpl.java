package com.live.liveteam.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.utils.CopyPropertiesUtils;
import com.live.liveteam.common.utils.LiveCollectionUtil;
import com.live.liveteam.common.utils.LiveStringUtil;
import com.live.liveteam.entity.Goods;
import com.live.liveteam.entity.GoodsExample;
import com.live.liveteam.entity.UserExample;
import com.live.liveteam.mapper.GoodsMapper;
import com.live.liveteam.service.GoodsService;
import com.live.liveteam.vo.GoodsListVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.Name;
import javax.swing.*;
import java.util.HashMap;
import java.util.List;
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
     * @param type
     * @return
     */
    @Override
    public ResultVO<PageInfo<GoodsListVO>> qureyGoodsList(Integer pageNum, Integer pageSize, String keyName, Long type) {
        ResultVO<PageInfo<GoodsListVO>> result = new ResultVO<PageInfo<GoodsListVO>>();
        //商品必然属于二级分类，搜索一级分类先搜索一级分类下二级分类的ID，再搜索所有二级分类ID
                GoodsExample goodsExample =  new GoodsExample();
            GoodsExample.Criteria criteria = goodsExample.createCriteria();
            if (keyName!=null&&keyName.length()>0){
                String key = keyName+"%";
                criteria.andGNameLike(key);
            }
            //根据二级分类查询
            if (type!=null){
                criteria.andGTypeIdEqualTo(type);
            }
            PageHelper.startPage(pageNum,pageSize);
            List<Goods> goods = goodsMapper.selectByExample(goodsExample);
            List<GoodsListVO> goodsListVOS = CopyPropertiesUtils.dataConversion(goods, GoodsListVO.class);
            System.out.println(goodsListVOS);

            return null;
    }
}
