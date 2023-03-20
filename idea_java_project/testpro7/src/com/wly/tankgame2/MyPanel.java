package com.wly.tankgame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author 王露夷
 * @version 1.0
 * 画板类
 */
//监听键盘事件，实现键盘监听接口
public class MyPanel extends JPanel implements KeyListener {
    //定义我的坦克
    Hero hero = null;
    //定义敌人的坦克
    Vector<Enemy> enemys = new Vector<>();
    public MyPanel(){
        hero = new Hero(100,200);//初始化自己的坦克
        hero.setSpeed(5);//初始化的时候改变坦克移动的速度
        //初始化敌人的坦克
        int enemySize = 3;
        for (int i = 0; i <enemySize ; i++) {
            //初始化敌人的坦克
            Enemy enemy = new Enemy((100 * (i + 1)), 0);
            //设置敌人的坦克炮筒的方向
            enemy.setDirect(2);
            //将敌人的坦克放入集合中
            enemys.add(enemy);
        }
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充矩形，默认黑色

        //画出坦克-封装方法
        drawTank(hero.getX(),hero.getY(),g,hero.getDirect(),1);

        //画出敌人的坦克
        //先遍历集合
        for (int i = 0; i <enemys.size() ; i++) {
            //遍历到集合中每一个敌人坦克
            Enemy enemy = enemys.get(i);
            //调用画出坦克的方法
            drawTank(enemy.getX(),enemy.getY(),g,enemy.getDirect(),0);
        }
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
            case 0: //敌人的坦克
                g.setColor(Color.cyan);
                break;
            case 1://我们的坦克
                g.setColor(Color.YELLOW);
                break;
        }
        //根据坦克的方向来绘制对应形状的坦克
        //direction 表示方向（0表示向上，1表示向右，2表示向下，3表示向左）

        switch (direction){
            case 0://向上
                g.fill3DRect(x, y,10,60,false);//画出左轮子
                g.fill3DRect(x+30,y,10,60,false);//画出右轮子
                g.fill3DRect(x+10,y+10,20,40,false);//画出坦克身体
                g.fillOval(x+10,y+20,20,20);//画出坦克帽子
                g.drawLine(x+20,y+30,x+20,y);//画出炮筒
                break;
            case 1://向右
                g.fill3DRect(x, y,60,10,false);//画出上轮子
                g.fill3DRect(x,y+30,60,10,false);//画出下轮子
                g.fill3DRect(x+10,y+10,40,20,false);//画出坦克身体
                g.fillOval(x+20,y+10,20,20);//画出坦克帽子
                g.drawLine(x+30,y+20,x+60,y+20);//画出炮筒
                break;
            case 2://向下
                g.fill3DRect(x, y,10,60,false);//画出左轮子
                g.fill3DRect(x+30,y,10,60,false);//画出右轮子
                g.fill3DRect(x+10,y+10,20,40,false);//画出坦克身体
                g.fillOval(x+10,y+20,20,20);//画出坦克帽子
                g.drawLine(x+20,y+30,x+20,y+60);//画出炮筒
                break;
            case 3://向左
                g.fill3DRect(x, y,60,10,false);//画出上轮子
                g.fill3DRect(x,y+30,60,10,false);//画出下轮子
                g.fill3DRect(x+10,y+10,40,20,false);//画出坦克身体
                g.fillOval(x+20,y+10,20,20);//画出坦克帽子
                g.drawLine(x+30,y+20,x,y+20);//画出炮筒
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    //键盘按下后，该方法会被调用
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP){
            //改变坦克的方向
            hero.setDirect(0);
            //修改坦克坐标
            hero.moveUp();
            System.out.println("向上");
        }else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            hero.setDirect(1);
            hero.moveRight();
        }else if(e.getKeyCode() == KeyEvent.VK_DOWN){
            hero.setDirect(2);
            hero.moveDown();
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            hero.setDirect(3);
            hero.moveLeft();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
