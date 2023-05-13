package com.wly.transformation;

import com.wly.standard.InputAndOuput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 王露夷
 * @version 1.0
 * 演示一个中文乱码问题
 */
public class Code {
    public static void main(String[] args) throws IOException {
        //读取一个文件到程序
        //默认情况下读取文件是按照utf-8编码进行的
        String filepath = "/Users/ruy/Desktop/news3.txt";
        //创建一个字符流
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath));
        String s = bufferedReader.readLine();
        System.out.println("读取的内容是："+s);
        bufferedReader.close();
    }
}
