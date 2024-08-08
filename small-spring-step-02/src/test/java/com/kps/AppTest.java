package com.kps;

import static org.junit.Assert.assertTrue;

import com.kps.framework.test.bean.UserService;
import com.kps.springframework.beans.factory.config.BeanDefinition;
import com.kps.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void test_BeanFactory()
    {
        //初始化beanFactory
        DefaultListableBeanFactory beanFactory =new DefaultListableBeanFactory();

        //注册bean
        BeanDefinition beanDefinition= new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        //第一次获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        //第二次获取bean
        UserService userService_singleton =(UserService) beanFactory.getSingleton("userService");
        userService_singleton.queryUserInfo();



    }
}
