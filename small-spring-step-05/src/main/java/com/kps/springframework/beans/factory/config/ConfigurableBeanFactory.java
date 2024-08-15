package com.kps.springframework.beans.factory.config;

import com.kps.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @ClassName ConfigurableBeanFactory
 * @Description 类注释
 * @Author Zheng
 * @Version 1.0
 **/

public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {
    String SCOPE_SINGLETON = "singleton";
    String SCOPE_PROTOTYPE =  "prototype";
}
