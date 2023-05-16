package com.wly.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 王露夷
 * @version 1.0
 */
public class HomeWork2 {
    public static void main(String[] args) throws IOException {
        //给出要读取文件的路径】
        String filePath ="/users/ruy/Desktop/news3.txt";
        //创建输入流对象,此处使用字符包装流BufferedReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line = null;
        while((line = bufferedReader.readLine()) !=null){
            System.out.println(line+"。");
        }
        //关闭输入流
        bufferedReader.close();
    }
}
