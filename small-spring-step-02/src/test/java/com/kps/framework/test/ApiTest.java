package com.kps.framework.test;

import com.kps.framework.test.bean.UserService;
import com.kps.springframework.beans.factory.config.BeanDefinition;
import com.kps.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_ApiTest() {
        //1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //2.注册Bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        //registerBeanDefinition方法是从AbstractAutowireCapableBeanFactory中继承的BeanDefinitionRegistry中获取
        beanFactory.registerBeanDefinition("userService",beanDefinition);


        //3.第一次获取Bean
        //getBean方法从AbstractAutowireCapableBeanFactory中继承的BeanFactory中获取
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();


        //4.第二次获取Bean from singleton
        UserService userService_singleton = (UserService) beanFactory.getSingleton("userService");
        userService_singleton.queryUserInfo();
    }

}
