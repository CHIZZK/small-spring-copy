package com.kps.springframework.beans.factory.config;

/**
 * @ClassName SingletonBeanRegistry
 * @Description 类注释
 * @Author Zheng
 * @Version 1.0
 **/

public interface SingletonBeanRegistry {
    Object  getSingleton(String beanName);
}
