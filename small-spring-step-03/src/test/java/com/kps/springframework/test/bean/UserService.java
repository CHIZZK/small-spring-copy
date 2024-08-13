package com.kps.springframework.test.bean;

/**
 * @ClassName UserService
 * @Description 类注释
 * @Author Zheng
 * @Version 1.0
 **/

public class UserService {
    private String name;

    public UserService(String name) {
        this.name = name;
    }

    public UserService() {
    }
    public void queryUserInfo() {
        System.out.println("查询用户信息：" + name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(name);
        return sb.toString();
    }
}
