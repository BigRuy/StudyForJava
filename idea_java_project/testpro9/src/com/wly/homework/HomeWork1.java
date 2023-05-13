package com.wly.homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 王露夷
 * @version 1.0
 */
public class HomeWork1 {
    public static void main(String[] args) throws IOException {
        String parent = "/Users/ruy/Desktop/mytemp";
        File dir = new File(parent);
        dir.mkdir();
        String filePath = "hello.txt";
        File file = new File(parent, filePath);
        if(file.exists()){
            System.out.println("文件已经存在");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("hello world");
            fileWriter.close();
        }else{
            file.createNewFile();
        }

    }
}
