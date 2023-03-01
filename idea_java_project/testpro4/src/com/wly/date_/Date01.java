package com.wly.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 王露夷
 * @version 1.0
 */
public class Date01 {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();//获取当前系统时间
        System.out.println("当前时间="+d1);
        Date d2 = new Date(89898989);//通过指定的毫秒数指定时间
        System.out.println(d2);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月DD日 hh:mm:ss E");
        String format = simpleDateFormat.format(d1);//将日期转换成指定格式的字符串
        System.out.println(format);

        String s = "2023年03月60日 01:38:43 星期三";//此处给出的格式要和定义的格式是一样的，不然会报异常
        Date parse = simpleDateFormat.parse(s);//可以把一个格式化的String转成相应的Date
        System.out.println(parse);

    }
}
