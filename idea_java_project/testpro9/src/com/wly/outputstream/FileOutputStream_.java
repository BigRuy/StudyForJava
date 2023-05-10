package com.wly.outputstream;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author 王露夷
 * @version 1.0
 * 演示使用fileoutputstream将数据写到文件中
 */
public class FileOutputStream_ {
    public static void main(String[] args) {

    }


    /**
     * 演示字节流写入数据
     */
    @Test
    public void writeFile(){
        //创建FileOutputStream对象
        FileOutputStream fileOutputStream = null;
        //创建要写入文件的路径
        String filePath = "/Users/ruy/Desktop/test.txt";
        try {
            //创建字节输出流
            //这种创建方式会覆盖之前文件中的内容，如果写入方式不需要覆盖而是追加，可以在参数后面加入一个true
            fileOutputStream = new FileOutputStream(filePath);
            //写入一个字节
            fileOutputStream.write('H');
            //写入一个字符串
            String str = "hello,world";
            //getBytes可以把一个字符串转化为字符数组
            fileOutputStream.write(str.getBytes());


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
