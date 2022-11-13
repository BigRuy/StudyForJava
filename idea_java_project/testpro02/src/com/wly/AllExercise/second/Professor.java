package com.wly.AllExercise.second;

public class Professor extends Teacher{
    private double salLevel = 1.3;

    public Professor(String name, int age, String post, double salary, double salLevel) {
        super(name, age, post, salary);
        this.salLevel = salLevel;
    }

    @Override
    public String introduce() {
        return super.introduce()+"教授工资级别为"+salLevel;
    }
}
