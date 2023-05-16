package com.wly.properites;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 王露夷
 * @version 1.0
 * 使用properties类来创建配置文件或者是修改配置文件的内容
 */
public class Properties_2 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        //创建文件、
        //如果该文件中有key就是修改，如果没有key就是创建
        properties.setProperty("charset","utf-8");
        properties.setProperty("user","jack");//保存中文的时候存的是unicode码
        properties.setProperty("pwd","123");
        //将键值对存储到文件里面
        properties.store(new FileWriter("src/mysql2.properties"),null);//此处的null表示的是注释，可以添加注释也可以不添加


    }
}
