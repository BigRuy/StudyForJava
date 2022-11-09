package com.wly.extend;
//大学生类和小学生类的父类
public class Student {
    //共有属性
    public String name;
    public int age;
    private double score;

    //共有方法
    public void setScore(double score) {
        this.score = score;
    }
    public void showInfo() {
        System.out.println("名字"+name+"年龄"+age+"成绩"+score);
    }



}
