package com.ding.juc;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

@Slf4j
public class SemaphoreShare {
    private static final int threadCount=30;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService= Executors.newCachedThreadPool();
        Semaphore semaphore=new Semaphore(3);
        for(int i=0;i<threadCount;i++){
            final int threadNum=i;
            executorService.execute(()->{
                try {
                    semaphore.acquire();
                    test(threadNum);
                    semaphore.release();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            });

        }

        executorService.shutdown();
    }
    private static void test(int threadNum) throws InterruptedException {
        Thread.sleep(1000);
        log.info(threadNum+"执行完毕");
    }

}
