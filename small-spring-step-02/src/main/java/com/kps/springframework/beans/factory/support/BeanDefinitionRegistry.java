package com.kps.springframework.beans.factory.support;

import com.kps.springframework.beans.factory.config.BeanDefinition;

/**
 * @ClassName BeanDefinitionRegistry
 * @Description 类注释
 * @Author Zheng
 * @Version 1.0
 **/

public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
