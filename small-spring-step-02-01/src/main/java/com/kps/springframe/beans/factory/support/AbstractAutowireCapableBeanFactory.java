package com.kps.springframe.beans.factory.support;

import com.kps.springframe.beans.BeansException;
import com.kps.springframe.beans.factory.config.BeanDefiniton;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{
    @Override
    protected Object createBean(String beanName, BeanDefiniton beanDefinition) throws BeansException, InstantiationException, IllegalAccessException {
        Object bean = beanDefinition.getBeanClass().newInstance();
        return bean;
    }
}
