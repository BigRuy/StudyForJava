package com.wly.homework;

/**
 * @author 王露夷
 * @version 1.0
 */
public class Register {
    public static void main(String[] args) {
        String name = "jack";
        String pwd = "123456";
        String email = "2842278088@qq.com";
        try {
            userRegiter(name,pwd,email);
            System.out.println("注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    /**
     * 1.要求用户名长度为2到4
     * 2.要求密码长度为6位，并且全部为数字 isDigital
     * 3.邮箱中包含@和.,并且@必须在.的前面
     */

    //定义一个注册的方法
    public static void userRegiter(String name ,String pwd ,String email){
        //第一关
        int length = name.length();
        if(!(length>=2 && length<=4)){//判断用户名的长度是否在2到4之间
            throw new RuntimeException("用户名长度不正确");
        }
        //第二关
        int pwdlength = pwd.length();//得到密码的长度
        if(!(pwdlength==6 && isDigital(pwd))){//判断密码长度是否为6并且是否全部为数字
            throw new RuntimeException("密码格式不正确");
        }
        //第三关
        int i = email.indexOf('@');//得到@字符在字符串中的下标
        int j = email.indexOf('.');//得到。字符在字符串中的下标
        if(!(i>0 && j>i)){
            throw new RuntimeException("邮箱格式不正确");
        }
    }
    //定义一个判断密码格式的方法
    public static boolean isDigital(String pwd) {
        char[] chars = pwd.toCharArray();//将字符串转换成字符数组
        for (int i = 0; i < chars.length ; i++) {
            if(!(chars[i]>'0' && chars[i]<'9')){//如果密码每一位小于0活着大于9的ascil码值，则直接返回fasle
                return false;
            }
        }
        return true;//全为数字则直接返回true


    }


}
