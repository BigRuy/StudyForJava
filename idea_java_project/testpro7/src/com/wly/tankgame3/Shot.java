package com.wly.tankgame3;

/**
 * @author 王露夷
 * @version 1.0
 * 射击子弹
 */
public class Shot implements Runnable{
    private int x;//记录子弹的横坐标
    private int y;//记录子弹的纵坐标
    private int direct;//记录子弹的射出方向，根据hero坦克的方向来确定
    private boolean isLive = true;
    private int speed = 2;//表示子弹的速度，也就是子弹在坐标中坐标变化的快慢


    //构造器
    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {
        //创建一个线程，循环输出一个子弹
        while (true){
            //根据坦克的方向确定子弹的变化方向,并且每间隔50毫秒改变一次方向
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            switch (direct){
                case 0://向上
                    y-=speed;
                    break;
                case 1://向右
                    x+=speed;
                    break;
                case 2://向下
                    y+=speed;
                    break;
                case 3://向左
                    x-=speed;
                    break;
            }
            //当子弹超过面板的边界的时候或者不存活的时候就结束循环
            if(!(x>0&& x<1000&&y>0&&y<750&&isLive)){
                isLive = false;
                break;
            }

        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }
}
