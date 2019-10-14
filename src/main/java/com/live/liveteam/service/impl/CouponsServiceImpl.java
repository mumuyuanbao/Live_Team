package com.live.liveteam.service.impl;

import com.live.liveteam.common.constant.BizConstant;
import com.live.liveteam.common.enums.EnumResult;
import com.live.liveteam.common.exception.BizException;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.result.SimpleResultVO;
import com.live.liveteam.common.utils.DateUtils;
import com.live.liveteam.common.utils.EmptyUtils;
import com.live.liveteam.common.utils.LiveStringUtil;
import com.live.liveteam.entity.Coupons;
import com.live.liveteam.entity.CouponsExample;
import com.live.liveteam.entity.Goods;
import com.live.liveteam.entity.GoodsExample;
import com.live.liveteam.mapper.CouponsMapper;
import com.live.liveteam.mapper.GoodsMapper;
import com.live.liveteam.service.CouponsService;
import com.live.liveteam.vo.CouponVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 作者: XW
 * 时间: 2019/9/10 16:50
 * 描述: 优惠券服务接口
 */
@Service
public class CouponsServiceImpl implements CouponsService {

    @Autowired
    private CouponsMapper couponsMapper;
    @Autowired
    private GoodsMapper goodsMapper;
    /**
     * 返回用户当前可用优惠券的数量
     *
     * @param openId 用户openId
     * @return 用户可用的所有可用优惠券的数目
     */
    @Override
    public ResultVO<Long> queryCouponsNumber(String openId, String goodsId, Long priceTotal) {
        // 参数非空检查
        if (EmptyUtils.isEmpty(openId)) {
            // 抛出参数为空异常
            EmptyUtils.throwParamNull();
        }
        CouponsExample example = new CouponsExample();
        CouponsExample.Criteria criteria = example.createCriteria();
        if (goodsId != null && priceTotal != null) {
            // 在订单界面的可用优惠券数量
            List<Long> goods = LiveStringUtil.splitToLong(goodsId, ",");
            criteria.andOpenIdEqualTo(openId);
            criteria.andCouponsGoodsIdIn(goods);
            criteria.andCouponsStateEqualTo(BizConstant.COUPON_UNUSED);
            CouponsExample.Criteria criteria1 = example.or();
            // 查询满减券
            criteria1.andOpenIdEqualTo(openId);
            criteria1.andCouponsRequireLessThan(priceTotal.intValue());
            criteria1.andCouponsStateEqualTo(BizConstant.COUPON_UNUSED);
        } else if (goodsId == null && priceTotal == null) {
            // 我的界面的可用优惠券数量
            criteria.andOpenIdEqualTo(openId);
            // 添加优惠券未使用条件
            criteria.andCouponsStateEqualTo(BizConstant.COUPON_UNUSED);
        }
        long number = 0L;
        try {
            number = couponsMapper.countByExample(example);
        } catch (Exception e) {
            throw new BizException(EnumResult.SELECT_ERROR);
        }
        return new ResultVO<>(EnumResult.SUCCESS.getCode(), EnumResult.SUCCESS.getMsg(), number);
    }

    /**
     * 返回当前用户的所有优惠券信息
     *
     * @param openId 用户openId
     * @return 返回结果已经过分类（used,unused）
     */
    @Override
    public ResultVO<List<CouponVO>> queryCouponsAll(String openId, Integer couponStatus, String goodsId, Long priceTotal) {
        // 参数非空检查
        if (EmptyUtils.isEmpty(openId)) {
            // 抛出参数为空异常
            EmptyUtils.throwParamNull();
        }
        CouponsExample example = new CouponsExample();
        example.setOrderByClause("coupons_start_time DESC");
        CouponsExample.Criteria criteria = example.createCriteria();

        List<Long> goodsIds = null;
        List<Coupons> coupons = new ArrayList<>();
        if (goodsId != null && priceTotal != null) {
            // 订单界面
            goodsIds = LiveStringUtil.splitToLong(goodsId, ",");
            criteria.andOpenIdEqualTo(openId);
            criteria.andCouponsStateEqualTo(couponStatus);
            criteria.andCouponsGoodsIdIn(goodsIds);
            CouponsExample.Criteria criteria1 = example.or();
            // 查询满减券
            criteria1.andOpenIdEqualTo(openId);
            criteria1.andCouponsStateEqualTo(couponStatus);
            criteria1.andCouponsRequireLessThan(priceTotal.intValue());
            coupons = couponsMapper.selectByExample(example);
        } else if (goodsId == null && priceTotal == null) {
            // 我的界面
            criteria.andOpenIdEqualTo(openId);
            criteria.andCouponsStateEqualTo(couponStatus);
            coupons = couponsMapper.selectByExample(example);
            // 防止goodsId重复
            Set<Long> productIds = new HashSet<>(coupons.size());
            // 查询所欲商品id对应商品
            for (Coupons coupon : coupons) {
                if (BizConstant.COUPON_TYPE_EXCHANGE.equals(coupon.getCouponsType())) {
                    productIds.add(coupon.getCouponsGoodsId());
                }
            }
            goodsIds = new ArrayList<>(productIds);
        }

        GoodsExample example1 = new GoodsExample();
        GoodsExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andIdIn(goodsIds);
        List<Goods> goods = goodsMapper.selectByExample(example1);

        List<CouponVO> couponVOS = new ArrayList<>(coupons.size());
        for (Coupons coupon : coupons) {
            Long productId = coupon.getCouponsGoodsId();
            Integer couponType = coupon.getCouponsType();
            CouponVO couponVO = new CouponVO();
            if (BizConstant.COUPON_TYPE_EXCHANGE.equals(couponType)) {
                // 对兑换券类型VO赋值
                for (Goods good : goods) {
                    if (productId.equals(good.getId())) {
                        couponVO.setProductName(good.getgFullName());
                        couponVO.setName(good.getgName() + "兑换券");
                        break;
                    }
                }
                couponVO.setValue("兑换券");
                couponVO.setProductId(productId);
            } else {
                // 对满减券类型VO赋值
                couponVO.setProductName("所有商品");
                StringBuilder sb = new StringBuilder();
                sb.append("满").append(coupon.getCouponsRequire() / 100.0).append("立减").append(coupon.getCouponsValue() / 100.0);
                couponVO.setName(sb.toString());
                couponVO.setValue((coupon.getCouponsValue() / 100.0) + "");
                couponVO.setProductId(-1L);
            }
            couponVO.setId(coupon.getId());
            couponVO.setType(coupon.getCouponsType());
            couponVOS.add(couponVO);
        }

        return new ResultVO<>(EnumResult.SUCCESS.getCode(), EnumResult.SUCCESS.getMsg(), couponVOS);
    }

    /**
     * 将使用的优惠券变为已使用状态
     *
     * @param id 优惠券的id
     * @return
     */
    @Override
    public SimpleResultVO updateCouponsToUsed(Long id) {
        // 参数非空检查
        if (EmptyUtils.isEmpty(id)) {
            // 抛出参数为空异常
            EmptyUtils.throwParamNull();
        }
        SimpleResultVO result = new SimpleResultVO();
        Coupons coupons = new Coupons();
        coupons.setId(id);
        coupons.setCouponsState(BizConstant.COUPON_USED);
        coupons.setCouponsUseTime(DateUtils.getTimeStamp());
        try {
            couponsMapper.updateByPrimaryKeySelective(coupons);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BizException(EnumResult.UPDATE_ERROR);
        }
        result.setCode(EnumResult.SUCCESS.getCode());
        result.setMsg(EnumResult.SUCCESS.getMsg());
        return result;
    }

    /**
     * 退还优惠券
     * @param id
     * @return
     */
    @Override
    public SimpleResultVO updateCouponsToUunsed(Long id) {
        // 参数非空检查
        if (EmptyUtils.isEmpty(id)) {
            // 抛出参数为空异常
            EmptyUtils.throwParamNull();
        }
        SimpleResultVO result = new SimpleResultVO();
        Coupons coupons = new Coupons();
        coupons.setId(id);
        coupons.setCouponsState(BizConstant.COUPON_UNUSED);
        coupons.setCouponsUseTime(BizConstant.COUPON_NO_USE_TIME);
        try {
            couponsMapper.updateByPrimaryKeySelective(coupons);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BizException(EnumResult.UPDATE_ERROR);
        }
        result.setCode(EnumResult.SUCCESS.getCode());
        result.setMsg(EnumResult.SUCCESS.getMsg());
        return result;
    }
}
