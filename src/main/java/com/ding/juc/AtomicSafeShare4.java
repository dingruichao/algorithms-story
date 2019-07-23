package com.ding.juc;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;

@Slf4j
public class AtomicSafeShare4 {
    private static AtomicIntegerFieldUpdater<AtomicSafeShare4> fieldUpdater= AtomicIntegerFieldUpdater.newUpdater(AtomicSafeShare4.class,"count");
    private volatile int count=1;

    public static void main(String[] args){
        AtomicSafeShare4 atomicSafeShare4=new AtomicSafeShare4();
        if(fieldUpdater.compareAndSet(atomicSafeShare4,1,3)){
            log.info("1变为3成功   1");
        }
        if(fieldUpdater.compareAndSet(atomicSafeShare4,1,3)){
            log.info("1变为3成功   2");
        }
        if(fieldUpdater.compareAndSet(atomicSafeShare4,1,3)){
            log.info("1变为3成功   3");
        }

    }

}
