package com.wly.homework;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author 王露夷
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        A a =new A();
        B b = new B(a);
        a.start();
        b.start();
    }
}

class A extends Thread{
    private boolean loop = true;
    @Override
    public void run() {
        while (loop){
            System.out.println((int)(Math.random()*100+1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("a线程也退出");
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
class B extends Thread{
    private A a;
    private Scanner scanner = new Scanner(System.in);

    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        //接收到用户的输入
        while (true){
            System.out.println("请输入指令:");
            char c = scanner.next().toUpperCase().charAt(0);
            if(c == 'Q'){
                //用通知的方式去结束进程
                a.setLoop(false);
                System.out.println("b线程退出");
                break;
            }
        }

    }
}
