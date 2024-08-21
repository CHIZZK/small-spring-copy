package com.kps.javatest.abstracttest;
//抽象类
public abstract class AbstractParent {
    //属性
    private String name;
    private String age;
    //final
    public final String sex = "男";
    //static
    public static String address = "北京";   
    
    //构造方法
    public AbstractParent(String name, String age) {
        this.name = name;
        this.age = age;
    }
    //无参构造方法
    public AbstractParent() {
    }
    //抽象方法
    public abstract void occupation();
    //普通方法
    public void sleep(String name){
        System.out.println(name);
    }  
    //final方法
    public final void finalMethod(){
        System.out.println("finalMethod");
    }
    //static方法
    public static void staticMethod(){
        System.out.println("staticMethod");
    }
}
