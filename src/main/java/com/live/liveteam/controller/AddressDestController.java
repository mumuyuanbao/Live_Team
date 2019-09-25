package com.live.liveteam.controller;

import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.entity.Address;
import com.live.liveteam.entity.AddressDest;
import com.live.liveteam.mapper.AddressDestMapper;
import com.live.liveteam.service.AddressDestService;
import com.live.liveteam.vo.AddressDestVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;
import java.util.List;

/**
 * 作者：张钰磊
 * 时间2019/9/11 21:12
 * 描述地址管理
 */
@Api(description = "详细地址管理")
@RequestMapping("addressdest")
@RestController
public class AddressDestController {

    @Autowired
    private AddressDestService addressDestService;

    //查询详细地址
        @GetMapping("queryaddress")
    @ApiOperation(value = "查询所有地址")
    @ApiImplicitParam(name = "open_id", value = "用户id", dataType = "String", paramType = "query")
    public ResultVO<List<AddressDestVO>> queryAddress(String open_id){
        return addressDestService.selectAddressDest(open_id);
    }

    //设置默认地址与否
    @PostMapping("alterdefault")
    @ApiOperation(value = "修改地址默认与否")
    @ApiImplicitParam(name = "id", value = "地址id", dataType = "Long", paramType = "query")
    public ResultVO alterDefault(Long id){
        return addressDestService.alterAddressDefault(id);
    }

    //新增地址
    @PostMapping("insertaddress")
    @ApiOperation(value = "新增地址")
    public ResultVO insertAddress(AddressDest addressDest){
        return addressDestService.insertAddressDest(addressDest);
    }

    //修改地址
    @PostMapping("alteraddress")
    @ApiOperation(value = "修改地址详情")
    public ResultVO alterAddress(AddressDest addressDest){
        return addressDestService.alterAddressDest(addressDest);
    }
    //删除地址
    @PostMapping("deleteaddress")
    @ApiOperation(value = "删除地址")
    public ResultVO deleteAddress(AddressDest addressDest){
        return  addressDestService.deleteAddressDest(addressDest);
    }
}
