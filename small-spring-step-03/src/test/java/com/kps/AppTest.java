package com.kps;

import static org.junit.Assert.assertTrue;

import com.kps.springframework.beans.factory.config.BeanDefinition;
import com.kps.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.kps.springframework.test.bean.UserService;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 基于cglib实现含构造函数的类实例化策略
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test_BeanFactory() {
        //1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        
        
        //2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService",beanDefinition);
        
        
        //3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService","zz");
        userService.queryUserInfo();
    }    
    
    @Test
    public void test_cglib() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        Object obj = enhancer.create(new Class[]{String.class}, new Object[]{"zz"});
        System.out.println(obj);
    }
    
    @Test
    public void test_newInstance() throws IllegalAccessException,InstantiationException {
        UserService userService = UserService.class.newInstance();
        System.out.println(userService);
    }
    
    @Test
    public void test_constructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<UserService> userServiceClass = UserService.class;
        Constructor<UserService> declaredConstructor = userServiceClass.getDeclaredConstructor(String.class);
        UserService userService = declaredConstructor.newInstance("zz");
        System.out.println(userService);
    }
    @Test
    public void test_parameterTypes() throws Exception {
        Class<UserService> beanClass = UserService.class;
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
        Constructor<?> constructor = null;
        for (Constructor<?> ctor : declaredConstructors) {
            if (ctor.getParameterTypes().length == 1) {
                constructor = ctor;
                break;
            }
        }
        Constructor<UserService> declaredConstructor = beanClass.getDeclaredConstructor(constructor.getParameterTypes());
        UserService userService = declaredConstructor.newInstance("zz");
        System.out.println(userService);
    }

}
