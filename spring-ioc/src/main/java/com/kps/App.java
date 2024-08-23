package com.kps;

import com.kps.springioc.ClassInfo.UserService;
import jdk.nashorn.internal.runtime.JSONFunctions;
import org.mortbay.util.ajax.JSON;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<?>[] declaredConstructors = UserService.class.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            declaredConstructor.setAccessible(true);
            if (declaredConstructor.getParameterCount() == 2) {
                UserService userService = (UserService) declaredConstructor.newInstance("kps",1);
                System.out.println(userService.getName()+","+userService.getAge()); 
                break;
            }
           
        }
    }
}
