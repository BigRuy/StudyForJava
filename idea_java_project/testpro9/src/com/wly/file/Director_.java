package com.wly.file;

import org.junit.Test;

import java.io.File;

/**
 * @author 王露夷
 * @version 1.0
 */
public class Director_ {
    public static void main(String[] args) {

    }
    @Test
    //判断文件是否存在，存在就删除
    public void m1(){
        String filePath = "/Users/ruy/Desktop/news2.txt";
        File file = new File(filePath);
        if(file.exists()){
            if(file.delete()){
                System.out.println("delete success");
            }else{
                System.out.println("delete failed");
            }
        }else{
            System.out.println("file does not exist");
        }
    }

}
