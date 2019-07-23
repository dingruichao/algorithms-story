package com.ding.juc;



import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
public class SynchronizedShare1 {
    private void test1(){
        synchronized(this){
            for(int i=0;i<5;i++){
                log.info("test1 第{}次",i);
            }
        }
    }
    private synchronized void test2(){
        for(int i=0;i<5;i++){
            log.info("test2 第{}次",i);
        }
    }

    public static void main(String[] args) {
        SynchronizedShare1 synchronizedShare1=new SynchronizedShare1();
        SynchronizedShare1 synchronizedShare12=new SynchronizedShare1();

        ExecutorService executorService= Executors.newCachedThreadPool();
        executorService.execute(synchronizedShare1::test1);
        executorService.execute(synchronizedShare1::test2);
    }
}
