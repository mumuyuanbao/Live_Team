package com.live.liveteam.common.utils;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 作者：木木豹
 * 时间2019-09-09 19:05
 * 描述：
 */
public class OrderNumUtils {

    public static String getOrderIdByUUId() {
        String machineId = "SHS";//最大支持1-9个集群机器部署
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if (hashCodeV < 0) {//有可能是负数
            hashCodeV = -hashCodeV;
        }
        // 0 代表前面补充0
        // 4 代表长度为4
        // d 代表参数为正数型
        return machineId + String.format("%015d", hashCodeV);
    }

    public static void main(String[] args) {
        Set s = new HashSet();

        for (int i=0;i<10000;i++){
            String r = OrderNumUtils.getOrderIdByUUId();
            System.out.println(r);
            s.add(r);
        }
        System.out.println(s.size());

    }

}
