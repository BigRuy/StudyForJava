package com.wly.tankgame3;

import com.wly.tankgame2.Tank;

import java.util.Vector;

/**
 * @author 王露夷
 * @version 1.0
 * 自己的坦克
 */
public class Hero extends Tank {
    //定义一个子弹对象
     Shot shot = null;
     //可以发射多个子弹，定义一个集合
     Vector<Shot> shots = new Vector<>();
     //定一个属性表示我方坦克是否存活
    boolean isLive = true;


    public Hero(int x, int y) {
        super(x, y);
    }

    //实现方法，可以射击子弹
    public void shotEnemyTank(){
        //根据坦克的方向来确定子弹射出的坐标
        //控制hero坦克同一时刻只能发射5个子弹
        if(shots.size() == 5){//判断集合中只能存在5个子弹
            return;
        }
        switch (getDirect()){
            case 0://向上
                shot = new Shot(getX()+20,getY(),0);
                break;
            case 1://向右
                shot = new Shot(getX()+60,getY()+20,1);
                break;
            case 2://向下
                shot = new Shot(getX()+20,getY()+60,2);
                break;
            case 3://向左
                shot = new Shot(getX(),getY()+20,3);
                break;
        }
        //把新创建的shot对象放入集合中
        shots.add(shot);
        //确定子弹射出的坐标后就开始启动射击线程
        System.out.println("开始射击子弹");
        new Thread(shot).start();
    }

}
