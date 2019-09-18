package com.live.liveteam.mapper;

import com.live.liveteam.entity.GoodsSnapUp;
import com.live.liveteam.entity.GoodsSnapUpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsSnapUpMapper {
    int countByExample(GoodsSnapUpExample example);

    int deleteByExample(GoodsSnapUpExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsSnapUp record);

    int insertSelective(GoodsSnapUp record);

    List<GoodsSnapUp> selectByExample(GoodsSnapUpExample example);

    GoodsSnapUp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsSnapUp record, @Param("example") GoodsSnapUpExample example);

    int updateByExample(@Param("record") GoodsSnapUp record, @Param("example") GoodsSnapUpExample example);

    int updateByPrimaryKeySelective(GoodsSnapUp record);

    int updateByPrimaryKey(GoodsSnapUp record);
}