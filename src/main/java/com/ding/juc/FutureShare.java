package com.ding.juc;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

@Slf4j
public class FutureShare {
    static class MyCallable implements Callable<String>{

        @Override
        public String call() throws Exception {
            log.info("callable call start");
            Thread.sleep(2000);
            log.info("callable end");
            return "mycallable";
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newCachedThreadPool();
        MyCallable myCallable=new MyCallable();
        Future<String> submit=executorService.submit(myCallable);
        String s=submit.get();
        log.info("return is {}",s);
    }
}
