package com.live.liveteam.service.impl;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.live.liveteam.common.constant.BizConstant;
import com.live.liveteam.common.enums.EnumResult;
import com.live.liveteam.common.exception.BizException;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.result.SimpleResultVO;
import com.live.liveteam.common.utils.*;
import com.live.liveteam.entity.User;
import com.live.liveteam.entity.UserExample;
import com.live.liveteam.mapper.UserMapper;
import com.live.liveteam.req.UpdateUserReq;
import com.live.liveteam.service.UserService;
import com.live.liveteam.vo.UpdateUserVO;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * 作者：木木豹
 * 时间2019-09-02 21:06
 * 描述：
 */
@Service
public class UserServiceImpl implements UserService {
    //    private  static  final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisUtil redisUtil;

    /**
     * 用户登录
     *
     * @param code
     * @param rawData
     * @param signature
     * @param userIdevice
     * @param request
     * @return
     */
    @Override
    public ResultVO<User> login(String code, String rawData, String signature, Integer userIdevice, HttpServletRequest request) {
        ResultVO<User> result = new ResultVO<>();
        // 用户非敏感信息：rawData
        // 签名：signature
        JSONObject rawDataJson = JSON.parseObject(rawData);
        // 1.接收小程序发送的code

        // 2.开发者服务器 登录凭证校验接口 appi + appsecret + code
        JSONObject SessionKeyOpenId = WechatUtil.getSessionKeyOrOpenId(code);
        // 3.接收微信接口服务 获取返回的参数

        String openid = SessionKeyOpenId.getString("openid");
        //session 解密秘钥
        String sessionKey = SessionKeyOpenId.getString("session_key");
        //如果openid为null代表code错误，微信服务器无此用户
        if (openid == null) {
            throw new BizException(EnumResult.USER_CHECK_LOGIN_ERROR.getCode(), EnumResult.USER_CHECK_LOGIN_ERROR.getMsg());
        }
        if (signature != null) {
            //4.校验签名 小程序发送的签名signature与服务器端生成的签名signature2 = sha1(rawData + sessionKey)
            String signature2 = DigestUtils.sha1Hex(rawData + sessionKey);
            if (!signature.equals(signature2)) {
                throw new BizException(EnumResult.WEACHAT_USER_SIGNATURE.getCode(), EnumResult.WEACHAT_USER_SIGNATURE.getMsg());
            }
        }
        // 5.根据返回的User实体类，判断用户是否是新用户，是的话，将用户信息存到数据库；不是的话，更新最新登录时间
        User user = userMapper.selectByPrimaryKey(openid);
        // uuid生成唯一key，用于维护微信小程序用户与服务端的会话
        long time = new Date().getTime();
        String userToken = MD5Utils.createUserToken(time);


        if (user == null) {
//       如果为新用户创建用户实体     用户信息入库
            user = User.newUserEntity();
            try {
                /*-  获取用户基本信息插入到实体类中         -*/
                String nickName = rawDataJson.getString("nickName");
                String avatarUrl = rawDataJson.getString("avatarUrl");
                String gender = rawDataJson.getString("gender");
                String city = rawDataJson.getString("city");
                String country = rawDataJson.getString("country");
                String province = rawDataJson.getString("province");
                user.setOpenId(openid);
                user.setSessionKey(sessionKey);
                user.setCity(city);
                user.setProvince(province);
                user.setCountry(country);
                user.setAvatarUrl(avatarUrl);
                user.setNickName(nickName);
                /*设置其他实体类属性*/

                //最近登录设备
                user.setUserIdevice(userIdevice);
                //设置创建时间
                user.setCreateTime(DateUtils.getTimeStamp());
                //用户最后登录IP
                user.setUserLastIp(AddressUtils.getIpAddr(request));

                //用户最后登录地址
                AddressUtils addressUtils = new AddressUtils();
                user.setUserLoginAddress(addressUtils.getAddresses(user.getUserLastIp(), "utf-8"));
                //用户最后登录时间
                user.setLastVisitTime(DateUtils.getTimeStamp());

            } catch (Exception e) {
                throw new BizException(EnumResult.USER_ADD_INFORMATION_FAILED.getCode(), EnumResult.USER_ADD_INFORMATION_FAILED.getMsg());
            }
            userMapper.insert(user);
        } else {

            try {
                //登录次数+1
                user.setUserLoginNum(user.getUserLoginNum() + BizConstant.LOGIN_SIZE);
                //最近登录设备
                user.setUserIdevice(userIdevice);
                //用户最后登录IP
                user.setUserLastIp(AddressUtils.getIpAddr(request));
                //用户最后登录地址
                AddressUtils addressUtils = new AddressUtils();
                user.setUserLoginAddress(addressUtils.getAddresses(user.getUserLastIp(), "utf-8"));
                //用户最后登录时间
                user.setLastVisitTime(DateUtils.getTimeStamp());
                // 重新设置会话skey
                userMapper.updateByPrimaryKey(user);
            } catch (Exception e) {
                throw new BizException(EnumResult.USER_CHECK_LOGIN_ERROR.getCode(), EnumResult.USER_CHECK_LOGIN_ERROR.getMsg());

            }
        }
//        encrypteData比rowData多了appid和openid
//        JSONObject userInfo = WechatUtil.getUserInfo(encrypteData, sessionKey, iv);
        //6. 把新的skey返回给小程序
        redisUtil.set(RedisUtil.LOGIN_USER_STRING + userToken, user, RedisUtil.USER_TOKEN_TIME);
        result.setCode(EnumResult.SUCCESS.getCode());
        result.setMsg(EnumResult.SUCCESS.getMsg());
        result.setData(user);
        return result;
    }

    /**
     * 获取个人信息能修改的信息
     *
     * @return
     */
    @Override
    public ResultVO<UpdateUserVO> toQueryUserInfo(String token) {
        ResultVO<UpdateUserVO> result = new ResultVO<UpdateUserVO>();
        UpdateUserVO updateUserVO = new UpdateUserVO();
        Object info = redisUtil.get(token);
        if (info != null) {
            //json转实体类
            User user = JSONObject.parseObject(JSONObject.toJSONString(info), User.class);
            //实体类转换
            updateUserVO.setAvatarUrl(user.getAvatarUrl());
            updateUserVO.setGender(user.getGender());
            updateUserVO.setNickName(user.getNickName());
            updateUserVO.setUserBirthday(user.getUserBirthday());
            //判断是否可以修改生日
            if (user.getUserIsNot() == 1) {
                updateUserVO.setUserIsNot(false);
            } else {
                updateUserVO.setUserIsNot(true);
            }
        }
        result.setData(updateUserVO);
        result.setCode(EnumResult.SUCCESS.getCode());
        result.setMsg(EnumResult.SUCCESS.getMsg());
        return result;
    }

    /**
     * 绑定用户手机号，若已经绑定无法修改
     * @param phone
     * @param token
     * @return
     */
    @Override
    public SimpleResultVO inseryUserPhone(String phone, String token) {


        return null;
    }

    /**
     * 修改用户个人信息
     *
     * @param req
     * @return
     */
    @Override
    public SimpleResultVO updateUserInfo(UpdateUserReq req, String token) {
        SimpleResultVO result = new SimpleResultVO();
        User user = new User();
        if (req != null) {
            user.setAvatarUrl(req.getAvatarUrl());
            user.setGender(req.getGender());
            user.setNickName(req.getNickName());
        }
        Object userInfo = redisUtil.get(token);
        String info = JSON.toJSONString(userInfo);
        User user2 = JSONObject.parseObject(info, User.class);
        user.setOpenId(user2.getOpenId());
        if (user2.getUserIsNot() == 0) {
            user.setUserBirthday(req.getUserBirthday());
            user.setUserIsNot(1);
        }
        //想数据库更新userinfo具体值
        int count = userMapper.updateByPrimaryKeySelective(user);
        //修改redis缓存中的值
        if (count > 0) {
            BeanUtils.copyProperties(user2, user);
            redisUtil.set(RedisUtil.LOGIN_USER_STRING + token, user2);
        }
        result.setCode(EnumResult.SUCCESS.getCode());
        result.setMsg(EnumResult.SUCCESS.getMsg());
        return result;
    }


}
