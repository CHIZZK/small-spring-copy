package com.kps.springframework.beans.factory;

import com.kps.springframework.beans.BeansException;
import com.kps.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.kps.springframework.beans.factory.config.BeanDefinition;
import com.kps.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @ClassName ConfigurableListableBeanFactory
 * @Description 类注释
 * @Author Zheng
 * @Version 1.0
 **/

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {
    
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
