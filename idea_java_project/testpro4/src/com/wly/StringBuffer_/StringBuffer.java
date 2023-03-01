package com.wly.StringBuffer_;

import java.nio.Buffer;
import java.util.Scanner;

/**
 * @author 王露夷
 * @version 1.0
 */
public class StringBuffer {
    public static void main(String[] args) {
        //使用构造器进行String和StringBuffer的转换
        String str = "hello";
        java.lang.StringBuffer stringBuffer1 = new java.lang.StringBuffer(str);
        //直接append方法
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer = stringBuffer.append(str);
        //使用toString方法将StringBuffer转换为String
        java.lang.StringBuffer hello = new java.lang.StringBuffer("hello");
        String s = hello.toString();
        //使用构造器直接转换
        String s1 = new String(hello);
        printPrice();
    }
    public static void printPrice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商品名称:");
        String name = scanner.next();
        System.out.println("请输入商品的价格(格式为：xxxx.xx):");
        String price = scanner.next();
        System.out.println("商品名称\t商品价格\n"+name+"\t"+formatPrice(price)+"."+price.charAt(price.length()-2)+""+price.charAt(price.length()-1));
    }
    public static java.lang.StringBuffer formatPrice(String str){
        if(str == null){
            return null;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(str);
        java.lang.StringBuffer newStringBuffer2 = null;
        java.lang.StringBuffer newStringBuffer1 = stringBuffer.delete(stringBuffer.length()-3,stringBuffer.length());
        for (int i = newStringBuffer1.length(); i >0 ; i-=3) {
            if(i>3){
                newStringBuffer2 = stringBuffer.insert(i - 3, ",");
            }
        }
        return newStringBuffer2;
    }
}
