package com.wly.wrapper_;

/**
 * @author 王露夷
 * @version 1.0
 */
public class Integer01{
    public static void main(String[] args) {
        //演示手动装箱和手动拆箱
        //jdk5以前
        //手动装箱int ->Integer
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer2 = Integer.valueOf(n1);
        //手动拆箱 Integer -> int
        int i = integer.intValue();
        //jdk5以后，就可以自动装箱和自动拆箱
        int n2 = 200;
        //自动装箱
        Integer integer1 = n2;//底层使用的是Integer.valueOf(n2)
        //自动拆箱
        int n3 = integer1;//底层使用的还是integer.intValue();

    }
}
