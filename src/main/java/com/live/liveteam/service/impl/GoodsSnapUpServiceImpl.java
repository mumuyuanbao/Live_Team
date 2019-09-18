package com.live.liveteam.service.impl;


import com.live.liveteam.entity.GoodsSnapUp;
import com.live.liveteam.entity.GoodsSnapUpExample;
import com.live.liveteam.mapper.GoodsSnapUpMapper;
import com.live.liveteam.service.GoodsSnapUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：木木豹
 * 时间2019-09-17 20:43
 * 描述：商品抢购表
 */
@Service
public class GoodsSnapUpServiceImpl implements GoodsSnapUpService {
    @Autowired
    private GoodsSnapUpMapper goodsSnapUpMapper;
    /**
     * 从数据库获取抢购商品
     * @return
     */
    @Override
    public List<GoodsSnapUp> queryGoodsSnapList() {
        GoodsSnapUpExample goodsSnapUpExample = new GoodsSnapUpExample();
        GoodsSnapUpExample.Criteria criteria = goodsSnapUpExample.createCriteria();
        criteria.andGStatusEqualTo((byte) 0);
        List<GoodsSnapUp> list = goodsSnapUpMapper.selectByExample(goodsSnapUpExample);
        if (list.size()<2){
            //如果抢购商品少于2个 随便补上一个常用抢购商品
        }
        return list;
    }
}
