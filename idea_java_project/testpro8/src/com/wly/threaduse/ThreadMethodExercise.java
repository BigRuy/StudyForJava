package com.wly.threaduse;

/**
 * @author 王露夷
 * @version 1.0
 */
public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new T3());//创建子线程
        for (int i = 1; i <=10 ; i++) {
            System.out.println("hi"+i);

            if(i==5){//主线程输出五次之后
                thread.start();//启动子线程
                thread.join();//插入子线程
            }

        }
        

    }
}

class T3 implements Runnable{
    private int count = 0;
    @Override
    public void run() {
        while (true){
            System.out.println("hell0"+(++count));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(count==10){
                break;
            }
        }
    }
}
