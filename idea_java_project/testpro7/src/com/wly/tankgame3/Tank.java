package com.wly.tankgame3;

/**
 * @author 王露夷
 * @version 1.0
 * 坦克类，敌人和自己的坦克都可以继承该类
 */
public class Tank {
    private int x;//坦克横坐标
    private int y;//坦克纵坐标
    private int direct;//坦克方向 0表示上，1表示右，2表示下，3表示左
    private int speed = 100;//坦克的速度
    //private int type;//坦克的类型 o表示敌人的坦克，1表示我们的坦克



    //上右上左移动方法
    public void moveUp(){
        y -= speed;
    }
    public void moveRight(){
        x +=speed;
    }
    public void moveDown(){
        y +=speed;
    }
    public void moveLeft(){
        x -=speed;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
        //this.type = type;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


}
