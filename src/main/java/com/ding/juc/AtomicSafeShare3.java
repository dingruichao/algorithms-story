package com.ding.juc;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

@Slf4j
public class AtomicSafeShare3 {
    private static AtomicReference<Integer> reference=new AtomicReference(0);

    public static void main(String[] args){
        reference.compareAndSet(0,3);
        reference.compareAndSet(2,1);
        reference.compareAndSet(3,6);
        log.info("最终结果为{}",reference.get());
    }

}
