package com.wly.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author 王露夷
 * @version 1.0
 * 演示如何在面板上画出一个圆
 */
public class DrawCirle extends JFrame{//Jframe对应一个窗口
    //定义一个面板
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCirle();
    }

    public DrawCirle(){//构造器
        //初始化面板
         mp = new MyPanel();
         //把面板放在窗口里
        this.add(mp);
        //设置窗口大小
        this.setSize(1200,800);
        //点击窗口的关闭，程序就退出了
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置可以显示
        this.setVisible(true);
    }
}
//定义一个Mypanel类继承Jpanel
class MyPanel extends JPanel{
    //Mypanel对象就是一个画板
    //对象g就是一个画笔
    //graphics提供了很多绘图方法
    @Override
    public void paint(Graphics g) {//绘图方法
        super.paint(g);//调用父类的方法完成初始化
        g.drawOval(10,10,100,100);
        g.drawOval(200,200,300,300);
        //画直线
        g.drawLine(1,1,10,10);
        //画矩形
        g.drawRect(2,2,10,10);
        //画填充矩形
        g.setColor(Color.BLUE);//设置颜色
        g.fillRect(10,10,100,100);
        //画图片


    }
}




