package com.live.liveteam.service;

import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.entity.Goods;

public interface GoodsService {
    ResultVO<Goods> qureyGoodsList(Integer pageNum, Integer pageSize, String keyName, String typeOne, String typeTwo);
}
