package com.ding.juc;

import lombok.extern.slf4j.Slf4j;

/**
 * 如果不用volatile isRunnging  线程是看不到他的值变化的
 */
@Slf4j
public class VolatileShare extends Thread{
        private volatile boolean isRunning=true;
        private void stopRunning(){
            this.isRunning=false;
        }

    @Override
    public void run() {
     log.info("run() start");
     while (isRunning){

     }
     log.info("run() end");
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileShare volatileShare=new VolatileShare();
        volatileShare.start();
        Thread.sleep(3000);
        volatileShare.stopRunning();
        log.info("set isRunning to false");
        Thread.sleep(1000);
        log.info("isRuning="+volatileShare.isRunning);
    }
}
