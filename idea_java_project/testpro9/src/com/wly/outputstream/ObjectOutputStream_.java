package com.wly.outputstream;

import java.io.*;

/**
 * @author 王露夷
 * @version 1.0
 * 演示ObjectOutputStream类的使用，完成对象的序列化
 */
public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException {
        //序列化后保存的文件格式，不是纯文本，而是按照他自己的格式来保存
        String filePath = "/Users/ruy/Desktop/news2.txt";
        //创建对象
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
        //序列化数据到文件中
        //需要序列化的数据对象必须实现了serializable
        objectOutputStream.writeInt(100);
        objectOutputStream.writeBoolean(true);
        objectOutputStream.writeUTF("我是你爸爸");
        objectOutputStream.writeObject(new dog("旺财",10));

    }
}
class dog implements Serializable{
    private String name;
    private int age;
    private static final long serialVersionUID  = 1L;
    public dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
