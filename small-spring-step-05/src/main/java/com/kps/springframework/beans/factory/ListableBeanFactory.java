package com.kps.springframework.beans.factory;

import com.kps.springframework.beans.BeansException;

import java.util.Map;

/**
 * @ClassName ListableBeanFactory
 * @Description 类注释
 * @Author Zheng
 * @Version 1.0
 **/

public interface ListableBeanFactory extends BeanFactory {
    /**
     * 按照类型返回bean实例*/
    <T>Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * 返回注册表中所有的bean名称
     */
    String[] getBeanDefinitionNames();

}
