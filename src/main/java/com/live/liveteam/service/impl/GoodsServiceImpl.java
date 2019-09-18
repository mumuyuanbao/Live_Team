package com.live.liveteam.service.impl;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.live.liveteam.common.enums.EnumResult;
import com.live.liveteam.common.exception.BizException;
import com.live.liveteam.common.result.PageVO;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.result.SimpleResultVO;
import com.live.liveteam.common.utils.*;
import com.live.liveteam.entity.*;
import com.live.liveteam.mapper.GoodsMapper;
import com.live.liveteam.mapper.GoodsSnapUpMapper;
import com.live.liveteam.service.GoodsDetailService;
import com.live.liveteam.service.GoodsMadeUpService;
import com.live.liveteam.service.GoodsService;
import com.live.liveteam.service.GoodsSnapUpService;
import com.live.liveteam.vo.GoodsDetailVO;
import com.live.liveteam.vo.GoodsListVO;
import com.live.liveteam.vo.ListPageVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.naming.Name;
import javax.persistence.Id;
import javax.swing.*;
import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * 作者：木木豹
 * 时间2019-09-10 20:48
 * 描述：
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private GoodsDetailService goodsDetailService;

    @Autowired
    private GoodsMadeUpService goodsMadeUpService;

    @Autowired
    private GoodsSnapUpService goodsSnapUpService;

    @Autowired
    private GoodsSnapUpMapper goodsSnapUpMapper;

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * 按条件查询商品列表 搜索solr搜索 每次搜索记录放入redis中 不重复 zset
     *
     * @param pageNum
     * @param pageSize
     * @param keyName
     * @return
     */
    @Override
    public ResultVO<PageVO<GoodsListVO>> qureyGoodsList(Integer pageNum, Integer pageSize, String keyName) {
        Map<Object, Object> hmget = redisUtil.hmget(RedisUtil.GOODS_DETAIL_MAP + "all");
        ResultVO<PageVO<GoodsListVO>> result = new ResultVO<PageVO<GoodsListVO>>();
        PageVO<GoodsListVO> goodsListVOPageVO = new PageVO<>();
        PageVO<Goods> goodspageVO = new PageVO<Goods>();
        //商品必然属于二级分类，搜索一级分类先搜索一级分类下二级分类的ID，再搜索所有二级分类ID
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.setOrderByClause("g_sort");
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        if (keyName != null && keyName.length() > 0) {
            String key = "%" + keyName + "%";
            criteria.andGNameLike(key);
        }
        criteria.andGStatusEqualTo((byte) 0);
        PageHelper.startPage(pageNum, pageSize);
        List<Goods> goods = goodsMapper.selectByExample(goodsExample);
        PageInfo<Goods> pageInfo = new PageInfo<>(goods);
        goodspageVO.savePageinfo(pageInfo);


        goodsListVOPageVO.setTotalCount(goodspageVO.getTotalCount());
        goodsListVOPageVO.setSize(goodspageVO.getSize());
        goodsListVOPageVO.setPageSize(goodspageVO.getPageSize());
        goodsListVOPageVO.setPages(goodspageVO.getPages());
        goodspageVO.setCurrentPage(goodspageVO.getCurrentPage());
        List<GoodsListVO> goodsListVOS = CopyPropertiesUtils.dataConversion(goods, GoodsListVO.class);

        goodsListVOPageVO.setData(goodsListVOS);

        result.setData(goodsListVOPageVO);
        result.setCode(EnumResult.SUCCESS.getCode());
        result.setMsg(EnumResult.SUCCESS.getMsg());
        return result;
    }

    /**
     * 获取一级分类商品 先查缓存，缓存查不到查数据库
     *
     * @return
     */
    @Override
    public ResultVO<PageVO<Goods>> queryTypeOne(Integer pageNum, Integer pageSize, Long typeOne,Long typeTwo) {
        ResultVO<PageVO<Goods>> result = new ResultVO<>();
        PageVO<Goods> pageGoods = new PageVO<>(pageNum, pageSize);
        if (typeOne == null&&typeTwo==null) {
            throw new BizException(EnumResult.NO_GOODS_CLASSIFICATION);
        }
        //先查询缓存 判断缓存是否存在
        Long type=0l;
        if (typeOne!=null){
            type=typeOne;
        }
        if (typeTwo!=null){
            type=typeTwo;
        }

        boolean goodsTypeOneCache = redisUtil.hasKey(RedisUtil.GOODS_DETAIL_MAP + type);
        //若缓存为空 查询数据库
        if (!goodsTypeOneCache) {
            String uuid = UUID.randomUUID().toString();
            //获取一个值为uuid的redis分布式锁
            Boolean aBoolean = redisTemplate.opsForValue().setIfAbsent(RedisUtil.GOODS_TYPEONE_LOCK, uuid);

            if (aBoolean) {

                //如果获得了锁，给这个锁上一个超时时间，避免死锁问题.如果程序运行报错，基本程序不释放锁，1.5秒之后锁会释放
                redisTemplate.expire(RedisUtil.GOODS_TYPEONE_LOCK, 99999999, TimeUnit.MILLISECONDS);
                try {

                    //查询数据库
                    GoodsExample goodsExample = new GoodsExample();
                    GoodsExample.Criteria criteria = goodsExample.createCriteria();
                    //按sort排序
                    goodsExample.setOrderByClause("g_sort");
                    //是否显示
                    criteria.andGStatusEqualTo((byte) 0);
                    //如果按照一级分类搜索
                    if (typeOne!=null){
                        criteria.andGTypePidEqualTo(typeOne);
                    }else {
                        criteria.andGTypeIdEqualTo(typeTwo);
                    }
                    List<Goods> goods = goodsMapper.selectByExample(goodsExample);

                    Map<String, Goods> goodsTypeOne = new TreeMap<String, Goods>(new Comparator<String>() {
                        @Override
                        public int compare(String o1, String o2) {
                            return Integer.parseInt(o1) - Integer.parseInt(o2);
                        }
                    });
                    for (Goods good : goods) {
                        //将list转换成map  键为商品信息 值为商品ID
                        goodsTypeOne.put(good.getgSort().toString(), good);
                    }
                    //将排序后的商品放入缓存 zset

                    redisUtil.hmsetGoods(RedisUtil.GOODS_DETAIL_MAP + typeOne, goodsTypeOne);
                    //返回前端所需分页数据
                    List<Goods> pageList = PageUtil.getPage(pageNum, pageSize, goods);
                    //设置总页数跟数据总数
                    pageGoods.setTotalCount(goods.size());
                    //当前页数量
                    pageGoods.setSize(pageList.size());
                    pageGoods.setData(pageList);
                    result.setData(pageGoods);
                    result.setCode(EnumResult.SUCCESS.getCode());
                    result.setMsg(EnumResult.SUCCESS.getMsg());
                    return result;
                } finally {
                    //获取当前锁的VALUE  UUID
                    String lock_uuid = (String) redisTemplate.opsForValue().get(RedisUtil.GOODS_TYPEONE_LOCK);
                    //判断当前锁的uuid与生成的是否相同
                    if (uuid.equals(lock_uuid))
                        //如果相同，删除锁
                        redisTemplate.delete(RedisUtil.GOODS_TYPEONE_LOCK);
                }
            } else {
                //如果没有得到锁 线程休眠100mm
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new BizException(EnumResult.NO_GOODS_CLASSIFICATION);
                }
                //重新执行方法
                queryTypeOne(pageNum, pageSize, typeOne,typeTwo);
            }
        } else {
            //如果缓存中存在 转换成list返回
            Map<Object, Object> hmget = redisUtil.hmget(RedisUtil.GOODS_DETAIL_MAP + typeOne);
            //转换为list
            Set<Object> objects = hmget.keySet();
            //对获取到的数据放入map
            List<Goods> goodsList = new ArrayList<Goods>();
            for (Object key : objects) {
                Object o = hmget.get(key);
                String info = JSON.toJSONString(o);
                Goods goods = JSONObject.parseObject(info, Goods.class);
                goodsList.add(goods);
            }
            //排序
            goodsList.sort((x, y) -> Double.compare(y.getgSort(), x.getgSort()));
            //返回前端所需分页数据

            //返回前端所需分页数据
            List<Goods> pageList = PageUtil.getPage(pageNum, pageSize, goodsList);
            //设置总页数跟数据总数
            pageGoods.setTotalCount(goodsList.size());
            //当前页数量
            pageGoods.setSize(pageList.size());
            pageGoods.setData(pageList);
            result.setData(pageGoods);
            result.setCode(EnumResult.SUCCESS.getCode());
            result.setMsg(EnumResult.SUCCESS.getMsg());
            return result;
        }
        return null;
    }

    /**
     * 根据用户ID从缓存获取搜索历史
     *
     * @param token
     * @return
     */
    @Override
    public ResultVO<List<String>> querySearchRecord(String token) {
        ResultVO<List<String>> result = new ResultVO<>();
        List<String> list = new ArrayList<>();
        String info = JSON.toJSONString(redisUtil.get(RedisUtil.USER_QUERY_SEARCH_RECORD + token));
        list = JSONObject.parseObject(info, ArrayList.class);
        System.out.println(list);
        result.setData(list);
        result.setMsg(EnumResult.SUCCESS.getMsg());
        result.setCode(EnumResult.SUCCESS.getCode());
        return result;
    }

    @Override
    public ResultVO<PageVO<Goods>> queryTypeTwo(Integer typeTwo) {

        return null;
    }

    /**
     * 获取商品详情信息
     *
     * @param gId           商品ID
     * @param isSnapUpGoods 是否为抢购商品
     * @return
     */
    @Override
    public ResultVO<GoodsDetailVO> queryGoodsDetail(Long gId, Integer isSnapUpGoods) {
        ResultVO<GoodsDetailVO> result = new ResultVO<>();
        GoodsDetailVO goodsDetailVO = new GoodsDetailVO();
        if (gId == null) {
            //如果ID为空提示没有此商品
            throw new BizException(EnumResult.NO_SUCH_GOODS);
        }
        Goods goods = goodsMapper.selectByPrimaryKey(gId);
        if (isSnapUpGoods == 0) {
            //如果商品为抢购商品价格会不一样
            //查询抢购商品
            GoodsSnapUp goodsSnapUp = goodsSnapUpMapper.selectByPrimaryKey(gId);
            //商品抢购开始时间
            goodsDetailVO.setGoodsSnapUpStartTime(goodsSnapUp.getgStartTime());
            //商品抢购结束时间
            goodsDetailVO.setGoodsSnapUpStopTime(goodsSnapUp.getgStopTime());
            goods.setgSalePrice(goodsSnapUp.getgSaleProce());
        }
        goodsDetailVO.setGoods(goods);

        GoodsDetail goodsDetail = goodsDetailService.selectByGId(gId);
        goodsDetailVO.setGoodsDetail(goodsDetail);

        List<GoodsMadeUp> goodsMadeUpList = goodsMadeUpService.selectByGId(gId);

        Map<String, List<GoodsMadeUp>> goodsMadeUpMaps = new HashMap<>();
        Map<Long, String> pNamesMap = new HashMap<>();
        boolean b = false;
        for (GoodsMadeUp goodsMadeUp : goodsMadeUpList) {
            //判断是否为父分类,如果为父类则查询上是否已经存在map中
            if (goodsMadeUp.getpId() == 0) {
                Set<String> keySet = goodsMadeUpMaps.keySet();
                if (keySet.size() == 0) {
                    //如果长度为0，则直接添加
                    goodsMadeUpMaps.put(goodsMadeUp.getmName(), null);
                    pNamesMap.put(goodsMadeUp.getId(), goodsMadeUp.getmName());
                } else {
                    for (String s : keySet) {
                        //若在map中存在此key直接跳出循环
                        if (goodsMadeUp.getmName().equals(s)) {
                            b = false;
                            break;
                        } else {
                            //如果到最后还是等于true代表无此分类
                            b = true;
                        }
                    }
                    if (b) {
                        goodsMadeUpMaps.put(goodsMadeUp.getmName(), null);
                        pNamesMap.put(goodsMadeUp.getId(), goodsMadeUp.getmName());
                    }
                }
            } else {
                //如果不是父分，遍历分类key 有无此父名称，无则添加父名称
                Set<Long> longs = pNamesMap.keySet();
                boolean bool = true;
                for (Long s : longs) {
                    if (goodsMadeUp.getpId() == (s)) {
                        List<GoodsMadeUp> goodsMadeUpList1 = goodsMadeUpMaps.get(pNamesMap.get(s));
                        if (goodsMadeUpList1 == null) {
                            goodsMadeUpList1 = new ArrayList<>();
                        }
                        goodsMadeUpList1.add(goodsMadeUp);
                        goodsMadeUpMaps.put(pNamesMap.get(s), goodsMadeUpList1);
                        bool = false;
                    }
                }
                if (bool) {
                    //若无此父分类，则添加此父分类 将此子分类加入
                    List<GoodsMadeUp> list = new ArrayList<>();
                    list.add(goodsMadeUp);

                    goodsMadeUpMaps.put(goodsMadeUp.getmName(), list);
                    pNamesMap.put(goodsMadeUp.getId(), goodsMadeUp.getmName());
                }
            }
        }
        goodsDetailVO.setGoodsMadeUps(goodsMadeUpMaps);
        result.setData(goodsDetailVO);
        result.setMsg(EnumResult.SUCCESS.getMsg());
        result.setCode(EnumResult.SUCCESS.getCode());
        return result;
    }

    /**
     * 获取抢购商品  从redis获取,若redis为空则查询数据库
     *
     * @return
     */
    @Override
    public ResultVO<List<GoodsSnapUp>> queryGoodsSnapUp() {
        ResultVO<List<GoodsSnapUp>> result = new ResultVO<>();
        //判断缓存中有无数据
        boolean snapUpCache = redisUtil.hasKey(RedisUtil.GOODS_SNAP_UP);
        //若没有数据
        if (!snapUpCache) {
            String uuid = UUID.randomUUID().toString();
            //获取一个值为uuid的redis分布式锁
            Boolean aBoolean = redisTemplate.opsForValue().setIfAbsent(RedisUtil.GOODS_SNAP_UP_LOCK, uuid);

            if (aBoolean) {

                //如果获得了锁，给这个锁上一个超时时间，避免死锁问题.如果程序运行报错，基本程序不释放锁，1.5秒之后锁会释放
                redisTemplate.expire(RedisUtil.GOODS_SNAP_UP_LOCK, 99999999, TimeUnit.MILLISECONDS);
                try {
                    //查询数据库获得抢购商品值
                    List<GoodsSnapUp> list = goodsSnapUpService.queryGoodsSnapList();
                    //将抢购商品放入缓存
                    if (list != null) {
                        redisUtil.set(RedisUtil.GOODS_SNAP_UP, list);
                    }
                    //返回前端所需分页数据
                    result.setData(list);
                    result.setCode(EnumResult.SUCCESS.getCode());
                    result.setMsg(EnumResult.SUCCESS.getMsg());
                    return result;
                } finally {
                    //获取当前锁的VALUE  UUID
                    String lock_uuid = (String) redisTemplate.opsForValue().get(RedisUtil.GOODS_SNAP_UP_LOCK);
                    //判断当前锁的uuid与生成的是否相同
                    if (uuid.equals(lock_uuid))
                        //如果相同，删除锁
                        redisTemplate.delete(RedisUtil.GOODS_SNAP_UP_LOCK);
                }
            } else {
                //如果没有得到锁 线程休眠100mm
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new BizException(EnumResult.NO_GOODS_CLASSIFICATION);
                }
                //重新执行方法
                queryGoodsSnapUp();
            }
        } else {
            //如果缓存中存在 转换成list返回
            List<GoodsSnapUp> list = (List<GoodsSnapUp>) redisUtil.get(RedisUtil.GOODS_SNAP_UP);
            result.setData(list);
            result.setCode(EnumResult.SUCCESS.getCode());
            result.setMsg(EnumResult.SUCCESS.getMsg());
            return result;
        }
        return null;
    }

    /**
     * 清空用户搜索记录
     * @param token
     * @return
     */
    @Override
    public SimpleResultVO dropSearchRecord(String token) {

        return null;
    }

    /**
     * 获取精选列表
     * @return
     */
    @Override
    public ResultVO<List<Goods>> queryGoodsOnlyChoose() {
        ResultVO<List<Goods>> result= new ResultVO<>();
        //判断缓存中有无数据
        boolean goodsChooseCache = redisUtil.hasKey(RedisUtil.GOODS_ONLY_CHOOSE);
        //若没有数据
        if (!goodsChooseCache) {
            String uuid = UUID.randomUUID().toString();
            //获取一个值为uuid的redis分布式锁
            Boolean aBoolean = redisTemplate.opsForValue().setIfAbsent(RedisUtil.GOODS_ONLY_CHOOSE_LOCK, uuid);

            if (aBoolean) {

                //如果获得了锁，给这个锁上一个超时时间，避免死锁问题.如果程序运行报错，基本程序不释放锁，1.5秒之后锁会释放
                redisTemplate.expire(RedisUtil.GOODS_ONLY_CHOOSE_LOCK, 99999999, TimeUnit.MILLISECONDS);
                try {
                    //查询数据库获得精选商品列表
                    GoodsExample goodsExample = new GoodsExample();
                    goodsExample.setOrderByClause("g_sort");
                    GoodsExample.Criteria criteria = goodsExample.createCriteria();
                    criteria.andGIsOnlyEqualTo((byte) 0);
                    criteria.andGStatusEqualTo((byte) 0);
                    List<Goods> list = goodsMapper.selectByExample(goodsExample);
                    //将精选商品放入缓存
                    if (list != null) {
                        redisUtil.set(RedisUtil.GOODS_ONLY_CHOOSE, list);
                    }
                    //返回前端所需分页数据
                    result.setData(list);
                    result.setCode(EnumResult.SUCCESS.getCode());
                    result.setMsg(EnumResult.SUCCESS.getMsg());
                    return result;
                } finally {
                    //获取当前锁的VALUE  UUID
                    String lock_uuid = (String) redisTemplate.opsForValue().get(RedisUtil.GOODS_ONLY_CHOOSE_LOCK);
                    //判断当前锁的uuid与生成的是否相同
                    if (uuid.equals(lock_uuid))
                        //如果相同，删除锁
                        redisTemplate.delete(RedisUtil.GOODS_ONLY_CHOOSE_LOCK);
                }
            } else {
                //如果没有得到锁 线程休眠100mm
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new BizException(EnumResult.NO_GOODS_CLASSIFICATION);
                }
                //重新执行方法
                queryGoodsOnlyChoose();
            }
        } else {
            //如果缓存中存在 转换成list返回
            List<Goods> list = (List<Goods>) redisUtil.get(RedisUtil.GOODS_ONLY_CHOOSE);
            result.setData(list);
            result.setCode(EnumResult.SUCCESS.getCode());
            result.setMsg(EnumResult.SUCCESS.getMsg());
            return result;
        }
        return null;
    }

    /**
     * 获取新品
     * @return
     */
    @Override
    public ResultVO<List<Goods>> queryNewGoods() {
        ResultVO<List<Goods>> result= new ResultVO<>();
        //判断缓存中有无数据
        boolean newGoodsCache = redisUtil.hasKey(RedisUtil.GOODS_NEW_TYPE);
        //若没有数据
        if (!newGoodsCache) {
            String uuid = UUID.randomUUID().toString();
            //获取一个值为uuid的redis分布式锁
            Boolean aBoolean = redisTemplate.opsForValue().setIfAbsent(RedisUtil.GOODS_NEW_TYPE_LOCK, uuid);

            if (aBoolean) {

                //如果获得了锁，给这个锁上一个超时时间，避免死锁问题.如果程序运行报错，基本程序不释放锁，1.5秒之后锁会释放
                redisTemplate.expire(RedisUtil.GOODS_NEW_TYPE_LOCK, 99999999, TimeUnit.MILLISECONDS);
                try {
                    //查询数据库获得精选商品列表
                    GoodsExample goodsExample = new GoodsExample();
                    goodsExample.setOrderByClause("g_sort");
                    GoodsExample.Criteria criteria = goodsExample.createCriteria();
                    criteria.andGoodsIsNewEqualTo((byte) 0);
                    criteria.andGStatusEqualTo((byte) 0);
                    List<Goods> list = goodsMapper.selectByExample(goodsExample);
                    //将精选商品放入缓存
                    if (list.size()>3){
                        list= list.subList(0, 3);
                    }
                        redisUtil.set(RedisUtil.GOODS_NEW_TYPE, list);

                    //返回前端所需分页数据
                    result.setData(list);
                    result.setCode(EnumResult.SUCCESS.getCode());
                    result.setMsg(EnumResult.SUCCESS.getMsg());
                    return result;
                } finally {
                    //获取当前锁的VALUE  UUID
                    String lock_uuid = (String) redisTemplate.opsForValue().get(RedisUtil.GOODS_NEW_TYPE_LOCK);
                    //判断当前锁的uuid与生成的是否相同
                    if (uuid.equals(lock_uuid))
                        //如果相同，删除锁
                        redisTemplate.delete(RedisUtil.GOODS_NEW_TYPE_LOCK);
                }
            } else {
                //如果没有得到锁 线程休眠100mm
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new BizException(EnumResult.NO_GOODS_CLASSIFICATION);
                }
                //重新执行方法
                queryGoodsOnlyChoose();
            }
        } else {
            //如果缓存中存在 转换成list返回
            List<Goods> list = (List<Goods>) redisUtil.get(RedisUtil.GOODS_NEW_TYPE);
            result.setData(list);
            result.setCode(EnumResult.SUCCESS.getCode());
            result.setMsg(EnumResult.SUCCESS.getMsg());
            return result;
        }


        return null;
    }


}
