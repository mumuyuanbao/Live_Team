package com.live.liveteam.service;

import com.github.pagehelper.PageInfo;
import com.live.liveteam.common.result.PageVO;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.result.SimpleResultVO;
import com.live.liveteam.entity.Goods;
import com.live.liveteam.entity.GoodsSnapUp;
import com.live.liveteam.vo.GoodsDetailVO;
import com.live.liveteam.vo.GoodsListVO;

import java.util.List;

public interface GoodsService {
    ResultVO<PageVO<GoodsListVO>> qureyGoodsList(Integer pageNum, Integer pageSize, String keyName);

    ResultVO<PageVO<Goods>> queryTypeOne(Integer pageNum,Integer pageSize,Long typeOne,Long typeTwo);

    ResultVO<List<String>> querySearchRecord(String token);

    ResultVO<PageVO<Goods>> queryTypeTwo(Integer typeTwo);

    ResultVO<GoodsDetailVO> queryGoodsDetail(Long gId, Integer isSnapUpGoods);

    ResultVO<List<GoodsSnapUp>> queryGoodsSnapUp();

    SimpleResultVO dropSearchRecord(String token);

    ResultVO<List<Goods>> queryGoodsOnlyChoose();

    ResultVO<List<Goods>> queryNewGoods();
}
