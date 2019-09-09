package com.live.liveteam.service;


import com.live.liveteam.common.result.PageVO;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.entity.Orders;
import com.live.liveteam.vo.OrderListVO;

public interface OrdersService {
    ResultVO<PageVO<OrderListVO>> queryOrderList(Integer pageNum, Integer pageSize, String openId, Integer orderStatus);
}
