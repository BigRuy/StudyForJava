package com.wly.threaduse;

/**
 * @author 王露夷
 * @version 1.0
 * 通过实现接口Runnable来创建线程
 */
public class Thread02 {
    public static void main(String[] args) {
        dog dog = new dog();
        //dog.start();//此处不能直接调用statr方法去创建线程
        //此处使用了静态代理
        Thread thread = new Thread(dog);
        thread.start();

    }
}



//通过实现Runnable接口创建线程
class dog implements Runnable{
    int times = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("小狗汪汪叫" + (++times)+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(times ==10){
                break;
            }
        }
    }
}