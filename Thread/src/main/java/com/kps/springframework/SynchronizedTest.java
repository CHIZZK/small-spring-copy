package com.kps.springframework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName SynchronizedTest
 * @Description  对象锁
 * @Author Zheng
 * @Version 1.0
 **/

public class SynchronizedTest {

    private static ExecutorService executorService = Executors.newFixedThreadPool(10);

    private static volatile boolean flag = false;

    public static class User implements Runnable {

        private String name;

        public User(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                waiter(name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized void waiter(String name) throws InterruptedException {
        while (true) {
            System.out.println("she with " + name + "喝茶，吟诗，做对，聊风月");
            if (flag) {
                System.out.println("敲门，时间到 \r\n");
                flag = false;
                break;
            }
            Thread.sleep(1000);
        }
    }

    private static List<String> list = Arrays.asList("actor1","actor2","actor3");

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3 ; i++) {
            executorService.execute(new User(list.get(i)));
            Thread.sleep(3000);
            flag = true;
        }
    }
}
