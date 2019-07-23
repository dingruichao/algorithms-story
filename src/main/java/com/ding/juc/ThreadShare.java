package com.ding.juc;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadShare extends Thread{
    public static void main(String[] args) {
        new ThreadShare().start();
        log.info("我是主线程！");
    }

    @Override
    public void run() {
        log.info("我是线程运行方法");

    }
}
