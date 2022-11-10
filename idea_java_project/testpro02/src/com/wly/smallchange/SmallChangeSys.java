package com.wly.smallchange;

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
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
        do{
            System.out.println("==========零钱通菜单=========");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");
            System.out.print("请选择（1-4）：");
            key = scanner.next();
            switch (key){
                case "1":
                    System.out.println(detail);
                    break;
                case "2":
                    System.out.print("输入入账金额：");
                    inMoney = scanner.nextDouble();
                    //如果输入金额小于0，提示错误，直接跳出
                    if(inMoney<=0){
                        System.out.println("输入金额需要 大于0");
                        break;
                    }
                    balance += inMoney;
                    date = new Date();
                    detail += "\n收益入账\t+"+inMoney+"\t"+sdf.format(date)+"\t"+"余额"+balance;
                    break;

                case "3":
                    System.out.print("输入消费金额:");
                    inMoney = scanner.nextDouble();
                    //如果输入金额小于0或者大于余额，则提示错误，并且直接break
                    if(inMoney<=0 || inMoney>balance) {
                        System.out.println("消费金额应该在0-" + balance);
                        break;
                    }
                    System.out.print("输入消费记录:");
                    note = scanner.next();
                    balance -= inMoney;
                    date = new Date();
                    detail += "\n"+note+"\t"+"\t-"+inMoney+"\t"+sdf.format(date)+"\t"+"余额"+balance;
                    break;
                case "4":
                    do{
                        System.out.println("你确定要退出吗？y/n");
                        pass = scanner.next();
                        if(pass.equals("y")){
                            loop = false;
                            break;
                        }else if(pass.equals("n")){
                            break;
                        }else{
                            System.out.println("输入有误，请重新输入");
                        }
                    }while (loop);
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }while (loop);
        System.out.println("退出了零钱通");
    }
}
