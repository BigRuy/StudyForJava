package com.wly.AllExercise.second;

public class Lecturer extends Teacher{

    private double salLevel = 1.1;

    public Lecturer(String name, int age, String post, double salary, double salLevel) {
        super(name, age, post, salary);
        this.salLevel = salLevel;
    }

    @Override
    public String introduce() {
        return super.introduce()+"讲师工资级别为"+salLevel;
    }
}
