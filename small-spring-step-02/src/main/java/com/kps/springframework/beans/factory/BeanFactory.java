package com.kps.springframework.beans.factory;

import com.kps.springframework.beans.BeansException;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName BeanFactory
 * @Description bean工厂
 * @Author Zheng
 * @Version 1.0
 **/

public interface BeanFactory {
    //通过名称获取bean
    Object getBean(String name) throws BeansException;
    Map<String,String> map = new HashMap<>();
}
