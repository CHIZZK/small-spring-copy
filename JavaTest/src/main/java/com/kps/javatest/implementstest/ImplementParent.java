package com.kps.javatest.implementstest;

public interface ImplementParent {
    public void occupation();
    public void sleep(String name);
    //static方法
    public static void staticMethod(){
        System.out.println("staticMethod");
    }
    //final属性
    public final String sex = "男";
    //static属性
    public static String address = "北京";
    public default void defaultMethod(){
        System.out.println("defaultMethod");
    }
    public static void staticMethod2(){
        System.out.println("staticMethod2");
    }
    
}
