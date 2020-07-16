package com.imooc.bingfa;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    private int count=0;
    private Lock lock=new ReentrantLock();
    public Runnable runnable1=new Runnable() {
        public void run() {
            synchronized (this){
                while (count<1000){
                    System.out.println(Thread.currentThread().getName()+"count="+count++);
                }
            }
//            lock.lock();
//            while (count<100){
//                System.out.println(Thread.currentThread().getName()+"count="+count++);
//            }
//            lock.unlock();
        }
    };
    public Runnable runnable2=new Runnable() {
        public void run() {
            synchronized (this){
                while (count<1000){
                    System.out.println(Thread.currentThread().getName()+"count="+count++);
                }
            }
//            lock.lock();
//            while (count<100){
//                System.out.println(Thread.currentThread().getName()+"count="+count++);
//            }
//            lock.unlock();
        }
    };

    public static void main(String[] args) {
        LockTest t = new LockTest();
        new Thread(t.runnable1).start();
        new Thread(t.runnable2).start();
    }
}
