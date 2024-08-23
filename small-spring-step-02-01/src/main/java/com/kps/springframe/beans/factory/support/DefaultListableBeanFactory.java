package com.kps.springframe.beans.factory.support;

import com.kps.springframe.beans.BeansException;
import com.kps.springframe.beans.factory.config.BeanDefiniton;

import java.util.HashMap;
import java.util.Map;

public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry{
    public Map<String,BeanDefiniton> singletongBeans = new HashMap<>();
    @Override
    protected BeanDefiniton getBeanDefinition(String beanName) throws BeansException {
        return singletongBeans.get(beanName);
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefiniton beanDefinition) {
        singletongBeans.put(beanName,beanDefinition);
    }
}
