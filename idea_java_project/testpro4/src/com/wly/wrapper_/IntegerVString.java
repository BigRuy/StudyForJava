package com.wly.wrapper_;

/**
 * @author 王露夷
 * @version 1.0
 */
public class IntegerVString {
    public static void main(String[] args) {
        //包装类转换成String
        Integer i = 100;//自动装箱
        //方式1
        String str = i.toString();
        //方式2
        String str1 = i + "";
        //方式3
        String str2 = String.valueOf(i);

        //String转换成包装类
        String str4 = "12345";
        //方式1
        Integer integer = Integer.parseInt(str4);//使用自动装箱
        //方式2
        Integer integer1 = new Integer(str4);//使用构造器
    }
}
