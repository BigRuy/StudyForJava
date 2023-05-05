package com.wly.ticket;

/**
 * @author 王露夷
 * @version 1.0
 * 使用多线程，模拟三个窗口同时售票
 */
public class SellTicket {
    public static void main(String[] args) {
        Sell sell = new Sell();

        Thread thread = new Thread(sell);
        Thread thread1 = new Thread(sell);
        Thread thread2 = new Thread(sell);

        thread.start();
        thread1.start();
        thread2.start();

    }
}


class Sell implements Runnable{
    private int nums = 100;
    @Override
    public void run() {
        while (true){
            if(nums<=0){
                System.out.println("售票结束");
                break;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口"+Thread.currentThread().getName()+"售出一张票"
                                +"剩余票数"+(--nums));
        }
    }
}