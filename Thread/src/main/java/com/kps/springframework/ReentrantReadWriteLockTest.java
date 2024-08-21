package com.kps.springframework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁
 * */
public class ReentrantReadWriteLockTest {
    private static final ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
    private static final ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
    private static final ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
    private static Deque<String> deque = new ArrayDeque<>();
    
    
    
    
    public static String get() {
        readLock.lock();
        try {
           return deque.poll();
        } finally {
            readLock.unlock();
        }
    }
    
    public static void put(String str) {
        writeLock.lock();
        try {
            deque.add(str);
        } finally {
            writeLock.unlock();
        }
    }
    public static void main(String[] args) {
        new Thread(()->{
            while (true) {
                put("1");
                put("2");
                put("3");
                put("4");
                put("5");
                put("6");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }).start();
        
        
        new Thread(()->{ while (true) {
            System.out.println("得到的数字是"+get());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
            }
            }
        }).start();
    }
}
