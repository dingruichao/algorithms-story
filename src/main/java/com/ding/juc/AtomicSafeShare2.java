package com.ding.juc;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

@Slf4j
public class AtomicSafeShare2 {
    private static LongAdder i=new LongAdder();
    private static final int threadCount=10000;
    public static void main(String[] args){
        ExecutorService executorService= Executors.newCachedThreadPool();
        for(int j=0;j<threadCount;j++){
            executorService.execute(AtomicSafeShare2::add);
        }
        log.info("最终结果为{}",i);
    }
    private static void add(){
        i.increment();
    }
}
