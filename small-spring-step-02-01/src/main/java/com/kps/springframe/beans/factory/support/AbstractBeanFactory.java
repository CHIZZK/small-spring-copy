package com.kps.springframe.beans.factory.support;

import com.kps.springframe.beans.BeansException;
import com.kps.springframe.beans.factory.BeanFactory;
import com.kps.springframe.beans.factory.config.BeanDefiniton;

// 抽象bean工厂
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    //判断是否已经生成单例bean，如果有，直接返回，如果没有，则生成bean，并返回


    @Override
    public Object getBean(String name) throws BeansException, InstantiationException, IllegalAccessException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }
        BeanDefiniton beanDefiniton = getBeanDefinition(name);
        bean = createBean(name,beanDefiniton);
        return bean;
    }
    //获取bean定义
    protected abstract BeanDefiniton getBeanDefinition(String beanName) throws BeansException;
    //创建bean
    protected abstract Object createBean(String beanName, BeanDefiniton beanDefinition) throws BeansException, InstantiationException, IllegalAccessException;
}
