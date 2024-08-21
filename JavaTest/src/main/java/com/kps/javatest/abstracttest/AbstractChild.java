package com.kps.javatest.abstracttest;

public class AbstractChild extends AbstractParent {

    // 实现父类中的抽象方法
    @Override
    public void occupation() {
        sleep("now children is sleep");
        finalMethod();
        staticMethod();
        System.out.println("child's occupation is doctor");
    }
}
