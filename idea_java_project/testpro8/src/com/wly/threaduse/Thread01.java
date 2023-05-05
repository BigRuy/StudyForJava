package com.wly.threaduse;

/**
 * @author 王露夷
 * @version 1.0
 * 通过继承Thread类来创建线程
 */
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        cat cat = new cat();
        cat.start();//启动一个线程，启动之后主线程和子线程会同时交替执行，不会阻塞主线程，此处会产生多线程
        //cat.run();//run方法就是一个普通方法，并不会启动一个子线程，把run方法执行完才会执行下面的循环，就不是多线程
        System.out.println("主线程继续执行"+Thread.currentThread().getName());
        for (int i = 0; i < 60; i++) {
            System.out.println("主线程 i="+i);
            Thread.sleep(1000);
        }
    }
}

//当一个类继承了Thread类，该类就可以当做线程使用
//一般会重写run方法，写上自己的业务代码
//run方法是Thread类实现了Runnable接口的run方法
class cat extends Thread{
    @Override
    public void run() {
        int times = 0;
        while (true) {
            System.out.println("我是小猫咪"+(++times)+Thread.currentThread().getName());
            //让线程休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(times == 80){
                break;
            }
        }
    }
}


