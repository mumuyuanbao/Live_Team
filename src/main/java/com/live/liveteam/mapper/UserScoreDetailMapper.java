package com.live.liveteam.mapper;


import com.live.liveteam.entity.UserScoreDetail;
import com.live.liveteam.entity.UserScoreDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserScoreDetailMapper {
    long countByExample(UserScoreDetailExample example);

    int deleteByExample(UserScoreDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserScoreDetail record);

    int insertSelective(UserScoreDetail record);

    List<UserScoreDetail> selectByExample(UserScoreDetailExample example);

    UserScoreDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserScoreDetail record, @Param("example") UserScoreDetailExample example);

    int updateByExample(@Param("record") UserScoreDetail record, @Param("example") UserScoreDetailExample example);

    int updateByPrimaryKeySelective(UserScoreDetail record);

    int updateByPrimaryKey(UserScoreDetail record);
}