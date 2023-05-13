package com.wly.properites;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 王露夷
 * @version 1.0
 */
public class Properites_ {
    public static void main(String[] args) throws IOException {
        //演示使用properties类读取文件
        //创建对象
        Properties properties = new Properties();
        //加载指定配置文件
        properties.load(new FileReader("src/mysql.properties"));
        //把键值对显示到控制台
        properties.list(System.out);
        //根据指定的键获取对应的值
        String ip = properties.getProperty("ip");
        String pwd = properties.getProperty("pwd");
        System.out.println(ip);
        System.out.println(pwd);
    }
}
