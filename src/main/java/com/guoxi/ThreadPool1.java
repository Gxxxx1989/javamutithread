package com.guoxi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool1 {
    public static void main(String[] args) {
        //创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {

            final int index = i;

            fixedThreadPool.execute(new Runnable() {

                public void run() {

                    try {

                        System.out.println(index);

                        Thread.sleep(2000);

                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    }

                }

            });

        }

    }

}
