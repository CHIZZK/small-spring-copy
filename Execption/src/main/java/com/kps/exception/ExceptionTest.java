package com.kps.exception;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ExceptionTest
 * @Description 类注释
 * @Author Zheng
 * @Version 1.0
 **/

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println(testReturn());
        System.out.println(testReturn2());
        System.out.println(testReturn3());
    }
    //基本类型
    public static  int  testReturn() {
        int i = 1;
        try {
            i++;
            System.out.println("try:"+i);
            return i;
        } catch (Exception e) {
            i++;
            System.out.println("catch:"+i);
        } finally {
            i++;
            System.out.println("finally:"+i);
        }
        return i;
    }
    //引用类型
    public static List<Integer> testReturn2() {
        List<Integer> list = new ArrayList<>();
        try {
            list.add(1);
            System.out.println("try:"+list);
            return list;
        } catch (Exception e) {
            list.add(2);
            System.out.println("catch:"+list);
        } finally {
            list.add(3);
            System.out.println("finally:"+list);
        }
        return list;
    }
    //finally返回
    public static  int  testReturn3() {
        int i = 1;
        try {
            i++;
            System.out.println("try:"+i);
            return i;
        } catch (Exception e) {
            i++;
            System.out.println("catch:"+i);
        } finally {
            i++;
            System.out.println("finally:"+i);
            return i;
        }
        
    }
}
