package com.live.liveteam.service;


import com.live.liveteam.common.result.PageVO;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.result.SimpleResultVO;
import com.live.liveteam.entity.OrderDetails;
import com.live.liveteam.entity.Orders;
import com.live.liveteam.vo.OrderDetailsVO;
import com.live.liveteam.vo.OrderListVO;

import java.util.List;

public interface OrdersService {
    ResultVO<PageVO<OrderListVO>> queryOrderList(Integer pageNum, Integer pageSize, String openId, Integer orderStatus);

    SimpleResultVO dropOrder(String orderNum);

    SimpleResultVO updateOrder(String orderNum,String orderCancelCause);

    ResultVO<OrderDetailsVO> selectOrderDetails(String orderNum);

    SimpleResultVO insertOrder(String openId, Integer addressId, Long priceTotal, String couponsIds, Long orderScore, Long orderCouponsPrice, String goodsId, String goodsNum, String goodsUrls);
}
