package com.kps;

import com.kps.springframe.beans.factory.config.BeanDefiniton;
import com.kps.springframe.beans.factory.support.DefaultListableBeanFactory;
import com.kps.springframe.test.bean.UserService;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void test() throws Exception
    {
        //创建bean工厂
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        
        //注册bean
        BeanDefiniton beanDefiniton = new BeanDefiniton(UserService.class);
        beanFactory.registerBeanDefinition("userService",beanDefiniton);
        
        //第一次获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        
        //第二次获取bean
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");   
        userService_singleton.queryUserInfo();
    }
}
