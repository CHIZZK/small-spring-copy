package com.kps.springframework.beans.factory.support;

import com.kps.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName DefaultSingletonBeanRegistry
 * @Description 类注释
 * @Author Zheng
 * @Version 1.0
 **/

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private final Map<String,Object> singletonObjects =new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }
    
    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName,singletonObject);
    }
}
