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
import com.live.liveteam.common.utils.*;
import com.live.liveteam.entity.User;
import com.live.liveteam.entity.UserExample;
import com.live.liveteam.mapper.UserMapper;
import com.live.liveteam.req.UpdateUserReq;
import com.live.liveteam.service.UserService;
import com.live.liveteam.vo.UpdateUserVO;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.tools.jstat.Token;

import javax.servlet.http.HttpServletRequest;
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
            @ApiImplicitParam(name = "signature", value = "用户签名", dataType = "String", paramType = "query"),
//            @ApiImplicitParam(name = "encrypteData", value = "密文", dataType = "String", paramType = "query"),
//            @ApiImplicitParam(name = "iv", value = "偏向量", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "userIdevice", value = "登录设备0-PC 1-移动H5 2-微信 3-安卓 4-IOS", dataType = "int", paramType = "query"),

    })
    public ResultVO<User> user_login(@RequestParam(value = "code", required = true) String code,
                                     @RequestParam(value = "rawData", required = false) String rawData,
                                     @RequestParam(value = "signature", required = false) String signature,
                                     @RequestParam(value = "userIdevice", required = true) Byte userIdevice, HttpServletRequest request
    ) {
        return userService.login(code, rawData, signature, userIdevice, request);
    }


    /**
     * 获取用户公开信息
     */
    @GetMapping("QureyUserInfo")
    @ApiImplicitParam(name = "token", value = "查询用户信息", dataType = "String", paramType = "query")
    public ResultVO<User> QureyUserInfo(String token) {
//        User user = userMapper.selectByPrimaryKey(token);
        ResultVO<User> result = new ResultVO<User>();
        if (token != null) {
            throw new BizException(EnumResult.USER_TOKEN_NULL.getCode(), EnumResult.USER_TOKEN_NULL.getMsg());
        }
        Object userInfo = redisUtil.get(RedisUtil.LOGIN_USER_STRING + token);
        if (userInfo == null) {
            throw new BizException(EnumResult.USER_TOKEN_LOSE.getCode(), EnumResult.USER_TOKEN_LOSE.getMsg());
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
     *到用户修改信息
     */
    @GetMapping("toQueryUserInfo")
    @ApiOperation(value = "到用户修改信息")
    public ResultVO<UpdateUserVO> toQueryUser(String token) {
        return userService.toQueryUserInfo(token);
    }



    /**
     * 修改用户信息
     */
    @PostMapping("updateUserInfo")
    @ApiOperation(value = "修改用户信息")
    public SimpleResultVO updateUserInfo(@RequestBody UpdateUserReq req, String token) {
        return userService.updateUserInfo(req, token);
    }


    /**
     * 绑定手机号
     */
    @GetMapping("bindingPhone")
    @ApiOperation(value = "修改用户信息")
    public SimpleResultVO InsertUserPhone(String phone,String token) {
        return userService.inseryUserPhone(phone, token);
    }

    /**
     * 测试page分页
     */
    @GetMapping("getlist")
    @ApiOperation("测试分页")
    public ResultVO<PageVO<User>> getpage() {
        ResultVO<PageVO<User>> result = new ResultVO<>();
        PageVO<User> page = new PageVO<>();
        UserExample userExample = new UserExample();
        PageHelper.startPage(3, 5);
        List<User> list = userMapper.selectByExample(userExample);
        PageInfo<User> pageInfo = new PageInfo<>(list);
        page.setData(list);
        page.savePageinfo(pageInfo);
        result.setData(page);
        return result;
    }
}
