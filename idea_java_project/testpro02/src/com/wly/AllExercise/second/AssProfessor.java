package com.wly.AllExercise.second;

public class AssProfessor extends Teacher{

    private double salLevel = 1.2;

    public AssProfessor(String name, int age, String post, double salary, double salLevel) {
        super(name, age, post, salary);
        this.salLevel = salLevel;
    }

    @Override
    public String introduce() {
        return super.introduce()+"副教授工资级别为"+salLevel;
    }
}
