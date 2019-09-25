package com.live.liveteam.mapper;

import com.live.liveteam.entity.AddressDest;
import com.live.liveteam.entity.AddressDestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressDestMapper {
    int countByExample(AddressDestExample example);

    int deleteByExample(AddressDestExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AddressDest record);

    int insertSelective(AddressDest record);

    List<AddressDest> selectByExample(AddressDestExample example);

    AddressDest selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AddressDest record, @Param("example") AddressDestExample example);

    int updateByExample(@Param("record") AddressDest record, @Param("example") AddressDestExample example);

    int updateByPrimaryKeySelective(AddressDest record);

    int updateByPrimaryKey(AddressDest record);

    AddressDest selectByOpenId(String open_id);

    void updateByOpenId(String openId);
}