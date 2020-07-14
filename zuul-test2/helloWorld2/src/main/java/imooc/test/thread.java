package imooc.test;

public class thread {
    public void test(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        thread.start();
    }
}
