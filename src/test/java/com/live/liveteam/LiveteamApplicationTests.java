package com.live.liveteam;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.live.liveteam.common.utils.RedisUtil;
import com.live.liveteam.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LiveteamApplicationTests {
    @Autowired
    private RedisUtil redisUtil;



    @Test
    public void contextLoads() {
        User user = new User();
        Date date = new Date();
        user.setCreateTime(date);
        user.setNickName("zhangsn方法");
        user.setCity("杭州");
        List<User> list = new ArrayList<>();
        list.add(user);
//        String s = JSON.toJSONString(user);
        boolean user1 = redisUtil.set("user7", user,100L);
//       list1 = (List<User>) redisUtil.get("user6");
//        String s = user5.toString();


//        System.out.println(user5);
    }

}
