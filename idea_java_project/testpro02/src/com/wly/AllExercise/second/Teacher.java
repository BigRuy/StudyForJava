package com.wly.AllExercise.second;

public class Teacher {

    private String name;
    private int age;
    private String post;
    private double salary;

    //业务方法，输出一个教师信息
    public String introduce() {
        return "教师"+name+"年龄为"+age+"职位为"+post+"基本工资为"+salary;
    }

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
