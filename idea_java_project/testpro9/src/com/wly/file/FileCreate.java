package com.wly.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author 王露夷
 * @version 1.0
 * 演示如何创建文件
 */
public class FileCreate {
    public static void main(String[] args) {

    }

    //第一个方式
    @Test
    public void create1(){
        //给出文件路径
        String filePath = "/Users/ruy/Desktop/news1.txt";
        //创建文件对象
        File file = new File(filePath);
        try {
            //创建文件
            //此处必须要调用这个方法，前面创建的只是在内存中文件，外存中的文件还没有创建，所以这个方法必须要调用
            file.createNewFile();
            System.out.println("successfully created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //第二个方式
    @Test
    public void create2(){
        //给出父目录文件
        File parentFile = new File("/Users/ruy/Desktop");
        //给出子路径
        String fileName = "news2.txt";
        //创建文件对象
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("successfully created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //第三个方式
    @Test
    public void create3(){
        String parentPath = "/Users/ruy/Desktop";
        String fileName = "news3.txt";
        File file = new File(parentPath, fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
