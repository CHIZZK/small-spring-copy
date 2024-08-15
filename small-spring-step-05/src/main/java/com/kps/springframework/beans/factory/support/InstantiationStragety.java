package com.kps.springframework.beans.factory.support;

import com.kps.springframework.beans.BeansException;
import com.kps.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @ClassName InstantiationStragety
 * @Description 类注释
 * @Author Zheng
 * @Version 1.0
 **/

public interface InstantiationStragety {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
