package com.wly.exception_;

import java.util.Scanner;

/**
 * @author 王露夷
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        HomeWork01 homeWork01 = new HomeWork01();
        int i = homeWork01.scan();
        int j = homeWork01.scan();
        double res  = homeWork01.cal(i,j);
        System.out.println(res);

    }

    public double cal(int n1,int n2) throws ArithmeticException{
        double res = n1 / n2;
        return res;
    }
    public int scan(){
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        String input  = "";
        while(true){
            System.out.print("请输入一个整数：");
            input = scanner.next();
            try {
                i = Integer.parseInt(input);//将输入的数据转换为int型，这里可能会出现异常
                break;//没有出现异常就直接跳出循环
            } catch (NumberFormatException e) {
                System.out.println("输入错误，请重新输入");
            }
        }
        return i;
    }
}
