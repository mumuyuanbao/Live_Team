package com.live.liveteam.service.impl;

import com.live.liveteam.common.enums.EnumResult;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.utils.CopyPropertiesUtils;
import com.live.liveteam.common.utils.DateUtils;
import com.live.liveteam.entity.Address;
import com.live.liveteam.entity.AddressDest;
import com.live.liveteam.entity.GoodsType;
import com.live.liveteam.mapper.AddressDestMapper;
import com.live.liveteam.mapper.AddressMapper;
import com.live.liveteam.service.AddressDestService;
import com.live.liveteam.vo.AddressDestVO;
import com.live.liveteam.vo.GoodsTypeNameVO;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


/**
 * 作者：张钰磊
 * 时间2019/9/11 21:47
 * 描述 详细地址的增删改查服务
 */
@Service
public class AddressDestServiceImpl implements AddressDestService {

    @Autowired
    private AddressMapper addressMapper;

    @Autowired
    private AddressDestMapper addressDestMapper;

    /**
     * 查询当前用户的所有已添加的可用地址
     * @param open_id 用户id
     * @return
     */
    @Override
    public ResultVO<List<AddressDestVO>> selectAddressDest(String open_id) {


        ResultVO<List<AddressDestVO>> resultVO = new ResultVO<>();

        AddressDest addressDest = addressDestMapper.selectByOpenId(open_id);
        //如果该用户并没有可用地址直接返回
        if (addressDest==null){

            resultVO.setMsg(EnumResult.SUCCESS.getMsg());
            resultVO.setCode(EnumResult.SUCCESS.getCode());
            return resultVO;
        }
        //区、县id
        Long area = addressDest.getaAreaId();
        //市id
        Long city = addressDest.getcCityId();
        //省id
        Long province = addressDest.getpProvinceId();
        //字符串拼接
        String allname ="";
        if (province!=null){
            //不是直辖市
            String provincename = addressMapper.selectByPrimaryKey(province.intValue()).getName();
            String cityname = addressMapper.selectByPrimaryKey(city.intValue()).getName();
            String areaname = addressMapper.selectByPrimaryKey(area.intValue()).getName();
            allname = provincename+cityname+areaname;
        }else {
            //直辖市
            String cityname = addressMapper.selectByPrimaryKey(city.intValue()).getName();
            String areaname = addressMapper.selectByPrimaryKey(area.intValue()).getName();
            allname = cityname+areaname;
        }

        AddressDestVO addressDestVO = new AddressDestVO();
        addressDestVO.setDestIphone(addressDest.getDestIphone());
        addressDestVO.setDestName(addressDest.getDestName());
        addressDestVO.setDetailedAddress(allname+addressDest.getDetailedAddress());
        addressDestVO.setId(addressDest.getId());
        addressDestVO.setIfDefault(addressDest.getIfDefault());

        List<AddressDestVO> list =new ArrayList<AddressDestVO>();
        list.add(addressDestVO);

        List<AddressDestVO> addressDestVOS = CopyPropertiesUtils.dataConversion(list, AddressDestVO.class);

        resultVO.setMsg(EnumResult.SUCCESS.getMsg());
        resultVO.setData(addressDestVOS);
        resultVO.setCode(EnumResult.SUCCESS.getCode());

        return resultVO;
    }

    /**
     * 修改当前地址的默认与否
     * @param id 地址id
     * @return
     */
    @Override
    public ResultVO alterAddressDefault(Long id) {

        ResultVO<Object> resultVO = new ResultVO<>();

        Byte ifDefault = addressDestMapper.selectByPrimaryKey(id).getIfDefault();


        AddressDest addressDest = new AddressDest();
        //判断当前地址是否为默认
        if (ifDefault!=0){
            //默认 1
            addressDest.setIfDefault(new Byte(String.valueOf(0)));
            addressDest.setId(id);
            long timeStamp = DateUtils.getTimeStamp();
            addressDest.setUpdateTime(timeStamp);
            addressDestMapper.updateByPrimaryKeySelective(addressDest);
        }else {
            //非默认 0
            //将所有的都改成0 再把当前改成1
            String openId = addressDestMapper.selectByPrimaryKey(id).getOpenId();
            addressDestMapper.updateByOpenId(openId);

            addressDest.setIfDefault(new Byte(String.valueOf(1)));
            addressDest.setId(id);
            long timeStamp = DateUtils.getTimeStamp();
            addressDest.setUpdateTime(timeStamp);
            addressDestMapper.updateByPrimaryKeySelective(addressDest);
        }

        resultVO.setMsg(EnumResult.SUCCESS.getMsg());
        resultVO.setCode(EnumResult.SUCCESS.getCode());

        return resultVO;

    }

    /**
     * 新增详细地址
     * @param addressDest
     * @return
     */
    @Override
    public ResultVO insertAddressDest(AddressDest addressDest) {

        long timeStamp = DateUtils.getTimeStamp();
        addressDest.setUpdateTime(timeStamp);
        addressDest.setCreateTime(timeStamp);
        ResultVO<Object> resultVO = new ResultVO<>();
        addressDestMapper.insertSelective(addressDest);
        resultVO.setCode(EnumResult.SUCCESS.getCode());
        resultVO.setMsg(EnumResult.SUCCESS.getMsg());
        return resultVO;

    }

    /**
     * 修改详细地址
     * @param addressDest
     * @return
     */
    @Override
    public ResultVO alterAddressDest(AddressDest addressDest) {

        long timeStamp = DateUtils.getTimeStamp();
        addressDest.setUpdateTime(timeStamp);
        ResultVO<Object> resultVO = new ResultVO<>();
        addressDestMapper.updateByPrimaryKeySelective(addressDest);
        resultVO.setMsg(EnumResult.SUCCESS.getMsg());
        resultVO.setCode(EnumResult.SUCCESS.getCode());
        return resultVO;
    }

    /**
     * 删除地址
     * @param addressDest
     * @return
     */
    @Override
    public ResultVO deleteAddressDest(AddressDest addressDest) {


        long timeStamp = DateUtils.getTimeStamp();
        addressDest.setUpdateTime(timeStamp);
        addressDest.setStaus(new Byte(String.valueOf(0)));

        addressDestMapper.updateByPrimaryKeySelective(addressDest);

        ResultVO<Object> resultVO = new ResultVO<>();
        resultVO.setMsg(EnumResult.SUCCESS.getMsg());
        resultVO.setCode(EnumResult.SUCCESS.getCode());
        return resultVO;
    }

}
