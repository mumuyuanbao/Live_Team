package com.live.liveteam.service.impl;

import com.live.liveteam.common.enums.EnumResult;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.utils.CopyPropertiesUtils;
import com.live.liveteam.entity.GoodsType;
import com.live.liveteam.mapper.GoodsTypeMapper;
import com.live.liveteam.service.GoodsTypeService;
import com.live.liveteam.vo.GoodsTypeNameVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：张钰磊
 * 时间2019/9/8 15:18
 * 描述
 */
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {

    @Autowired
    private GoodsTypeMapper goodsTypeMapper;

    /**
     * 查询一级分类中的内容
     * @return
     */
    @Override
    public ResultVO<List<GoodsTypeNameVO>> queryTypeList() {
        ResultVO<List<GoodsTypeNameVO>> result = new ResultVO<>();
//        GoodsTypeExample goodsTypeExample = new GoodsTypeExample();
//        GoodsTypeExample.Criteria criteria = goodsTypeExample.createCriteria();
//        criteria.andPIdEqualTo(0l);
//        List<GoodsType> goodsTypes = goodsTypeMapper.selectByExample(goodsTypeExample);
        List<GoodsType> goodsTypes = goodsTypeMapper.selectByPId(0l);
        List<GoodsTypeNameVO> goodsTypeNameVOS = CopyPropertiesUtils.dataConversion(goodsTypes, GoodsTypeNameVO.class);
        result.setData(goodsTypeNameVOS);
        result.setCode(EnumResult.SUCCESS.getCode());
        result.setMsg(EnumResult.SUCCESS.getMsg());
        return result;
    }

    /**
     * 查询二级分类中的内容
     * @return
     */
    @Override
    public ResultVO<List<GoodsTypeNameVO>> querySecondTypeList(long id) {
        //new 一个ResiltVO对象 用来存放数据  包括 data mag 和状态码
        ResultVO<List<GoodsTypeNameVO>> resultVO = new ResultVO<>();
        //调用 goodsTypeMapper的selectByPId方法 查询数据库
        List<GoodsType> goodsTypes = goodsTypeMapper.selectByPId(id);
        System.out.println(goodsTypes.get(0));
        //使用CopyPropertiesUtils 工具类转化类型
        List<GoodsTypeNameVO> goodsTypeNameVOS = CopyPropertiesUtils.dataConversion(goodsTypes, GoodsTypeNameVO.class);
        //将相应数据存放到resultVO中
        //Data放入goodsTypeNameVOS
        resultVO.setData(goodsTypeNameVOS);
        //放入状态码 调用EnumResult中的SUCCESS的getcode方法获取请求中的状态码
        resultVO.setCode(EnumResult.SUCCESS.getCode());
        //放入信息 同上
        resultVO.setMsg(EnumResult.SUCCESS.getMsg());
        //返回包装好的resultVO对象
        return resultVO;
    }

}

