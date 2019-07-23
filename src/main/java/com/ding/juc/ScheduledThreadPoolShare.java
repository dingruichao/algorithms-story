package com.ding.juc;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


@Slf4j
public class ScheduledThreadPoolShare {
    static int i=0;
    static final int threadCount= 3000;
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService= Executors.newScheduledThreadPool(5);
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                log.info("run ok!");
            }
        },3, TimeUnit.SECONDS);
//        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
//            @Override
//            public void run() {
//                log.info("run ok");
//
//            }
//        },1,3,TimeUnit.SECONDS);

//        scheduledExecutorService.shutdown();

    }
}
