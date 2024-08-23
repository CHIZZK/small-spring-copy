package com.kps.springframe.beans.factory.config;
//bean定义类
public class BeanDefiniton {
    private Class beanClass;

    public BeanDefiniton(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
