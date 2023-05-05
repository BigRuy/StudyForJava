package com.wly.homework;

/**
 * @author 王露夷
 * @version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {
        WithDraw withDraw = new WithDraw();
        Thread thread = new Thread(withDraw);
        thread.setName("用户1");
        Thread thread1 = new Thread(withDraw);
        thread1.setName("用户2");
        thread.start();
        thread1.start();
    }
}

class WithDraw implements Runnable{
    private int balance = 10000;

    @Override
    public void run() {
            while (true){
                //实现线程同步，当多个线程运行到这里就会去争夺this对象锁，哪个对象争夺到才会去运行里面的代码块，争夺不到就会等待
                synchronized (this){
                    if(balance<1000){
                        System.out.println("余额不足");
                        break;
                    }
                    balance = balance-1000;
                    System.out.println(Thread.currentThread().getName() +"取出一次钱当前余额还剩"+balance);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}


