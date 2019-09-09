package com.live.liveteam.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.live.liveteam.common.constant.BizConstant;
import com.live.liveteam.common.enums.EnumResult;
import com.live.liveteam.common.exception.BizException;
import com.live.liveteam.common.result.PageVO;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.result.SimpleResultVO;
import com.live.liveteam.common.utils.DateUtils;
import com.live.liveteam.common.utils.LiveStringUtil;
import com.live.liveteam.common.utils.OrderNumUtils;
import com.live.liveteam.entity.*;
import com.live.liveteam.mapper.OrderDetailsMapper;
import com.live.liveteam.mapper.OrdersMapper;
import com.live.liveteam.service.OrderDetailsService;
import com.live.liveteam.service.OrdersService;
import com.live.liveteam.vo.OrderDetailsVO;
import com.live.liveteam.vo.OrderListVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.lang.model.element.VariableElement;
import java.util.ArrayList;
import java.util.Date;
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

   @Autowired
   private   OrderDetailsMapper  orderDetailsMapper;
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

    /**
     * 删除订单
     * @param orderNum
     * @return
     */
    @Override
    public SimpleResultVO dropOrder(String orderNum) {
        SimpleResultVO result= new SimpleResultVO();
        if (orderNum==null){
            throw  new BizException(EnumResult.NO_EXIST_ORDER.getCode(),EnumResult.NO_EXIST_ORDER.getMsg());
        }
        Orders orders = ordersMapper.selectByPrimaryKey(orderNum);
        if (orders==null||orders.getOrderStatus()<4){
            throw  new BizException(EnumResult.ORDER_FOR_COMPLETION.getCode(),EnumResult.ORDER_FOR_COMPLETION.getMsg());
        }
        orders.setIsShow(0);
        orders.setOrderUpdate(DateUtils.getTimeStamp());
        ordersMapper.updateByPrimaryKey(orders);
        result.setCode(EnumResult.SUCCESS.getCode());
        result.setMsg(EnumResult.SUCCESS.getMsg());
        return result;
    }
    /**
     * 取消订单
     * @param orderNum
     * @return
     */
    @Override
    public SimpleResultVO updateOrder(String orderNum,String orderCancelCause) {
        SimpleResultVO result= new SimpleResultVO();
        if (orderNum==null){
            throw  new BizException(EnumResult.NO_EXIST_ORDER.getCode(),EnumResult.NO_EXIST_ORDER.getMsg());
        }
        Orders orders = ordersMapper.selectByPrimaryKey(orderNum);
        if (orders==null||orders.getOrderStatus()<4){
            throw  new BizException(EnumResult.ORDER_FOR_COMPLETION.getCode(),EnumResult.ORDER_FOR_COMPLETION.getMsg());
        }
        //修改订单状态
        orders.setOrderStatus(5);
        //设置修改时间
        orders.setOrderUpdate(DateUtils.getTimeStamp());
        //设置取消时间
        orders.setOrderCancelTime(DateUtils.getTimeStamp());
        //设置取消原因
        if (orderCancelCause!=null){
            orders.setOrderCancelCause(orderCancelCause);
        }

        //取消订单-判断优惠券是否过期，无过期激活已使用优惠券返回用户

        //取消订单-返回订单使用积分

        //取消订单，增加销售库存

        ordersMapper.updateByPrimaryKey(orders);
        result.setCode(EnumResult.SUCCESS.getCode());
        result.setMsg(EnumResult.SUCCESS.getMsg());
        return result;
    }

    /**
     *获取订单详情
     * @param orderNum
     * @return
     */
    @Override
    public ResultVO<OrderDetailsVO> selectOrderDetails(String orderNum) {
        ResultVO<OrderDetailsVO> result = new ResultVO<OrderDetailsVO>();
        //获取订单
        Orders orders = ordersMapper.selectByPrimaryKey(orderNum);
        //查询订单详情
        OrderDetailsExample orderDetailsExample = new OrderDetailsExample();
        OrderDetailsExample.Criteria criteria = orderDetailsExample.createCriteria();
        criteria.andOrderNumEqualTo(orderNum);
        List<OrderDetails> orderDetails = orderDetailsMapper.selectByExample(orderDetailsExample);

        OrderDetailsVO orderDetailsVO = new OrderDetailsVO();

        //将查询到的订单信息赋值
        BeanUtils.copyProperties(orderDetailsVO,orders);
        //订单商品详情赋值
        orderDetailsVO.setOrderDetailsList(orderDetails);

        result.setCode(EnumResult.SUCCESS.getCode());
        result.setMsg(EnumResult.SUCCESS.getMsg());
        return result;
    }
    /**
     * 创建订单
     * @param openId
     * @param addressId
     * @param priceTotal
     * @param couponsIds
     * @param orderScore
     * @param orderCouponsPrice
     * @param goodsId
     * @param goodsNum
     * @return
     */
    @Override
    @Transactional
    public SimpleResultVO insertOrder(String openId, Integer addressId, Long priceTotal, String couponsIds, Long orderScore, Long orderCouponsPrice, String goodsId, String goodsNum, String goodsUrls) {
        SimpleResultVO result = new SimpleResultVO();
        Orders orders = Orders.newUserEntity();
        boolean isNum=true;
        String orderIdByUUId="";
        while (isNum){
            //生成唯一订单号
            orderIdByUUId = OrderNumUtils.getOrderIdByUUId();
            //根据订单查询数据库是否有此订单编号
            Orders os = ordersMapper.selectByPrimaryKey(orderIdByUUId);
            //如果为null结束循环
            if (os==null){
                isNum=false;
            }
        }
        //插入订单编号
        orders.setOrderNum(orderIdByUUId);
        //插入openid
        orders.setOpenId(openId);
        orders.setAddressId(Long.valueOf(addressId));
        //订单总价格
        orders.setOrderPriceTotal(priceTotal);
        /*--------判断优惠券ID是否都可用 掉优惠券接口-------*/
        List<Long> longs = LiveStringUtil.splitToLong(couponsIds, ",");
        //如果有不可用---抛出异常，订单状态设为已取消

        //如果可用
        orders.setCouponsIds(couponsIds);
        orders.setOrderScore(Math.toIntExact(orderScore));
        //订单优惠价格
        orders.setOrderCouponsPrice(orderCouponsPrice);
        orders.setGoodsUrls(goodsUrls);
        orders.setOrderGoodsNum(Long.valueOf(goodsNum));


        List<OrderDetails> orderDetailsList = new ArrayList<OrderDetails>();
        List<Long> gIds = LiveStringUtil.splitToLong(goodsId, ",");
        List<Integer> gNum = LiveStringUtil.splitToInteger(goodsNum, ",");
        List<String> gUrls= LiveStringUtil.splitToString(goodsUrls, ",");
        for (int i=0;i<gIds.size();i++) {
            OrderDetails orderDetails = new OrderDetails();
            orderDetails.setOrderNum(orderIdByUUId);
            orderDetails.setOpenId(openId);
            orderDetails.setAddressId(Long.valueOf(addressId));
            orderDetails.setgId(gIds.get(i));
            orderDetails.setGoodsUrl(gUrls.get(i));
            orderDetails.setgNum(gNum.get(i));
            //根据商品ID查询商品名称跟
            //判断该商品是否使用优惠券，该商品优惠金额*****
            orderDetailsMapper.insert(orderDetails);

        }

        //修改优惠券状态为已使用
        List<Long> couIds = LiveStringUtil.splitToLong(couponsIds, ",");
        for (Long couId : couIds) {
            //设置为已使用

        }
        //扣除用户积分






        ordersMapper.insertSelective(orders);

        result.setCode(EnumResult.SUCCESS.getCode());
        result.setMsg(EnumResult.SUCCESS.getMsg());
        return result;
    }




}
