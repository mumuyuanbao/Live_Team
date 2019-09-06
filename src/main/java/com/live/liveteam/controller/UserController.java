package com.live.liveteam.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.live.liveteam.common.enums.EnumResult;
import com.live.liveteam.common.result.PageVO;
import com.live.liveteam.common.result.SimpleResultVO;
import com.live.liveteam.common.exception.BizException;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.utils.MD5Utils;
import com.live.liveteam.common.utils.RedisUtil;
import com.live.liveteam.common.utils.WechatUtil;
import com.live.liveteam.entity.User;
import com.live.liveteam.entity.UserExample;
import com.live.liveteam.mapper.UserMapper;
import com.live.liveteam.req.UpdateUserReq;
import com.live.liveteam.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * 作者：木木豹
 * 时间2019-09-02 20:59
 * 描述：
 */
@Api(description = "用户接口")
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;


    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisUtil redisUtil;

    /**
     * 用户登录
     */
    /**
     * @param code    1.接收小程序发送的code
     * @param rawData 用户非敏感信息：rawDataz
     *                //     * @param signature 校验签名 小程序发送的签名signature与服务器端生成的签名signature2 = sha1(rawData + sessionKey)
     * @return
     */
    @PostMapping("login")
    @ApiOperation(value = "微信登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "code", value = "用户code", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "rawData", value = "用户非敏感信息", dataType = "String", paramType = "query"),
//            @ApiImplicitParam(name = "signature", value = "用户签名", dataType = "String", paramType = "query")

    })
    public ResultVO<User> user_login(@RequestParam(value = "code") String code,
                                     @RequestParam(value = "rawData", required = false) String rawData) {
        ResultVO<User> result = new ResultVO<>();
        // 用户非敏感信息：rawData
        // 签名：signature
        JSONObject rawDataJson = JSON.parseObject(rawData);
        // 1.接收小程序发送的code

        // 2.开发者服务器 登录凭证校验接口 appi + appsecret + code
        JSONObject SessionKeyOpenId = WechatUtil.getSessionKeyOrOpenId(code);
        // 3.接收微信接口服务 获取返回的参数

        String openid = SessionKeyOpenId.getString("openid");

        String sessionKey = SessionKeyOpenId.getString("session_key");
        //如果openid为null代表code错误，微信服务器无此用户
        if (openid==null){
            throw  new BizException(EnumResult.USER_CHECK_LOGIN_ERROR.getCode(),EnumResult.USER_CHECK_LOGIN_ERROR.getMsg());
        }
        // 4.校验签名 小程序发送的签名signature与服务器端生成的签名signature2 = sha1(rawData + sessionKey)
//        String signature2 = DigestUtils.sha1Hex(rawData + sessionKey);
//        if (!signature.equals(signature2)) {
//            return new ResultVO<User>(EnumResult.WEACHAT_USER_SIGNATURE.getCode(), EnumResult.WEACHAT_USER_SIGNATURE.getMsg());
//        }
        // 5.根据返回的User实体类，判断用户是否是新用户，是的话，将用户信息存到数据库；不是的话，更新最新登录时间
        User user = userMapper.selectByPrimaryKey(openid);
        // uuid生成唯一key，用于维护微信小程序用户与服务端的会话

        long time = new Date().getTime();
        String userToken = MD5Utils.createUserToken(time);
        if (user == null) {
//             用户信息入库
            String nickName = rawDataJson.getString("nickName");
            String avatarUrl = rawDataJson.getString("avatarUrl");
            String gender = rawDataJson.getString("gender");
            String city = rawDataJson.getString("city");
            String country = rawDataJson.getString("country");
            String province = rawDataJson.getString("province");
            user = new User();
            user.setOpenId(openid);
            user.setCreateTime(new Date());
            user.setLastVisitTime(new Date());
            user.setSessionKey(sessionKey);
            user.setCity(city);
            user.setProvince(province);
            user.setCountry(country);
            user.setAvatarUrl(avatarUrl);
            user.setGender((byte) Integer.parseInt(gender));
            user.setNickName(nickName);

            userMapper.insert(user);
        } else {
            // 已存在，更新用户登录时间
            user.setLastVisitTime(new Date());
            // 重新设置会话skey
            userMapper.updateByPrimaryKey(user);
        }
        //encrypteData比rowData多了appid和openid
        //JSONObject userInfo = WechatUtil.getUserInfo(encrypteData, sessionKey, iv);
        //6. 把新的skey返回给小程序
        redisUtil.set(RedisUtil.LOGIN_USER_STRING + userToken, user,RedisUtil.USER_TOKEN_TIME);
        result.setCode(EnumResult.SUCCESS.getCode());
        result.setMsg(EnumResult.SUCCESS.getMsg());
        result.setData(user);
        return result;
    }


    /**
     * 获取用户公开信息
     */
    @GetMapping("QureyUserInfo")
    @ApiImplicitParam(name = "token", value = "", dataType = "String", paramType = "query")
    public ResultVO<User> QureyUserInfo(String token){
//        User user = userMapper.selectByPrimaryKey(token);
        ResultVO<User> result = new ResultVO<User>();
        if (token != null) {
            throw new  BizException(EnumResult.USER_TOKEN_NULL.getCode(),EnumResult.USER_TOKEN_NULL.getMsg());
        }
            Object userInfo = redisUtil.get(RedisUtil.LOGIN_USER_STRING + token);
        if (userInfo==null){
            throw new  BizException(EnumResult.USER_TOKEN_LOSE.getCode(),EnumResult.USER_TOKEN_LOSE.getMsg());
        }
        String s = JSON.toJSONString(userInfo);
        User user = JSONObject.parseObject(s, User.class);
        //        User user = JSON.parseObject((String) o,User.class);

        result.setData(user);
        result.setMsg(EnumResult.SUCCESS.getMsg());
        result.setCode(EnumResult.SUCCESS.getCode());
        return result;
    }


    /**
     * 修改用户公开信息
     */
    @GetMapping("updateUserInfo")
    @ApiOperation(value = "修改用户信息")
    public SimpleResultVO updateUserInfo(@RequestBody UpdateUserReq req, String token){
        return  userService.updateUserInfo(req,token);
    }

    /**
     * 测试page分页
     */
    @GetMapping("getlist")
    @ApiOperation("测试分页")
    public ResultVO<PageVO<User>> getpage(){
        ResultVO<PageVO<User>> result = new ResultVO<>();
        PageVO<User> page = new PageVO<>();
        UserExample userExample = new UserExample();
        PageHelper.startPage(3,5);
        List<User> list = userMapper.selectByExample(userExample);
        PageInfo<User> pageInfo = new PageInfo<>(list);
        page.setData(list);
        page.savePageinfo(pageInfo);
        result.setData(page);
        return result;
    }
}
