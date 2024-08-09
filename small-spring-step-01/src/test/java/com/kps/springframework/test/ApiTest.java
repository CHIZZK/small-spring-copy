package com.kps.springframework.test;

import com.kps.springframework.BeanDefinition;
import com.kps.springframework.BeanFactory;
import com.kps.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @ClassName ApiTest
 * @Description 类注释
 * @Author Zheng
 * @Version 1.0
 **/

public class ApiTest {
    @Test
    public void test_BeanFactory() {
        //初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        //注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        //这里放入的是bean实例
        beanFactory.registerBeanDefinition("userService",beanDefinition);

        //获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
