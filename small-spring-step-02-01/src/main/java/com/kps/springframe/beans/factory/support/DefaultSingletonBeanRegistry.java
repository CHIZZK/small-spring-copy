package com.kps.springframe.beans.factory.support;

import com.kps.springframe.beans.factory.config.BeanDefiniton;
import com.kps.springframe.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    public Map<String,BeanDefiniton> singletongBeans = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletongBeans.get(beanName).getBeanClass();
    }
    protected void addSingleton(String beanName, BeanDefiniton singletonObject){
        singletongBeans.put(beanName,singletonObject);
    }
}
