package com.kps.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName UserDao
 * @Description
 * @Author Zheng
 * @Version 1.0
 **/

public class UserDao {
    private static Map<String,String> map = new HashMap<>();
    static {
        map.put("10001","张三");
        map.put("10002","李四");
        map.put("10003","王五");
    }
    public String queryUserName(String uId) {
        return map.get(uId);
    }
}
