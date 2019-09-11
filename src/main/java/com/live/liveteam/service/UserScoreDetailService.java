package com.live.liveteam.service;

import com.live.liveteam.common.enums.EnumScoreDetailInfo;
import com.live.liveteam.common.result.PageVO;
import com.live.liveteam.common.result.ResultVO;
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

    ResultVO<PageVO<UserScoreDetail>> queryScoreDetailByOpenId(Integer pageNum, Integer pageSize, String openId);

    ResultVO<List<UserScoreDetail>> queryAll();

    ResultVO<Integer> queryTotalScore(String openId);

    SimpleResultVO insertScoreDetail(String openId, EnumScoreDetailInfo info, Integer value);


}
