package com.wly.event_;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author 王露夷
 * @version 1.0
 * 演示通过键盘移动小球上下左右-讲解java的事件控制
 */
public class BallMove extends JFrame{
    MyPanel mp = null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }

    public BallMove(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(800,1200);
        this.setVisible(true);
        //窗口Jframe可以监听键盘事件
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


//画板
//实现监听器接口
class MyPanel extends JPanel implements KeyListener {

    //设置左上角坐标变量
      int x = 10;
      int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);//默认黑色
    }

    //有字符输出时，该方法会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //当某个键按下，该方法会触发
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println((char)e.getKeyCode()+"被按下");
        //根据用户按下的键，来处理小球的移动
        //java中给每一个键分配一个值
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            y++;
        }else if(e.getKeyCode() == KeyEvent.VK_UP){
            y--;
        }else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            x++;
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            x--;
        }
        //让面板重新画一次
        this.repaint();
    }

    //当某个键松开，该方法会触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
