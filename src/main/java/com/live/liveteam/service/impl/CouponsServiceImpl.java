package com.live.liveteam.service.impl;

import com.live.liveteam.common.constant.BizConstant;
import com.live.liveteam.common.enums.EnumResult;
import com.live.liveteam.common.exception.BizException;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.result.SimpleResultVO;
import com.live.liveteam.common.utils.DateUtils;
import com.live.liveteam.common.utils.EmptyUtils;
import com.live.liveteam.common.utils.EntityToVOUtil;
import com.live.liveteam.entity.Coupons;
import com.live.liveteam.entity.CouponsExample;
import com.live.liveteam.mapper.CouponsMapper;
import com.live.liveteam.service.CouponsService;
import com.live.liveteam.vo.CouponsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 作者: XW
 * 时间: 2019/9/10 16:50
 * 描述: 优惠券服务接口
 */
@Service
public class CouponsServiceImpl implements CouponsService {

    @Autowired
    private CouponsMapper couponsMapper;

    /**
     * 返回用户当前可用优惠券的数量(我的界面)
     *
     * @param openId 用户openId
     * @return 用户可用的所有可用优惠券的数目
     */
    @Override
    public ResultVO<Integer> queryCouponsUsefulNumber(String openId) {
        // 参数非空检查
        if (EmptyUtils.isEmpty(openId)) {
            // 抛出参数为空异常
            EmptyUtils.throwParamNull();
        }
        ResultVO<Integer> result = new ResultVO<>();
        CouponsExample example = new CouponsExample();
        CouponsExample.Criteria criteria = example.createCriteria();
        criteria.andOpenIdEqualTo(openId);
        // 添加优惠券未使用条件
        criteria.andCouponsStateEqualTo(BizConstant.COUPON_UNUSED);
        int number =(int) couponsMapper.countByExample(example);
        if (number > 0) {
            result.setCode(EnumResult.SUCCESS.getCode());
            result.setMsg(EnumResult.SUCCESS.getMsg());
        } else {
            // 如果没有优惠券返回对应的状态码及信息
            result.setCode(EnumResult.COUPONS_INFO_NOT_FOUND.getCode());
            result.setMsg(EnumResult.COUPONS_INFO_NOT_FOUND.getMsg());
        }
        result.setData(number);
        return result;
    }

    /**
     * 返回当前用户的所有优惠券信息
     *
     * @param openId 用户openId
     * @return 返回结果已经过分类（used,unused）
     */
    @Override
    public ResultVO<Map> queryCouponsAll(String openId) {
        // 参数非空检查
        if (EmptyUtils.isEmpty(openId)) {
            // 抛出参数为空异常
            EmptyUtils.throwParamNull();
        }
        ResultVO<Map> result = new ResultVO<>();
        CouponsExample example = new CouponsExample();
        CouponsExample.Criteria criteria = example.createCriteria();
        criteria.andOpenIdEqualTo(openId);
        List<Coupons> coupons = couponsMapper.selectByExample(example);
        // 将优惠券进行分类,未使用和已使用分别放入map中
        List<CouponsVO> used = new ArrayList<>();
        List<CouponsVO> unused = new ArrayList<>();
        Map<String, List> map = new HashMap<>(2);
        for (Coupons coupon : coupons) {
            if (BizConstant.COUPON_UNUSED.equals(coupon.getCouponsState())) {
                // 将entity中的属性放入VO的工具类
                CouponsVO vo = (CouponsVO) EntityToVOUtil.getVO(coupon, CouponsVO.class);
                unused.add(vo);
            } else {
                CouponsVO vo = (CouponsVO) EntityToVOUtil.getVO(coupon, CouponsVO.class);
                used.add(vo);
            }
        }
        // 有无数据都创建map防止前端出现undefined
        map.put("used", used);
        map.put("unused", unused);
        result.setData(map);
        if (coupons.size() > 0) {
            result.setMsg(EnumResult.SUCCESS.getMsg());
            result.setCode(EnumResult.SUCCESS.getCode());
        } else {
            // 前端根据状态码可判断data中是否有值
            result.setCode(EnumResult.COUPONS_INFO_NOT_FOUND.getCode());
            result.setMsg(EnumResult.COUPONS_INFO_NOT_FOUND.getMsg());
        }
        return result;
    }

//    (在订单界面)返回用户可用的优惠券数量
//    @Override
//    public ResultVO<Integer> queryCouponsOrderUsefulNumber() {
//        ResultVO<Integer> result = new ResultVO<>();
//        return result;
//    }
//    (订单)返回用户所有可用的优惠券
//    @Override
//    public ResultVO<List> queryCouponsOrderUserful() {
//        ResultVO<List> result = new ResultVO<>();
//        return result;
//    }

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
            throw new BizException(EnumResult.UPDATE_ERROR.getCode(), EnumResult.UPDATE_ERROR.getMsg());
        }
        result.setCode(EnumResult.SUCCESS.getCode());
        result.setMsg(EnumResult.SUCCESS.getMsg());
        return result;
    }

    /**
     * 插入一张满减类型的优惠券
     * @param openId 用户openid
     * @param value 优惠券面值
     * @param threshold 优惠券使用门槛
     * @return
     */
    public SimpleResultVO insertCouponsTypeReduce(String openId, Integer value, Integer threshold) {
        if (openId == null || value == null || threshold == null) {
            throw new BizException(EnumResult.PARAM_NULL.getCode(), EnumResult.PARAM_NULL.getMsg());
        }
        SimpleResultVO result = new SimpleResultVO();
        Coupons coupons = new Coupons();
        coupons.setOpenId(openId);
        coupons.setCouponsType(BizConstant.COUPON_TYPE_REDUCE);
        coupons.setCouponsValue(value);
        coupons.setCouponsRequire(threshold);
        coupons.setCouponsGoodsId(BizConstant.COUPON_NO_GOODS);
        coupons.setCouponsState(BizConstant.COUPON_UNUSED);
        coupons.setCouponsStartTime(DateUtils.getTimeStamp());
        coupons.setCouponsUseTime(BizConstant.COUPON_NO_USE_TIME);
        String desc = "使用说明：满" + threshold + "元可减" + value + "元";
        coupons.setCouponsDesc(desc);
        try {
            couponsMapper.insertSelective(coupons);
        } catch (Exception e) {
            throw new BizException(EnumResult.INSERT_ERROR.getCode(), EnumResult.INSERT_ERROR.getMsg());
        }
        result.setCode(EnumResult.SUCCESS.getCode());
        result.setMsg(EnumResult.SUCCESS.getMsg());
        return result;
    }


    public SimpleResultVO insertCouponsTypeExchange(String openId, Long goodsId) {
        if (openId == null || goodsId == null) {
            throw new BizException(EnumResult.PARAM_NULL.getCode(), EnumResult.PARAM_NULL.getMsg());
        }
        SimpleResultVO result = new SimpleResultVO();

        return result;
    }
}
