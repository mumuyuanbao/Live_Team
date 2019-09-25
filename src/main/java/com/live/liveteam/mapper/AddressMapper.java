package com.live.liveteam.mapper;

import com.live.liveteam.entity.Address;
import com.live.liveteam.entity.AddressDest;
import com.live.liveteam.entity.AddressExample;
import java.util.List;

import com.live.liveteam.vo.AddressDestVO;
import org.apache.ibatis.annotations.Param;

public interface AddressMapper {
    int countByExample(AddressExample example);

    int deleteByExample(AddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Address record);

    int insertSelective(Address record);

    List<Address> selectByExample(AddressExample example);

    Address selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressExample example);

    int updateByExample(@Param("record") Address record, @Param("example") AddressExample example);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);

    Address selectByPId(Long area);
}