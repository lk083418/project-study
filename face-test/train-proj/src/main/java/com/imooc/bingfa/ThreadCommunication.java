package com.imooc.bingfa;

import java.util.concurrent.Semaphore;


//三个线程 a、 b、 c 并发运行， b,c 需要 a 线程的数据实现方法
public class ThreadCommunication {
    static Semaphore semaphore=new Semaphore(0);
    static int num;
    public static void main(String[] args) {

        Thread threadA = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1000);
                    num=1;
                    semaphore.release(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread threadB = new Thread(new Runnable() {
            public void run() {
                try {
                    semaphore.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"线程" + num);
            }
        });
        Thread threadC = new Thread(new Runnable() {
            public void run() {
                try {
                    semaphore.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"线程" + num);
            }
        });
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
