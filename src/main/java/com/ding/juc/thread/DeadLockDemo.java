package com.ding.juc.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class DeadLockDemo {
    public static Executor executor= Executors.newFixedThreadPool(5);
    public static Object obj1=new Object();
    public static Object obj2=new Object();

    public static void main(String[] args) {
        TaskDemo task1=new TaskDemo(true);
        TaskDemo task2=new TaskDemo(false);
        executor.execute(task1);
        executor.execute(task2);
    }
    static class TaskDemo implements Runnable{
        boolean flag;
        public TaskDemo(boolean flag){
            this.flag=flag;
        }

        @Override
        public void run() {
            if(flag) {
                while (true) {
                    synchronized (obj1) {
                        System.out.println(flag+"o1 " + Thread.currentThread().getName());
                        synchronized (obj2) {
                            System.out.println(flag+"o2 " + Thread.currentThread().getName());
                        }
                    }
                }
            }else{
                while (true) {
                    synchronized (obj2) {
                        System.out.println(flag+"o2  " + Thread.currentThread().getName());
                        synchronized (obj1) {
                            System.out.println(flag+"o1  " + Thread.currentThread().getName());
                        }
                    }
                }
            }
        }

    }
}
