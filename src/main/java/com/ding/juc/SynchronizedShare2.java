package com.ding.juc;



import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
public class SynchronizedShare2 {
    private static void test1(){
        synchronized(SynchronizedShare2.class){
            for(int i=0;i<5;i++){
                log.info("test1 第{}次",i);
            }
        }
    }
    private static synchronized void test2(){
        for(int i=0;i<5;i++){
            log.info("test2 第{}次",i);
        }
    }

    public static void main(String[] args) {
        SynchronizedShare2 synchronizedShare2=new SynchronizedShare2();
        SynchronizedShare2 synchronizedShare22=new SynchronizedShare2();

        ExecutorService executorService= Executors.newCachedThreadPool();
        executorService.execute(()->{synchronizedShare2.test1();});
        executorService.execute(()->{synchronizedShare22.test2();});
    }
}
