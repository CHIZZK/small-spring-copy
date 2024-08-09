package com.kps.springframework.beans.factory.config;

/**
 * @ClassName SingletonBeanRegistry
 * @Description 单例bean注册
 * @Author Zheng
 * @Version 1.0
 **/

public interface SingletonBeanRegistry {
    //通过名称获取单例bean
    Object  getSingleton(String beanName);
}
