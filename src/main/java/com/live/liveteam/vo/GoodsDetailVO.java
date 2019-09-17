package com.live.liveteam.vo;


import com.live.liveteam.entity.Goods;
import com.live.liveteam.entity.GoodsDetail;
import com.live.liveteam.entity.GoodsMadeUp;

import java.util.List;
import java.util.Map;

/**
 * 作者：木木豹
 * 时间2019-09-16 19:20
 * 描述：商品详情表
 */
public class GoodsDetailVO {

    private Goods goods;
    private GoodsDetail goodsDetail;
    private Map<String,List<GoodsMadeUp>> goodsMadeUps;


    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public GoodsDetail getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(GoodsDetail goodsDetail) {
        this.goodsDetail = goodsDetail;
    }

    public Map<String, List<GoodsMadeUp>> getGoodsMadeUps() {
        return goodsMadeUps;
    }

    public void setGoodsMadeUps(Map<String, List<GoodsMadeUp>> goodsMadeUps) {
        this.goodsMadeUps = goodsMadeUps;
    }
}
