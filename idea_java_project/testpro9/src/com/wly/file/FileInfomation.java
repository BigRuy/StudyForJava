package com.wly.file;

import org.junit.Test;

import java.io.File;

/**
 * @author 王露夷
 * @version 1.0
 * 获取文件信息
 */
public class FileInfomation {
    public static void main(String[] args) {


    }

    @Test
    public void info(){
        //先创建文件对象
        File file = new File("/Users/ruy/Desktop/news2.txt");
        //调用相应方法得到文件信息
        System.out.println("文件名字"+file.getName());
        System.out.println("文件绝对路径"+file.getAbsolutePath());
        System.out.println("文件父级目录"+file.getParent());
        System.out.println("文件大小"+file.length()+"个字节");
        System.out.println("文件是否存在"+file.exists());
        System.out.println("文件是否是一个目录"+file.isDirectory());
    }
}
