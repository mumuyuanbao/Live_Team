package com.live.liveteam.service;

import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.result.SimpleResultVO;
import com.live.liveteam.vo.CouponVO;

import java.util.List;
import java.util.Map;

/**
 * 作者: XW
 * 时间: 2019/9/10 11:15
 * 描述:
 */
public interface CouponsService {

    ResultVO<Long> queryCouponsNumber(String openId, String goodsId, Long priceTotal);

    ResultVO<List<CouponVO>> queryCouponsAll(String openId, Integer couponStatus, String goodsId, Long priceTotal);

    SimpleResultVO updateCouponsToUsed(Long id);

    SimpleResultVO updateCouponsToUunsed(Long id);
}
