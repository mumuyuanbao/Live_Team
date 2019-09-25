package com.live.liveteam.mapper;

import com.live.liveteam.entity.GoodsMadeUp;
import com.live.liveteam.entity.GoodsMadeUpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsMadeUpMapper {
    int countByExample(GoodsMadeUpExample example);

    int deleteByExample(GoodsMadeUpExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsMadeUp record);

    int insertSelective(GoodsMadeUp record);

    List<GoodsMadeUp> selectByExample(GoodsMadeUpExample example);

    GoodsMadeUp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsMadeUp record, @Param("example") GoodsMadeUpExample example);

    int updateByExample(@Param("record") GoodsMadeUp record, @Param("example") GoodsMadeUpExample example);

    int updateByPrimaryKeySelective(GoodsMadeUp record);

    int updateByPrimaryKey(GoodsMadeUp record);
}