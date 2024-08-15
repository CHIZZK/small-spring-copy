package com.kps.springframework.beans.factory.config;

/**
 * @ClassName BeanReference
 * @Description 类注释
 * @Author Zheng
 * @Version 1.0
 **/

public class BeanReference {
    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
