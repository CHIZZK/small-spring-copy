package com.kps.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName BeanFactory
 * @Description Bean工厂
 * @Author Zheng
 * @Version 1.0
 **/

public class BeanFactory {
    //String：bean名称 BeanDefinition实例
    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();
    //通过名称获取beandefinition实例
    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }
    //注册beandefinition实例
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name,beanDefinition);
    }
}
