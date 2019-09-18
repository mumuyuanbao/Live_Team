package com.live.liveteam.service;

import com.live.liveteam.common.result.ResultVO;

import java.util.List;

/**
 * author:许承斌
 * date:2019/9/11 21:16
 * description:
 */

public interface ShoppingCarService {
    ResultVO insertShoppingCar(String openId, String goodsId, String goodsNum);

    ResultVO dropShoppingCar(String openId, String goodsIds);

    ResultVO updateShoppingCar(String openId, String goodsId, String goodsNum);

    ResultVO queryShoppingCar(String openId);
}
