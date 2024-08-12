package com.kps.springframework.beans.factory.config;

/**
 * @ClassName BeanDefinition
 * @Description 类注释
 * @Author Zheng
 * @Version 1.0
 **/

public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
