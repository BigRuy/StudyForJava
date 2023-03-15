package com.wly.generic.improve;

/**
 * @author 王露夷
 * @version 1.0
 */
public class customGeneric {
    public static void main(String[] args) {

    }
}

//自定义泛型
//泛型标识符一般都是单个大写字母
//泛型标识符可以有多个
//普通成员可以使用泛型
//使用泛型的数组不可以被初始化
class Tiger<T,R,M>{
    String name;
    T t;
    R r;
    M m;
    T arr[];

    public Tiger(String name, T t, R r, M m) {
        this.name = name;
        this.t = t;
        this.r = r;
        this.m = m;
    }
}