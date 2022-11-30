package com.wly.static_.block;

public class CodeBLock {

}

class movie{
    private String name;
    private double price;
    private String director;

    //3个构造器重载
    //3个构造器都有相同的语句，可以把相同的语句放入到一个代码块中
    //不管调用哪一个构造器创建对象，都会先调用代码块的内容
    {
        System.out.println("电影屏幕打开");
        System.out.println("广告开始");
        System.out.println("电影正式开始");
    }

    public movie(String name) {
//        System.out.println("电影屏幕打开");
//        System.out.println("广告开始");
//        System.out.println("电影正式开始");
        this.name = name;
    }

    public movie(String name, double price) {
//        System.out.println("电影屏幕打开");
//        System.out.println("广告开始");
//        System.out.println("电影正式开始");
        this.name = name;
        this.price = price;
    }

    public movie(String name, double price, String director) {
//        System.out.println("电影屏幕打开");
//        System.out.println("广告开始");
//        System.out.println("电影正式开始");
        this.name = name;
        this.price = price;
        this.director = director;
    }

    public static void main(String[] args) {

    }
}
