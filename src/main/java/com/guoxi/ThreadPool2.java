package com.guoxi;

import java.util.concurrent.Executors;

import java.util.concurrent.ScheduledExecutorService;

import java.util.concurrent.TimeUnit;

public class ThreadPool2 {


    public static void main(String[] args) {
        //创建一个定长线程池，支持定时及周期性任务执行
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);

        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {

            public void run() {

                System.out.println("delay 1 seconds, and excute every 3 seconds");

            }

        }, 1, 3, TimeUnit.SECONDS);

    }

}
