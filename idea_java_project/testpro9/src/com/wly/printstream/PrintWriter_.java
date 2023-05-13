package com.wly.printstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

/**
 * @author 王露夷
 * @version 1.0
 * 演示字符打印流的使用
 */
public class PrintWriter_ {
    public static void main(String[] args) {
        PrintWriter printWriter = new PrintWriter(System.out);//传入一个标准输出
        try {
            PrintWriter printWriter1 = new PrintWriter(new FileWriter("/Users/ruy/Desktop/news3.txt"));
            printWriter1.println("南朝四百八十寺，多少楼台烟雨中");
            //必须要关闭流
            printWriter1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        printWriter.println("奈何明月照沟渠");

        printWriter.close();

    }
}
