package com.wly.inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author 王露夷
 * @version 1.0
 * 演示反序列化数据，即恢复数据
 */
public class ObjectInputStream_ {
    public static void main(String[] args)  throws IOException {
        String filePath = "/Users/ruy/Desktop/news2.txt";
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
        //反序列化读取顺序一定要和存取序列化数据顺序是一致的
        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readBoolean());
        System.out.println(objectInputStream.readUTF());
        try {
            System.out.println(objectInputStream.readObject());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        objectInputStream.close();
    }
}
