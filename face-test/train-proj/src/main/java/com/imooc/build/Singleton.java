package com.imooc.build;

public class Singleton {
//    /**
//     * 饿汉式
//     */
//    private static Singleton instance = new Singleton();
//    private Singleton(){}
//    public static Singleton getInstance(){
//        return instance;
//    }
//
    public static void main(String[] args) {
        Singleton singleton = new Singleton();
    }
    /**
     * 懒汉式
     */
    private static Singleton instance;
    private Singleton(){}
    private static Singleton getInstance(){
        if (instance==null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance=new Singleton();
                }
            }

        }
        return instance;
    }

}
