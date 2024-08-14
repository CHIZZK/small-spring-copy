package com.kps;

import com.kps.bean.UserDao;
import com.kps.bean.UserService;
import com.kps.springframework.beans.PropertyValue;
import com.kps.springframework.beans.PropertyValues;
import com.kps.springframework.beans.factory.config.BeanDefinition;
import com.kps.springframework.beans.factory.config.BeanReference;
import com.kps.springframework.beans.factory.support.DefaultListableBeanFactory;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 基于cglib实现含构造函数的类实例化策略
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test_BeanFactory() {
        //1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        
        
        //2.userDao注册
        beanFactory.registerBeanDefinition("userDao",new BeanDefinition(UserDao.class));
        
        //3.UserService设置属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("name","10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));
        
        
        //4. UserService 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class,propertyValues);
        beanFactory.registerBeanDefinition("userService",beanDefinition);
        
        //5.UserService 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
