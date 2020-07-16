package com.imooc.bingfa;

import java.util.concurrent.Semaphore;

public class VolatileTest {
    //控制并发线程个数
    static Semaphore semaphore = new Semaphore(5, true);
    public static void main(String[] args) {

        for (int i=0;i<100;i++){
            new Thread(new Runnable() {
                public void run() {
                    test();
                }
            }).start();
        }

        //volatile共享变量
//        final Counter counter = new Counter();
//        for (int i=0;i<1000;i++){
//            new Thread(new Runnable() {
//                public void run() {
//                    counter.inc();
//                }
//            }).start();
//        }
//        System.out.println(counter);
    }
    public static void test(){
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"进来了");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"走了");
        semaphore.release();
    }
}
