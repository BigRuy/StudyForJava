package com.wly.homework;

/**
 * @author 王露夷
 * @version 1.0
 */
public class homework1 {
    public static void main(String[] args) {


    }
    /**
     * 完成输出格式化的字符串
     */
    //定义方法
    public void printName(String str){
        if(str == null){
            System.out.println("字符串不能为空");
            return;
        }

        String[] s = str.split(" ");

        if(s.length != 3){
            System.out.println("格式不对");
            return ;
        }
        String format = String.format("%s %s %c", s[2], s[0], s[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
