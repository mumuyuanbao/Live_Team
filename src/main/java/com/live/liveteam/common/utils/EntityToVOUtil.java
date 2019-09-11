package com.live.liveteam.common.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 作者: XW
 * 时间: 2019/9/11 13:45
 * 描述: 将entity对象中的属性放入VO中的工具类
 *      VO中有entity中没有的属性时该属性为null
 */
public class EntityToVOUtil {

    public static Object getVO(Object entity, Class<?> vo){
        // 创建要返回的VO对象
        Object target = null;
        try {
            target = vo.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("无法创建对象");
        }
        Class<?> entityClass = entity.getClass();
        // 获取VO中所有属性
        Field[] fields = vo.getDeclaredFields();
        for (Field field : fields) {
            // 更改属性权限
            field.setAccessible(true);
            String name = field.getName();
            String mName;
            // 确定方法名
            if (name.length() == 1) {
                mName = name.toUpperCase();
            } else {
                char c = name.charAt(1);
                if (c >= 65 && c <= 90) {
                    mName = name;
                } else {
                    mName = name.toUpperCase().charAt(0) + name.substring(1);
                }
            }
            Method method = null;
            Method method1 = null;
            try {
                method = vo.getDeclaredMethod("set" + mName, field.getType());
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("检查方法有无set方法");
            }
            try {
                method1 = entityClass.getDeclaredMethod("get" + mName);
            } catch (Exception e) {
                // entity中无该属性的get方法时跳过本轮
                continue;
            }
            try {
                method.invoke(target, method1.invoke(entity));
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("发生未知错误");
            }
        }
        return target;
    }


}
