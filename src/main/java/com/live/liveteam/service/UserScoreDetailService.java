package com.live.liveteam.service;

import com.live.liveteam.common.result.SimpleResultVO;
import com.live.liveteam.entity.UserScoreDetail;

import java.util.List;

/**
 * 作者: XW
 * 时间: 2019/9/7 11:34
 * 描述:
 */
public interface UserScoreDetailService {

    List<UserScoreDetail> queryScoreDetailByOpenId(String openId);

    List<UserScoreDetail> queryAll();

    SimpleResultVO insertScoreDetail(UserScoreDetail userScoreDetail);

}
