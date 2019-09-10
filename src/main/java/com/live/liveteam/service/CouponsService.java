package com.live.liveteam.service;

import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.result.SimpleResultVO;

import java.util.Map;

/**
 * 作者: XW
 * 时间: 2019/9/10 11:15
 * 描述:
 */
public interface CouponsService {

    ResultVO<Integer> queryCouponsUsefulNumber(String openId);

    ResultVO<Map> queryCouponsAll(String openId);

//    ResultVO<Integer> queryCouponsOrderUsefulNumber();

//    ResultVO<List> queryCouponsOrderUserful();

    SimpleResultVO updateCouponsToUsed(Long id);

    SimpleResultVO insertCouponsTypeReduce(String openId, Integer value, Integer threshold);

    SimpleResultVO insertCouponsTypeExchange(String openId, Long goodsId);

}
