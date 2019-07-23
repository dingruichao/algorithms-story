package com.ding.juc;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Slf4j
public class CountDownLatchShare {
    private static final int threadCount=5;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService= Executors.newCachedThreadPool();
        CountDownLatch countDownLatch=new CountDownLatch(threadCount);
        for(int i=0;i<threadCount;i++){
            final int threadNum=i;
            executorService.execute(()->{
                try {
                    test(threadNum);
                    log.info(threadNum+"执行完毕");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    countDownLatch.countDown();
                }

            });

        }
        countDownLatch.await();
//        countDownLatch.await(1, TimeUnit.SECONDS);
        log.info("所有线程都执行完毕");
        executorService.shutdown();
    }
    private static void test(int threadNum) throws InterruptedException {
        Thread.sleep(1000);
    }

}
