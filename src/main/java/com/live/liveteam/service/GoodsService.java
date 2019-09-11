package com.live.liveteam.service;

import com.github.pagehelper.PageInfo;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.entity.Goods;
import com.live.liveteam.vo.GoodsListVO;

public interface GoodsService {
    ResultVO<PageInfo<GoodsListVO>> qureyGoodsList(Integer pageNum, Integer pageSize, String keyName, Long type);
}
