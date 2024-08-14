package com.kps.springframework.beans.factory.support;

import cn.hutool.core.bean.BeanUtil;
import com.kps.springframework.beans.BeansException;
import com.kps.springframework.beans.PropertyValue;
import com.kps.springframework.beans.PropertyValues;
import com.kps.springframework.beans.factory.config.BeanDefinition;
import com.kps.springframework.beans.factory.config.BeanReference;

import java.lang.reflect.Constructor;

/**
 * @ClassName AbstractAutowireCapableBeanFactory
 * @Description 类注释
 * @Author Zheng
 * @Version 1.0
 **/

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    private InstantiationStragety instantiationStragety = new CglibSubclassingInstantiationStragety();
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException {
        Object bean = null;
        try {
            bean = createBeanInstance(beanDefinition, beanName, args);
        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed",e);
        }
        addSingleton(beanName, bean);
        return bean;
    }
    protected Object createBeanInstance(BeanDefinition beanDefinition, String beanName, Object[] args) {
        Constructor constructorToUse = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
        for (Constructor ctor : declaredConstructors) {
            if (null != args && ctor.getParameterTypes().length == args.length) {
                constructorToUse = ctor;
                break;
            }
        }
        return getInstantiationStragety().instantiate(beanDefinition, beanName, constructorToUse,args);
    }

    public InstantiationStragety getInstantiationStragety() {
        return instantiationStragety;
    }

    public void setInstantiationStragety(InstantiationStragety instantiationStragety) {
        this.instantiationStragety = instantiationStragety;
    }
    
    /*属性填充*/
    protected void applyPropertyValues(String beanName, Object bean, BeanDefinition beanDefinition) {
        try {
            PropertyValues propertyValues = beanDefinition.getPropertyValues();
            for (PropertyValue propertyValue : propertyValues.getPropertyValues()) {
                String name = propertyValue.getName();
                Object value = propertyValue.getValue();
                if (value instanceof BeanReference) {
                    BeanReference beanReference = (BeanReference) value;
                    value = getBean(beanReference.getBeanName());
                }
                // 属性填充
                BeanUtil.setFieldValue(bean,name,value);
            }
        } catch (Exception e) {
            throw new BeansException("error setting property values:" + beanName );
        }
    }
}
