package com.wly.date_;

import java.util.Calendar;

/**
 * @author 王露夷
 * @version 1.0
 */
public class calendar_ {
    public static void main(String[] args) {
        //calendar类是一个抽象类，并且构造器是私有的
        //可以通过getInstance来获取实例
        Calendar c = Calendar.getInstance();//创建日历类的对象
        System.out.println(c);
    }
}
