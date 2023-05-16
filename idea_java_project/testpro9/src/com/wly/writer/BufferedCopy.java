package com.wly.writer;

import java.io.*;

/**
 * @author 王露夷
 * @version 1.0
 * 演示使用包装流实现拷贝功能
 */
public class BufferedCopy {
    public static void main(String[] args) throws IOException {
        //源文件地址
        String srcFilePath  = "/Users/ruy/Desktop/news2.txt";
        //拷贝的目标地方
        String destFilePath = "/Users/ruy/Desktop/news3.txt";
        //创建对象
        //先读取文件
        BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFilePath));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destFilePath,true));
        //读出来的一行
        String line;
        //边读边写
        while(( line= bufferedReader.readLine()) !=null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();//插入换行
        }
        if (bufferedWriter !=null) {
            bufferedWriter.close();
        }
        if (bufferedReader != null) {
            bufferedReader.close();
        }
        System.out.println("copy successful");

    }
}
