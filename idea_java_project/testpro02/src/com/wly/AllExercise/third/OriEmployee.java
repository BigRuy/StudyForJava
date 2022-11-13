package com.wly.AllExercise.third;

public class OriEmployee extends Employee{
    private double lev = 1.0;

    @Override
    public double showSal() {
        return super.showSal()*lev;
    }

    public OriEmployee(String name, double daySal, int workDay, double lev) {
        super(name, daySal, workDay);
        this.lev = lev;
    }

    public double getLev() {
        return lev;
    }

    public void setLev(double lev) {
        this.lev = lev;
    }
}
