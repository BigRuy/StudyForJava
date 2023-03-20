package com.wly.tankgame2;

import javax.swing.*;

/**
 * @author 王露夷
 * @version 1.0
 * 主程序
 */
public class TankGame02 extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        TankGame02 tankGame01 = new TankGame02();
    }
    public TankGame02(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000,750);
        this.setVisible(true);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
