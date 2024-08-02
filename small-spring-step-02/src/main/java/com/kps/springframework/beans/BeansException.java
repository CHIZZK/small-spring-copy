package com.kps.springframework.beans;

/**
 * @ClassName BeansException
 * @Description 类注释
 * @Author Zheng
 * @Version 1.0
 **/

public class BeansException extends RuntimeException {
    public BeansException(String msg) {
        super(msg);
    }
    public BeansException(String msg, Throwable cause) {
        super(msg,cause);
    }
}
