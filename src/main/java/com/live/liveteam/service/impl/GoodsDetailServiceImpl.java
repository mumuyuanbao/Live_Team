package com.live.liveteam.service.impl;


import com.live.liveteam.entity.GoodsDetail;
import com.live.liveteam.entity.GoodsDetailExample;
import com.live.liveteam.mapper.GoodsDetailMapper;
import com.live.liveteam.service.GoodsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 作者：木木豹
 * 时间2019-09-16 19:25
 * 描述：
 */
@Service
public class GoodsDetailServiceImpl implements GoodsDetailService {

    /**
     * 根据商品ID获取商品详细信息
     * @param gId
     * @return
     */
    @Autowired
    private GoodsDetailMapper goodsDetailMapper;
    @Override
    public GoodsDetail selectByGId(Long gId) {
        GoodsDetail goodsDetail = goodsDetailMapper.selectByGId(gId);
        return goodsDetail;
    }
}
