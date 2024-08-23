package com.kps.springframe.beans.factory.support;

import com.kps.springframe.beans.factory.config.BeanDefiniton;

public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefiniton beanDefinition);
}
