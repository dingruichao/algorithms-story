package com.ding.juc;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * reentrantlock
 */
@Slf4j
public class ReentrantLockShare {
    private static int i=0;
    private static final int threadCount=10000;
    private static final Lock lock=new  ReentrantLock();
    public static void main(String[] args){
        ExecutorService executorService=Executors.newCachedThreadPool();
        for(int j=0;j<threadCount;j++){
            executorService.execute(ReentrantLockShare::add);
        }
        executorService.shutdown();
        log.info("最终结果为{}",i);
    }
    private static void add(){
        lock.lock();
        i++;
        lock.unlock();
    }
}
