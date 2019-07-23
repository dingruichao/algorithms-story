package com.ding.juc;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

@Slf4j
public class CallabelShare implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "我是线程返回值";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallabelShare callabelShare=new CallabelShare();
        FutureTask<String> futureTask=new FutureTask(callabelShare);
        new Thread(futureTask,"有返回值的线程").start();
        String s=futureTask.get();
        log.info(s);
        log.info("我是主线程");
    }
}
