package com.live.liveteam.service.impl;

import com.live.liveteam.common.enums.EnumResult;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.utils.DateUtils;
import com.live.liveteam.common.utils.LiveStringUtil;
import com.live.liveteam.common.utils.RedisUtil;
import com.live.liveteam.common.utils.StringUtils;
import com.live.liveteam.entity.Goods;
import com.live.liveteam.entity.ShoppingCar;
import com.live.liveteam.mapper.GoodsMapper;
import com.live.liveteam.service.ShoppingCarService;
import com.live.liveteam.vo.ShoppingCarVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;


import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * author:许承斌
 * date:2019/9/11 21:17
 * description:
 */
@Service
public class ShoppingCarServiceImpl implements ShoppingCarService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private RedisTemplate redisTemplate;
    @Override
    public ResultVO insertShoppingCar(String openId, String goodsId, String goodsNum) {
        Long oldNum =0L;
        ShoppingCarVO shoppingCar = new ShoppingCarVO();
        //判断原有用户的redis中是否包含该商品
        Set hkeys = redisTemplate.boundHashOps(openId).keys();
        boolean contains = hkeys.contains(goodsId);
        //如果redis中有该商品,获取该商品数量
        if (contains){
            ShoppingCarVO shoppingCar1 =(ShoppingCarVO) redisTemplate.boundHashOps(openId).get(goodsId);
            oldNum = shoppingCar1.getgNum();
        }
        //根据商品id获得商品对象goods
        Goods goods = goodsMapper.selectByPrimaryKey(Long.valueOf(goodsId));

        Long num = Long.valueOf(goodsNum)+oldNum;

        shoppingCar.setGoods(goods);
        shoppingCar.setUserId(Long.valueOf(openId));
        shoppingCar.setgId(Long.valueOf(goodsId));
        shoppingCar.setgNum(num);
        shoppingCar.setCreateTime(DateUtils.getTimeStamp());
        shoppingCar.setUpdateTime(DateUtils.getTimeStamp());

        redisTemplate.setKeySerializer(new StringRedisSerializer());
        String key = new StringUtils().RedisKey(openId);
        redisTemplate.boundHashOps(key).put(goodsId,shoppingCar);

        return new ResultVO(EnumResult.SUCCESS.getCode(),EnumResult.SUCCESS.getMsg());
    }

    @Override
    public ResultVO dropShoppingCar(String openId, String goodsIds) {
        List<Long> longs = LiveStringUtil.splitToLong(goodsIds, ",");
        String key = new StringUtils().RedisKey(openId);
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        for (int i=1;i<longs.size();i++){
            Long goodsId = longs.get(i);
            redisTemplate.boundHashOps(key).delete(goodsId);
        }
        return new ResultVO(EnumResult.SUCCESS.getCode(),EnumResult.SUCCESS.getMsg());
    }

    @Override
    public ResultVO updateShoppingCar(String openId, String goodsId, String goodsNum) {

        String key = new StringUtils().RedisKey(openId);
        ShoppingCarVO shoppingCar = (ShoppingCarVO) redisTemplate.boundHashOps(key).get(goodsId);
        shoppingCar.setgNum(Long.valueOf(goodsNum));
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.boundHashOps(key).put(goodsId,shoppingCar);
        return new ResultVO(EnumResult.SUCCESS.getCode(),EnumResult.SUCCESS.getMsg());
    }

    @Override
    public ResultVO queryShoppingCar(String openId) {
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        List<ShoppingCarVO> shoppingCars = redisTemplate.boundHashOps(openId).values();
        return new ResultVO(EnumResult.SUCCESS.getCode(),EnumResult.SUCCESS.getMsg(),shoppingCars);
    }
}
