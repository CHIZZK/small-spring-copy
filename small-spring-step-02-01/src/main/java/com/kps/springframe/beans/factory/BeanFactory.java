package com.kps.springframe.beans.factory;

import com.kps.springframe.beans.BeansException;

//bean工厂类
public interface BeanFactory {
    Object getBean(String name) throws BeansException, InstantiationException, IllegalAccessException;
}
