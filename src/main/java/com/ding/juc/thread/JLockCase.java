package com.ding.juc.thread;

import lombok.Synchronized;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class JLockCase {
    public static Executor executor=Executors.newFixedThreadPool(5);
    public static Object lock=new Object();

    public static void main(String[] args) {
        Task task1=new Task();
        Task task2=new Task();
        executor.execute(task1);
        executor.execute(task2);

    }
    static class Task implements Runnable{

        @Override
        public void run() {
            synchronized (lock){
                cale();
            }
        }
        public void cale(){
            int i=0;
            while (true){
                i++;
            }
        }
    }
}
