package com.wly.tankgame3;

import com.wly.tankgame2.MyPanel;
import com.wly.tankgame2.TankGame02;

import javax.swing.*;

/**
 * @author 王露夷
 * @version 3.0
 * 主程序
 */
public class TankGame03 extends JFrame {
    com.wly.tankgame3.MyPanel mp = null;
    public static void main(String[] args) {
        TankGame03 tankGame01 = new TankGame03();
    }
    public TankGame03(){
        mp = new com.wly.tankgame3.MyPanel();
        //启动画板这个线程，完成刷新画板的目的
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);
        this.setSize(1000,750);
        this.setVisible(true);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
