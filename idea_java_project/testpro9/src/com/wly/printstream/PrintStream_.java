package com.wly.printstream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * @author 王露夷
 * @version 1.0
 * 演示字节打印流的用法
 */
public class PrintStream_ {
    public static void main(String[] args) {
        PrintStream out = System.out;
        //默认情况下PrintStream输出数据的位置是标准输出位置
        out.println("helloworld");
        //也可以直接使用write进行打印
        try {
            out.write("你是傻逼".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //我们也可以改变输出的位置
        try {
            System.setOut(new PrintStream("/Users/ruy/Desktop/news3.txt"));
            //修改后输出的位置就会变为上面这个文件里
            System.out.println("我本将心向明月");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        out.close();
    }
}
