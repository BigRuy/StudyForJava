package com.wly.writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 王露夷
 * @version 1.0
 * 演示字符流写入数据
 */
public class FileWriter_ {
    public static void main(String[] args) {
        //创建字符输出流对象
        FileWriter fileWriter=  null;
        String filePath = "/Users/ruy/Desktop/news2.txt";
        String str = "风雨之后会有彩虹";
        try {
            fileWriter = new FileWriter(filePath);
            //第一种写入方式
            fileWriter.write("H");
            //第二种
            fileWriter.write(str.toCharArray());
            //第三种
            fileWriter.write(str.toCharArray(),0,3);
            //第四种
            fileWriter.write(str,0,2);
            //第五种
            fileWriter.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                // 此处一定要关流，不然不会写入
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
