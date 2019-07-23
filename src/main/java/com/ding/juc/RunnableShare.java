package com.ding.juc;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RunnableShare implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            log.info("我是线程方法run");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Thread(new RunnableShare()).start();
        log.info("我是主线程");
    }
}
