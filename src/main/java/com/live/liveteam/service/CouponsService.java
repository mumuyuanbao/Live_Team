package com.live.liveteam.service;

import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.result.SimpleResultVO;

import java.util.List;
import java.util.Map;

/**
 * 作者: XW
 * 时间: 2019/9/10 11:15
 * 描述:
 */
public interface CouponsService {

    ResultVO<Integer> queryCouponsUsefulNumber(String openId);

    ResultVO<Map> queryCouponsAll(String openId);

    ResultVO<Long> queryCouponsOrderUsefulNumber(String openid, String goodsId);

    ResultVO<List> queryCouponsOrderUseful(String openid, String goodsId);

    SimpleResultVO updateCouponsToUsed(Long id);

    SimpleResultVO insertCouponsTypeReduce(String openId, Integer value, Integer threshold);

    SimpleResultVO insertCouponsTypeExchange(String openId, Long goodsId);

}
