package com.kps.springframework.test.bean;

/**
 * @ClassName UserService
 * @Description 类注释
 * @Author Zheng
 * @Version 1.0
 **/

public class UserService {
    private String name;
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserService(String name) {
        this.name = name;
    }

    public UserService() {
    }
    public void queryUserInfo() {
        System.out.println("查询用户信息：" + userDao.queryUserName(name));
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(name);
        return sb.toString();
    }
}
