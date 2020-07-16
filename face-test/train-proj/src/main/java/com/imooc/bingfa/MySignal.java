package com.imooc.bingfa;

public class MySignal {

    private boolean hasDataToProcess=false;

    public boolean isHasDataToProcess() {
        return hasDataToProcess;
    }

    public void setHasDataToProcess(boolean hasDataToProcess) {
        this.hasDataToProcess = hasDataToProcess;
    }

    public static void main(String[] args) {
        final MySignal my=new MySignal();
        final Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                my.setHasDataToProcess(true);
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    //等待线程 1 完成然后取值
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("值："+my.isHasDataToProcess());
            }
        });
        t2.start();
    }


}
