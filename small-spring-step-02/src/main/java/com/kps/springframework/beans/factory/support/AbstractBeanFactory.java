package com.kps.springframework.beans.factory.support;

import com.kps.springframework.beans.BeansException;
import com.kps.springframework.beans.factory.BeanFactory;
import com.kps.springframework.beans.factory.config.BeanDefinition;

/**
 * @ClassName AbstractaBeanFactory
 * @Description 类注释
 * @Author Zheng
 * @Version 1.0
 **/

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        // 不为空 返回bean
        if (bean != null) {
            return bean;
        }
        //为空 根据bean定义创建bean
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name,beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
