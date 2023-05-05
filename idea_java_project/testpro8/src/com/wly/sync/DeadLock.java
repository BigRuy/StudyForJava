package com.wly.sync;

/**
 * @author 王露夷
 * @version 1.0
 * 模拟线程的死锁
 */
public class DeadLock {
    public static void main(String[] args) {
        T t = new T(true);
        T t1 = new T(false);
        t.start();
        t1.start();

    }
}
class T extends Thread{
    static  Object o1 = new Object();
    static  Object o2 = new Object();
    boolean flag;


    public T(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if(flag){
            synchronized (o1){
                System.out.println("进入1");
                synchronized (o2){
                    System.out.println("进入2");
                }
            }
        }else{
            synchronized (o2){
                System.out.println("进入3");
                synchronized (o1){
                    System.out.println("进入4");
                }
            }
        }
    }
}

