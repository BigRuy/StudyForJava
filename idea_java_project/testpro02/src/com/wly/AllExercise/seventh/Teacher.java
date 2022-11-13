package com.wly.AllExercise.seventh;

public class Teacher extends Person{

    private int work_age;


    public void showInfo() {
        System.out.println("老师信息");
        System.out.println(super.basicInfo());
        System.out.println(work_age);
        teach();
        System.out.println(play());
    }
    public void teach() {
        System.out.println("我承诺我会好好教java");
    }

    @Override
    public String play() {
        return super.play()+"象棋";
    }

    //构造器
    public Teacher(String name, int age, char gender, int work_age) {
        super(name,age,gender);
        this.work_age = work_age;
    }
    //getter和setter方法
    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
}
