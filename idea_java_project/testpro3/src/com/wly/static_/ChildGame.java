package com.wly.static_;

public class ChildGame {

    public static void main(String[] args) {
        //通过类来访问类变量
        child.count++;
    }
}
class child{
    private String name;
    //在属性里定义一个类变量(静态变量)
    //该变量的最大特点会被本类的所有实例共享
    public static int count = 0;

    public child(String name){
        this.name = name;
    }
}
