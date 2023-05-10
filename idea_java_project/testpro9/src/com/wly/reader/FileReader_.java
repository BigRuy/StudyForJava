package com.wly.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 王露夷
 * @version 1.0
 * 演示字符流读取文件
 */
public class FileReader_ {
    public static void main(String[] args) {
        FileReader fileReader = null;
        String filePath = "/Users/ruy/Desktop/news2.txt";
        int data = 0;
        int readLen = 0;
        char[] chars =new char[100];
        try {
            fileReader = new FileReader(filePath);
            //循环读取，使用read
            while ((data = fileReader.read()) !=-1){
                System.out.println((char)data);
            }
            //使用字符数组读取,返回的是实际读到的字符数
            while ((readLen = fileReader.read(chars)) !=-1){
                System.out.println(new String(chars,0,readLen));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileReader != null){
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




}
