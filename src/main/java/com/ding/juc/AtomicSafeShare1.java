package com.ding.juc;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public class AtomicSafeShare1 {
    private static AtomicInteger i=new AtomicInteger(0);
    private static final int threadCount=10000;
    public static void main(String[] args){
        ExecutorService executorService= Executors.newCachedThreadPool();
        for(int j=0;j<threadCount;j++){
            executorService.execute(AtomicSafeShare1::add);
        }
        log.info("最终结果为{}",i);
    }
    private static void add(){
        i.getAndIncrement();
    }
}
