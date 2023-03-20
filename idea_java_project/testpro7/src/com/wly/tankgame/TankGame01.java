package com.wly.tankgame;

import javax.swing.*;

/**
 * @author 王露夷
 * @version 1.0
 * 主程序
 */
public class TankGame01 extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        TankGame01 tankGame01 = new TankGame01();
    }
    public TankGame01(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000,750);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
