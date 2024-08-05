package com.kps.springframework.beans.factory.support;

/**
 * @ClassName Son
 * @Description 类注释
 * @Author Zheng
 * @Version 1.0
 **/

public class Son extends Father{
    @Override
    public void careor() {
        System.out.println("son is a football palyer");
    }
}
