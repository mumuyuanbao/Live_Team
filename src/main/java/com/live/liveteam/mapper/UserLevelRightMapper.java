package com.live.liveteam.mapper;

import com.live.liveteam.entity.UserLevelRight;
import com.live.liveteam.entity.UserLevelRightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLevelRightMapper {
    int countByExample(UserLevelRightExample example);

    int deleteByExample(UserLevelRightExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserLevelRight record);

    int insertSelective(UserLevelRight record);

    List<UserLevelRight> selectByExample(UserLevelRightExample example);

    UserLevelRight selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserLevelRight record, @Param("example") UserLevelRightExample example);

    int updateByExample(@Param("record") UserLevelRight record, @Param("example") UserLevelRightExample example);

    int updateByPrimaryKeySelective(UserLevelRight record);

    int updateByPrimaryKey(UserLevelRight record);
}