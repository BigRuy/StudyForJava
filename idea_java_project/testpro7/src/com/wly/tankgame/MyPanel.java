package com.wly.tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * @author 王露夷
 * @version 1.0
 * 画板类
 */
public class MyPanel extends JPanel {
    //定义我的坦克
    Hero hero = null;
    public MyPanel(){
        hero = new Hero(100,100);//初始化自己的坦克
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充矩形，默认黑色

        //画出坦克-封装方法
        drawTank(hero.getX(),hero.getY(),g,0,0);

    }
    //画出坦克的方法
    /**
     * @param x 坦克左上角横坐标
     * @param y 坦克左上角纵坐标
     * @param g 画笔
     * @param direction 坦克的方向
     * @param type 坦克的类型
     */
    public void drawTank(int x,int y,Graphics g,int direction,int type){
        //根据不同类型的坦克设置不同的颜色
        switch (type){
            case 0: //我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1://敌人的坦克
                g.setColor(Color.YELLOW);
                break;
        }
        //根据坦克的方向来绘制坦克
        switch (direction){
            case 0://向上
                g.fill3DRect(x, y,10,60,false);//画出左轮子
                g.fill3DRect(x+30,y,10,60,false);//画出右轮子
                g.fill3DRect(x+10,y+10,20,40,false);//画出坦克身体
                g.fillOval(x+10,y+20,20,20);//画出坦克帽子
                g.drawLine(x+20,y+30,x+20,y);
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }


}
