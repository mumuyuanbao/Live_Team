package com.live.liveteam.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.live.liveteam.common.constant.BizConstant;
import com.live.liveteam.common.enums.EnumResult;
import com.live.liveteam.common.result.PageVO;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.utils.LiveStringUtil;
import com.live.liveteam.entity.Orders;
import com.live.liveteam.entity.OrdersExample;
import com.live.liveteam.mapper.OrdersMapper;
import com.live.liveteam.service.OrdersService;
import com.live.liveteam.vo.OrderListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.lang.model.element.VariableElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 作者：木木豹
 * 时间2019-09-08 13:28
 * 描述：订单服务类
 */
@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;


    /**
     * 查询用户订单列表
     *
     * @param pageNum
     * @param pageSize
     * @param openId
     * @param orderStatus
     * @return
     */
    @Override
    public ResultVO<PageVO<OrderListVO>> queryOrderList(Integer pageNum, Integer pageSize, String openId, Integer orderStatus) {
        ResultVO<PageVO<OrderListVO>> result = new ResultVO<PageVO<OrderListVO>>();

        PageVO<OrderListVO> page = new PageVO<OrderListVO>();
        PageVO<Orders> page2 = new PageVO<Orders>();
        OrdersExample orderExample = new OrdersExample();
//        按创建时间排序
        orderExample.setOrderByClause("create_time");
        OrdersExample.Criteria criteria = orderExample.createCriteria();
        //查询的订单状态
        Integer i = orderStatus.intValue();

        criteria.andOrderStatusEqualTo(orderStatus);
        //订单是否显示
        criteria.andIsShowEqualTo(1);

        PageHelper.startPage(pageNum, pageSize);
        List<Orders> orders = ordersMapper.selectByExample(orderExample);
        PageInfo<Orders> pageInfo = new PageInfo<>(orders);
        page2.savePageinfo(pageInfo);
        List<OrderListVO> vos = new ArrayList<>();
        if (orders != null) {
            for (Orders order : orders) {
                OrderListVO orderListVO = new OrderListVO();
                orderListVO.setCreateTime(order.getCreateTime());
                orderListVO.setOrderGoodsNum(order.getOrderGoodsNum());
                orderListVO.setOrderNum(order.getOrderNum());
                orderListVO.setOrderPriceTotal(order.getOrderPriceTotal());
                orderListVO.setOrderStauts(order.getOrderStatus());
                List<String> urls = LiveStringUtil.splitToString(order.getGoodsUrls(), ",");
                orderListVO.setGoodsUrls(urls);
                vos.add(orderListVO);
            }
        }

        page.setData(vos);
        page.setCurrentPage(page2.getCurrentPage());
        page.setPages(page2.getPages());
        page.setPageSize(page2.getPageSize());
        page.setSize(page2.getSize());
        page.setTotalCount(page.getTotalCount());
        result.setData(page);
        result.setCode(EnumResult.SUCCESS.getCode());
        result.setMsg(EnumResult.SUCCESS.getMsg());
        return result;
    }
}
