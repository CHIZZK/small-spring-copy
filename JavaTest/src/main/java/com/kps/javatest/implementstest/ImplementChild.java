package com.kps.javatest.implementstest;

public class ImplementChild implements ImplementParent{
    @Override
    public void occupation() {
        ImplementParent.staticMethod();
    }

    @Override
    public void sleep(String name) {
        ImplementParent.staticMethod2();
    }
}
