package com.wly.exception_;

import java.util.Scanner;

/**
 * @author 王露夷
 * @version 1.0
 */
public class Exception_ {
    public static void main(String[] args) {
        Exception_ exception_ = new Exception_();
        System.out.println(exception_.scan());
    }

    //定义一个函数，让用户输入一个整数，如果输入的不是整数，则一直重复提示输入整数
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
