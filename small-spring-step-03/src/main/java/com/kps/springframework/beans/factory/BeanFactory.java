package com.kps.springframework.beans.factory;

import com.kps.springframework.beans.BeansException;

/**
 * @ClassName BeanFactory
 * @Description 类注释
 * @Author Zheng
 * @Version 1.0
 **/

public interface BeanFactory {
    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;
}
