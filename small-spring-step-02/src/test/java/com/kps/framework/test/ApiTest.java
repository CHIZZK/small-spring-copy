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
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }
    
    //思路整理：
    //首先初始化beanFactory，DefaultListableBeanFactory继承AbstractAutowireCapableBeanFactory,实现了BeanDefinitionRegistry接口，
    //defaultlistablebeanfactory实现了BeanDefinitionRegistry接口中的registryBeanDefinition方法，
    //defaultlistablebeanfactory继承实现了abstractbeanfactory抽象类中的抽象方法getbeandefinition,获取到注册的beandefinition；
    //abstractautowirecapablebeanfactory继承实现了abstractbeanfactory抽象类中的抽象方法createBean，
    //abstractbeanfactory实现了beanfactory接口的getbean方法，继承了defaultsingletonbeanregistry抽象类中的抽象方法getSingleton，并在getbean的方法实现中进行调用
    

}
