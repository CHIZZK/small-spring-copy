package com.kps.springframe.beans.factory.config;
//bean定义注册接口
public interface SingletonBeanRegistry {
    //通过名称获取单例bean
    Object getSingleton(String beanName);
}
