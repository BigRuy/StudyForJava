package com.wly.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 王露夷
 * @version 1.0
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        //给出要写入的文件路径
        String filePath = "/Users/ruy/Desktop/news2.txt";
        //创建对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        //定义要写入的内容
        String str = "我是你爷爷";
        bufferedWriter.write(str);
        //插入换行，插入一个和系统相关的换行
        bufferedWriter.newLine();
        bufferedWriter.write(str);
        //关闭外层流即可
        bufferedWriter.close();

    }
}
