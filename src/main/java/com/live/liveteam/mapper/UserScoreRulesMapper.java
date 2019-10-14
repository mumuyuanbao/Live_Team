package com.live.liveteam.mapper;


import com.live.liveteam.entity.UserScoreRules;
import com.live.liveteam.entity.UserScoreRulesExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserScoreRulesMapper {
    long countByExample(UserScoreRulesExample example);

    int deleteByExample(UserScoreRulesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserScoreRules record);

    int insertSelective(UserScoreRules record);

    List<UserScoreRules> selectByExample(UserScoreRulesExample example);

    UserScoreRules selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserScoreRules record, @Param("example") UserScoreRulesExample example);

    int updateByExample(@Param("record") UserScoreRules record, @Param("example") UserScoreRulesExample example);

    int updateByPrimaryKeySelective(UserScoreRules record);

    int updateByPrimaryKey(UserScoreRules record);
}