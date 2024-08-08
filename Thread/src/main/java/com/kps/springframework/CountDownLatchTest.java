package com.kps.springframework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName CountDownLatchTest
 * @Description 门闩
 * @Author Zheng
 * @Version 1.0
 **/

public class CountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {
        List<String> list = Arrays.asList("January","February","March","April","May","June","July","August","September","October");

        CountDownLatch countDownLatch = new CountDownLatch(10);
        ExecutorService exec = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            int idx = i;
            exec.execute(() ->{
                try{
                    System.out.println(list.get(idx) + " is coming");
                    Thread.sleep(3000);
                }catch (Exception e) {
                }finally {
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();
        System.out.println("no November and December");
        exec.shutdown();
    }
}
