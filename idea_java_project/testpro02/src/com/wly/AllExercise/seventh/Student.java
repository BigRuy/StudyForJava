package com.wly.AllExercise.seventh;

public class Student extends Person{
    private String stu_id;


    public void showInfo() {
        System.out.println("学生信息是");
        System.out.println(super.basicInfo());
        System.out.println(stu_id);
        study();
        System.out.println(play());
    }
    public void study() {
        System.out.println("我承诺我会好好学习java");
    }

    @Override
    public String play() {
        return super.play()+"足球";
    }

    //构造器
    public Student(String name, int age, char gender, String stu_id) {
        super(name,age,gender);
        this.stu_id = stu_id;
    }
    //getter和setter方法
    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
}
