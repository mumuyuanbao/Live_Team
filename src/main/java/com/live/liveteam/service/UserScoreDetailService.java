package com.live.liveteam.service;

import com.live.liveteam.common.enums.EnumScoreDetailInfo;
import com.live.liveteam.common.result.SimpleResultVO;
import com.live.liveteam.entity.User;
import com.live.liveteam.entity.UserScoreDetail;

import java.util.List;

/**
 * 作者: XW
 * 时间: 2019/9/7 11:34
 * 描述:
 */
public interface UserScoreDetailService {

    List<UserScoreDetail> queryScoreDetailByOpenId(String token);

    List<UserScoreDetail> queryAll();

    Integer queryTotalScore(String openId);

    SimpleResultVO insertScoreDetail(User user, EnumScoreDetailInfo info, Integer value);


}
