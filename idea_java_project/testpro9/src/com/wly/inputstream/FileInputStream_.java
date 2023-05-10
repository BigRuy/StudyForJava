package com.wly.inputstream;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 王露夷
 * @version 1.0
 * 演示FileInputStream的使用（文件->程序）
 */
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    /**
     * 演示字节流读取文件
     * 单个字节的读取，效率低
     * 可以使用read（byte[] b）优化
     */
    @Test
    public void readFile1(){
        //要读取文件的路径
        String filePath = "/Users/ruy/Desktop/news2.txt";
        int readData;
        FileInputStream fileInputStream = null;
        try {
            //创建流对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取一个字节的数据
            //如果读取正常返回的是读到的字节的编码值
            //读到文件的末尾会返回-1，表示读取完毕,没有返回-1，就一直读
            while ((readData = fileInputStream.read()) != -1){
                System.out.print((char)readData);//转成char来显示
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            //当文件完成读取后，需要关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void readFile2(){
        //要读取文件的路径
        String filePath = "/Users/ruy/Desktop/news2.txt";
        //定义一个大小为8的字节数组
        byte[] buf = new byte[8];
        int readlen = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建流对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);
            //从该输入流一次性读取8个字节的数据
            //如果读取正常，返回实际读取的字节数
            //读到文件的末尾会返回-1，表示读取完毕,没有返回-1，就一直读
            while ((readlen = fileInputStream.read(buf)) != -1){
                System.out.print(new String(buf,0,readlen));//直接把字符数组转为字符串。0-readlen的范围构建字符串
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            //当文件完成读取后，需要关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
