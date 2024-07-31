package com.kps.springframework;

/**
 * @ClassName BeanDefinition
 * @Description Bean定义
 * @Author Zheng
 * @Version 1.0
 **/

public class BeanDefinition {
    private Object bean;
    public BeanDefinition(Object bean) {
        this.bean = bean;
    }
    public Object getBean() {
        return bean;
    }

}
