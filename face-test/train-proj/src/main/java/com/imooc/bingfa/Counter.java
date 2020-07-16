package com.imooc.bingfa;

public class Counter {
    @Override
    public String toString() {
        return "Counter{" +
                "count=" + count +
                '}';
    }

    private volatile int count = 0;
    public void inc(){
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
    }
//    @Override
//    public String toString(){
//        return "[count=" + count + "]";
//    }
}
