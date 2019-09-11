package com.live.liveteam;

import com.live.liveteam.common.enums.EnumScoreDetailInfo;
import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.common.utils.RedisUtil;
import com.live.liveteam.entity.User;
import com.live.liveteam.service.CouponsService;
import com.live.liveteam.service.UserScoreDetailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LiveteamApplicationTests {
    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private UserScoreDetailService userScoreDetailService;

    @Test
    public void contextLoads() {
        User user = new User();
        Date date = new Date();
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

    @Autowired
    private CouponsService couponsService;

    @Test
    public void test1() {
        userScoreDetailService.insertScoreDetail("1", EnumScoreDetailInfo.GET_FROM_REGIST, -50);
    }

}
