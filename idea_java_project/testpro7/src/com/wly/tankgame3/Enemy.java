package com.wly.tankgame3;

import com.wly.tankgame2.Tank;

import java.util.Vector;

/**
 * @author 王露夷
 * @version 1.0
 */
public class Enemy extends Tank implements Runnable{
    //定义一个集合去存储敌人坦克的子弹
    Vector<Shot> shots = new Vector<>();
    //定义敌人坦克是否存活
    boolean isLive = true;

    public Enemy(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        while (true){

            //当敌人坦克子弹集合中的子弹个数为0的时候并且敌人坦克还存活的时候就创建一个子弹
            if(shots.size() <5 && isLive){
                Shot s = null;
                //判断坦克当前的方向，创建对应的子弹]
                switch (getDirect()){
                    case 0://向上
                        s = new Shot(getX()+20,getY(),0);
                        break;
                    case 1://向右
                        s = new Shot(getX()+60,getY()+20,1);
                        break;
                    case 2://向下
                        s = new Shot(getX()+20,getY()+60,2);
                        break;
                    case 3://向左
                        s = new Shot(getX(),getY()+20,3);
                        break;
                }
                //把新创建的一个子弹加入到集合中
                shots.add(s);
                //启动
                new Thread(s).start();

            }


            //根据敌人坦克当前的方向移动
            switch (getDirect()){
                case 0://向上
                    //让坦克保持一个方向，走10步
                    for (int i = 0; i < 30; i++) {
                        //触碰到边界后就不能继续移动，只能换方向再继续移动
                        if(getY()>0) {
                            moveUp();
                        }
                        //每次移动后都休眠一段时间
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 1://向右
                    for (int i = 0; i < 30; i++) {
                        if(getX()+60<1000) {
                            moveRight();
                        }
                        //每次移动后都休眠一段时间
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2://向下
                    for (int i = 0; i < 30; i++) {
                        if(getY()+60<750) {
                            moveDown();
                        }
                        //每次移动后都休眠一段时间
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3://向左
                    for (int i = 0; i < 30; i++) {
                        if(getX()>0) {
                            moveLeft();
                        }
                        //每次移动后都休眠一段时间
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            }
            //移动一次后随机改变敌人坦克的方向0-3
            setDirect((int)(Math.random()*4));
            //当敌人坦克被击中后才结束线程
            if(!isLive){
                break;//退出线程
            }
        }
    }
}
