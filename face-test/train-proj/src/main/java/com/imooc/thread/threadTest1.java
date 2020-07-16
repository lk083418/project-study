package com.imooc.thread;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class threadTest1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("----程序开始运行----");
        Date date1 = new Date();
        int tasksize=5;
        ExecutorService pool = Executors.newFixedThreadPool(tasksize);
        // 创建多个有返回值的任务
        ArrayList<Future> list = new ArrayList<Future>();
        for (int i=0;i<tasksize;i++){
            MyCallable myCallable = new MyCallable(i + " ");
            // 执行任务并获取 Future 对象
            Future<String> submit1 = pool.submit(myCallable);
//            Future submit = submit1;
            list.add(submit1);
        }
        pool.shutdown();
        for (Future aList : list) {
            // 从 Future 对象上获取任务的返回值，并输出到控制台
            System.out.println(">>>>" +aList.get().toString());
        }
        Date date2 = new Date();
        System.out.println("----程序结束运行----，程序运行时间【" + (date2.getTime() - date1.getTime()) + "毫秒】 ");
    }
}
