package com.wly.ThreadExit;

/**
 * @author 王露夷
 * @version 1.0
 */
public class ThreadExit_ {
    public static void main(String[] args) {
        T t = new T();
        t.start();

        //希望main线程去停止T线程，需要修改loop变量
        //让主线程休眠十秒钟再通知线程退出
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.setLoop(false);


    }
}


class T extends Thread{
    int count = 0;
    //设置一个控制变量
    private boolean loop = true;
    @Override
    public void run() {
        while (loop){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("T线程还在运行中"+(++count));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
