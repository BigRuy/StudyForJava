package com.wly.tankgame;

/**
 * @author 王露夷
 * @version 1.0
 * 坦克类，敌人和自己的坦克都可以继承该类
 */
public class Tank {
    private int x;//坦克横坐标
    private int y;//坦克纵坐标

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
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
}
