package com.kps.springframework.beans.factory.config;

/**
 * @ClassName BeanDefinitionRegistry
 * @Description 单例bean注册
 * @Author Zheng
 * @Version 1.0
 **/

public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
