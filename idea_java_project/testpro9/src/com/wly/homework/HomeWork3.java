package com.wly.homework;

import java.io.*;
import java.util.Properties;

/**
 * @author 王露夷
 * @version 1.0
 */
public class HomeWork3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建对象
        Properties properties = new Properties();
        //创建键值对
        properties.setProperty("name","tom");
        properties.setProperty("age","5");
        properties.setProperty("color","red");
        //将键值对存储到文件中
        properties.store(new FileWriter("src/dog.properties"),null);
        //加载指定的配置文件
        properties.load(new FileReader("src/dog.properties"));
        //创建一个dog对象使用构造器
        //此处需要将String转换为int，使用Integer
        dog dog = new dog(properties.getProperty("name"), Integer.parseInt(properties.getProperty("age")), properties.getProperty("color"));
        //创建序列化流的对象
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/dog.dat"));
        //将对象序列化到文件中
        objectOutputStream.writeObject(dog);
        //guanbiliu
        objectOutputStream.close();
        //创建反序列化的对象流
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/dog.dat"));
        dog dog1 = (dog) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("反序列化之后");
        System.out.println(dog1);

    }
}
//创建一个dog对象并且可序列化
class dog implements Serializable{

    private String name;
    private int age;
    private String color;

    public dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
