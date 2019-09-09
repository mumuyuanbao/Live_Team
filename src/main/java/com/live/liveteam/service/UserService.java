package com.live.liveteam.service;

import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.result.SimpleResultVO;
import com.live.liveteam.entity.User;
import com.live.liveteam.req.UpdateUserReq;
import com.live.liveteam.vo.UpdateUserVO;

import javax.servlet.http.HttpServletRequest;

public interface UserService {

    SimpleResultVO updateUserInfo(UpdateUserReq req,String token);

    ResultVO<User> login(String code, String rawData, String signature, Integer userIdevice, HttpServletRequest request);

    ResultVO<UpdateUserVO> toQueryUserInfo(String token);

    SimpleResultVO inseryUserPhone(String phone, String token);
}
