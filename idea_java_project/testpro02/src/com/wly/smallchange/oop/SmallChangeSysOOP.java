package com.wly.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *该类完成零钱通的各个功能
 *使用面向对象编程
 *将每一个功能对应一个方法
 */
public class SmallChangeSysOOP {
    //属性
    //先完成显示菜单，并可以选择，给出对应提示
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";

    //完成零钱通明细
    String detail ="\n-------------零钱通明细-----------------";

    //完成收益入账
    double inMoney = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    //完成消费
    String note = "";

    //完成退出确认
    String pass = "";

    //显示主菜单
    public void mainMenu() {
        do{
            System.out.println("==========零钱通菜单OOP=========");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");
            System.out.print("请选择（1-4）：");
            key = scanner.next();
            switch (key){
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;

                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }while (loop);
    }

    //完成零钱通明细
    public void detail() {
        System.out.println(detail);
    }

    //完成收益入账
    public void income() {
        System.out.print("输入入账金额：");
        inMoney = scanner.nextDouble();
        //如果输入金额小于0，提示错误，直接跳出
        if(inMoney<=0){
            System.out.println("输入金额需要 大于0");
            return;
        }
        balance += inMoney;
        date = new Date();
        detail += "\n收益入账\t+"+inMoney+"\t"+sdf.format(date)+"\t"+"余额"+balance;
    }

    //完成消费
    public void pay() {
        System.out.print("输入消费金额:");
        inMoney = scanner.nextDouble();
        //如果输入金额小于0或者大于余额，则提示错误，并且直接break
        if(inMoney<=0 || inMoney>balance) {
            System.out.println("消费金额应该在0-" + balance);
            return;
        }
        System.out.print("输入消费记录:");
        note = scanner.next();
        balance -= inMoney;
        date = new Date();
        detail += "\n"+note+"\t"+"\t-"+inMoney+"\t"+sdf.format(date)+"\t"+"余额"+balance;
    }

    //退出功能
    public void exit() {
        while(true){
            System.out.println("你确定要退出吗？y/n");
            pass = scanner.next();
            if("y".equals(pass) || "n".equals(pass)){
                break;
            }
        }
        if(pass.equals("y")){
            loop = false;
        }
    }
}
