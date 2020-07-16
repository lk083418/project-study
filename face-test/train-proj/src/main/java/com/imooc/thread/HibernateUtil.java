package com.imooc.thread;

import java.util.concurrent.*;

public class HibernateUtil {
    public void thread1(){
        //        ExecutorService fpool = Executors.newFixedThreadPool(3);
//        ExecutorService fpool = Executors.newSingleThreadExecutor();
//        ExecutorService fpool = Executors.newCachedThreadPool();
        ScheduledExecutorService fpool = Executors.newScheduledThreadPool(2);
        ////创建实现了 Runnable 接口对象， Thread 对象当然也实现了 Runnable 接口
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        Thread t3 = new MyThread();
        Thread t4 = new MyThread();
        Thread t5 = new MyThread();
        //将线程放入池中进行执行
        fpool.execute(t1);
        fpool.execute(t2);
        fpool.execute(t3);
        fpool.schedule(t4, 10, TimeUnit.MICROSECONDS);
        fpool.schedule(t5,10,TimeUnit.MICROSECONDS);
        //
        fpool.shutdown();
    }
    public void thread2(){
        ExecutorService pool = Executors.newFixedThreadPool(10);

        pool.execute(new Runnable() {
            public void run() {
                System.out.println("Asynchronous task");
            }
        });
        pool.shutdown();
    }
    public void thread3() throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(10);

        Future<?> future = pool.submit(new Runnable() {
            public void run() {
                System.out.println("Asynchronous task");
            }
        });
        Object result = future.get();
        System.out.println(result);
        pool.shutdown();
    }
    public void thread4() throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        Future<Object> future = pool.submit(new Callable<Object>() {
            public Object call() throws Exception {

                System.out.println("Asynchronous Callable");
                return "Callable Result";
            }
        });
        System.out.println("future.get() = " + future.get());
        pool.shutdown();
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        new HibernateUtil().thread1();
//        new HibernateUtil().thread2();
        new HibernateUtil().thread4();
    }

}

