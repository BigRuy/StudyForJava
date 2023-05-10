package com.wly.tankgame3;

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
    @SuppressWarnings("all")
public class MyPanel extends JPanel implements KeyListener,Runnable {
    //定义我的坦克
    com.wly.tankgame3.Hero hero = null;
    //定义敌人的坦克
    Vector<com.wly.tankgame3.Enemy> enemys = new Vector<>();
    public MyPanel(){
        hero = new com.wly.tankgame3.Hero(100,200);//初始化自己的坦克
        hero.setSpeed(5);//初始化的时候改变坦克移动的速度
        //初始化敌人的坦克
        int enemySize = 3;
        for (int i = 0; i <enemySize ; i++) {
            //初始化敌人的坦克
            com.wly.tankgame3.Enemy enemy = new com.wly.tankgame3.Enemy((100 * (i + 1)), 0);
            //设置敌人的坦克炮筒的方向
            enemy.setDirect(2);
            //启动敌人坦克线程
            new Thread(enemy).start();
            //给每一个敌人坦克添加一个子弹

            Shot shot = new Shot(enemy.getX() + 20, enemy.getY() + 60, enemy.getDirect());
            //把子弹添加到集合中
            enemy.shots.add(shot);
            //启动子弹线程
            new Thread(shot).start();
            //将敌人的坦克放入集合中
            enemys.add(enemy);
        }
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充矩形，默认黑色

        //画出我们的坦克-封装方法，只有当我们坦克还活着的时候才去绘制
        if(hero.isLive) {
            drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);
            //画出子弹,只有当射击子弹的线程被启动时，shot不为空时，并且子弹还存活的时候才绘制子弹
            //画出hero的子弹集合
            //并且我方坦克还活着的时候可以去绘制子弹
            for (int i = 0; i <hero.shots.size() ; i++) {
                Shot shot = hero.shots.get(i);//取出集合中的子弹
                if(shot!=null && shot.isLive()){
                    g.draw3DRect(shot.getX(),shot.getY(),2,2,false);
                }else {//子弹没有存活的时候就在集合中把这个子弹删除
                    hero.shots.remove(shot);
                }
            }
        }
//        //画出子弹,只有当射击子弹的线程被启动时，shot不为空时，并且子弹还存活的时候才绘制子弹
//        //画出hero的子弹集合
//        for (int i = 0; i <hero.shots.size() ; i++) {
//            Shot shot = hero.shots.get(i);//取出集合中的子弹
//            if(shot!=null && shot.isLive()){
//                g.draw3DRect(shot.getX(),shot.getY(),2,2,false);
//            }else {//子弹没有存活的时候就在集合中把这个子弹删除
//                hero.shots.remove(shot);
//            }
//        }
//        if(hero.shot!=null && hero.shot.isLive() == true){
//            g.draw3DRect(hero.shot.getX(),hero.shot.getY(),2,2,false);
//        }

        //画出敌人的坦克
        //先遍历集合
        for (int i = 0; i <enemys.size() ; i++) {
            //遍历到集合中每一个敌人坦克
            Enemy enemy = enemys.get(i);
            //调用画出坦克的方法
            if(enemy.isLive){//当敌人是活着的时候才去绘制
                drawTank(enemy.getX(),enemy.getY(),g,enemy.getDirect(),0);
                //画出所有的子弹
                for (int j = 0; j <enemy.shots.size(); j++) {
                    //从集合中获取一个子弹
                    Shot shot = enemy.shots.get(j);
                    if(shot.isLive()){
                        //当子弹存活的时候才绘制
                        g.draw3DRect(shot.getX(), shot.getY(), 2,2,false);
                    }else{
                        //子弹没有存活的时候就在集合中把这个子弹删除
                        enemy.shots.remove(shot);
                    }
                }
            }

        }
    }
    //实现多个子弹的时候，判断是否击中敌人坦克就需要把集合中每一个子弹遍历取出来比较
    public void hitEnemyTank(){
        //遍历子弹集合
        for (int i = 0; i < hero.shots.size(); i++) {
            //取出每一个子弹
            Shot shot = hero.shots.get(i);
            //判断这一个子弹是否击中了敌人坦克
            if(shot!=null && shot.isLive()){//当我的子弹还存活的时候，才进行判断
                //遍历敌人的坦克
                for (int j = 0; j <enemys.size(); j++) {
                    //取出敌人坦克
                    Enemy enemy = enemys.get(j);
                    //把每一个子弹和一个敌人坦克是否击中做比较
                    hitEnemytank(shot,enemy);
                }
            }
        }
    }

    //实现方法，判断子弹是否击中敌人坦克
    public  void hitEnemytank(Shot s,Enemy enemy){
        switch (enemy.getDirect()){
            case 0:
            case 2://敌人坦克向下
                if(s.getX()>enemy.getX() && s.getX()<enemy.getX()+40 && s.getY()> enemy.getY() && s.getY()< enemy.getY()+60){
                    //当子弹进入敌人坦克的区域后就把重新赋值子弹的是否存活和敌人坦克的是否存活
                    s.setLive(false);
                    enemy.isLive = false;
                    //当敌人坦克被击中后，需要从集合中删除敌人坦克
                    enemys.remove(enemy);
                }
                break;
            case 3:
            case 1:
        }
    }
    //实现方法，判断敌人坦克的子弹是否击中我方坦克
    public void hitHerotank(Shot s, Hero hero){
        switch (hero.getDirect()){
            case 0://我方坦克向上
                if(s.getX()>hero.getX() && s.getX()<hero.getX()+40 && s.getY()> hero.getY() && s.getY()< hero.getY()+60){
                    //当子弹进入我方坦克的区域后，把子弹销毁并且我方坦克是否存活的属性赋值为false
                    s.setLive(false);
                    hero.isLive = false;
                }
                break;
            case 2://我方坦克向下
                if(s.getX()>hero.getX() && s.getX()<hero.getX()+40 && s.getY()> hero.getY() && s.getY()< hero.getY()+60){
                    //当子弹进入我方坦克的区域后，把子弹销毁并且我方坦克是否存活的属性赋值为false
                    s.setLive(false);
                    hero.isLive = false;
                }
                break;
            case 3://我方坦克向左
                if(s.getX()>hero.getX() && s.getX()<hero.getX()+60 && s.getY()> hero.getY() && s.getY()< hero.getY()+40){
                    //当子弹进入我方坦克的区域后，把子弹销毁并且我方坦克是否存活的属性赋值为false
                    s.setLive(false);
                    hero.isLive = false;
                }
                break;
            case 1://我方坦克向右
                if(s.getX()>hero.getX() && s.getX()<hero.getX()+60 && s.getY()> hero.getY() && s.getY()< hero.getY()+40){
                    //当子弹进入我方坦克的区域后，把子弹销毁并且我方坦克是否存活的属性赋值为false
                    s.setLive(false);
                    hero.isLive = false;
                }
                break;
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
            //修改坦克坐标,此处规定移动到边界的时候不可以超出界限
            if(hero.getY()>0) {
                hero.moveUp();
            }
            System.out.println("向上");
        }else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            hero.setDirect(1);
            if(hero.getX()+60<1000) {
                hero.moveRight();
            }
        }else if(e.getKeyCode() == KeyEvent.VK_DOWN){
            hero.setDirect(2);
            if(hero.getY()+60<750) {
                hero.moveDown();
            }
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            hero.setDirect(3);
            if(hero.getX()>0) {
                hero.moveLeft();
            }
        }
        //如果监听到键盘按下J键，就会调用射击子弹的方法
        if(e.getKeyCode() == KeyEvent.VK_J ){
            //System.out.println("按下J键");
            //判断当前我方坦克的子弹是否销毁，只有销毁了才能打出第二个子弹
            //第一次创建子弹为空或者第二次子弹已经销毁
//            if(hero.shot == null || !hero.shot.isLive()){
//                hero.shotEnemyTank();
//            }
            hero.shotEnemyTank();
            //hero.shotEnemyTank();
            //drawTankShot(hero.getX(),hero.getY(),g,hero.getDirect(),1);
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        //每间隔50毫秒刷新一次画板
        while(true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //判断子弹是否击中了敌人坦克
            hitEnemyTank();
            //判断敌人的子弹是否我方坦克
            //遍历所有的敌人坦克
            for (int i = 0; i <enemys.size() ; i++) {
                //取出每一个敌人坦克
                Enemy enemy = enemys.get(i);
                //遍历每一个敌人坦克的子弹集合
                for (int j = 0; j < enemy.shots.size(); j++) {
                    //取出每一个敌人坦克子弹集合中的子弹
                    Shot shot = enemy.shots.get(j);
                    //判断子弹是否击中我方坦克
                    if(shot!=null && shot.isLive()){//当敌人坦克的子弹还存活的时候，才进行判断
                        //把每一个子弹和一个敌人坦克是否击中做比较
                        hitHerotank(shot,hero);
                    }
                }
            }
            this.repaint();
        }
    }
}
