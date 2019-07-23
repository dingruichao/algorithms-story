package com.ding.juc;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

@Slf4j
public class CyclicBarrierShare {
    private static final int threadCount=30;
    private static final CyclicBarrier cyclicBarrier=new CyclicBarrier(3);
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService= Executors.newCachedThreadPool();

        for(int i=0;i<threadCount;i++){
            final int threadNum=i;
            Thread.sleep(1000);
            executorService.execute(()->{
                try {

                    test(threadNum);

                }  catch (Exception e) {
                    e.printStackTrace();
                }

            });

        }

        executorService.shutdown();
    }
    private static void test(int threadNum) throws InterruptedException, BrokenBarrierException {
        Thread.sleep(1000);
        log.info("{} is ready",threadNum);
        cyclicBarrier.await();
        log.info("{} is continue",threadNum);
    }

}
