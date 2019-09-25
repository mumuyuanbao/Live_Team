package com.live.liveteam.service;

import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.result.SimpleResultVO;
import com.live.liveteam.entity.User;
import com.live.liveteam.req.UpdateUserReq;
import com.live.liveteam.vo.UpdateUserVO;
import com.live.liveteam.vo.UserTokenVO;

import javax.servlet.http.HttpServletRequest;

public interface UserService {

    SimpleResultVO updateUserInfo(UpdateUserReq req,String openId);

    ResultVO<UserTokenVO> login(String code, String rawData, String signature, String encrypteData, String iv, Integer userIdevice, HttpServletRequest request);

    ResultVO<UpdateUserVO> toQueryUserInfo(String openId);

    SimpleResultVO inseryUserPhone(String phone, String openId);

}
