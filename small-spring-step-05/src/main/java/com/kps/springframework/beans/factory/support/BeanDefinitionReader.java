package com.kps.springframework.beans.factory.support;

import com.kps.springframework.beans.BeansException;
import com.kps.springframework.core.io.Resource;
import com.kps.springframework.core.io.ResourceLoader;

/**
 * @ClassName BeanDefinitionReader
 * @Description 类注释
 * @Author Zheng
 * @Version 1.0
 **/

public interface BeanDefinitionReader {
    BeanDefinitionRegistry getRegistry();
    ResourceLoader getResourceLoader();
    void loadBeanDefinitions(Resource resource) throws BeansException;
    void loadBeanDefinitions(Resource... resources) throws BeansException;
    void loadBeanDefinitions(String location) throws BeansException;
}
