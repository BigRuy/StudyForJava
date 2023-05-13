package com.wly.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 王露夷
 * @version 1.0
 * 演示包装流Bufferedreader的使用
 */
public class BufferedReader_ {
    public static void main(String[] args) throws IOException {

        //给出文件路径
        String filePath = "/Users/ruy/Desktop/news2.txt";
        //创建BufferedReader对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        //读取文件
        String line;//按行读取，效率高
        //当返回一个空，表示文件读取完毕，
        while ((line = bufferedReader.readLine()) != null){
            //输出读取的字符串
            System.out.println(line);
        }
        //只需要关闭外层包装流，底层会自动去关闭节点流
        bufferedReader.close();

    }
}
