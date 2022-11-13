package com.wly.AllExercise.third;

public class Employee {
    private String name;
    private double daySal;
    private int workDay;

    //打印工资
    public double showSal() {
        return daySal*workDay;
    }

    public Employee(String name, double daySal, int workDay) {
        this.name = name;
        this.daySal = daySal;
        this.workDay = workDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySal() {
        return daySal;
    }

    public void setDaySal(double daySal) {
        this.daySal = daySal;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }
}
