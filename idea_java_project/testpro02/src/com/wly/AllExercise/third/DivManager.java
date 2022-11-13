package com.wly.AllExercise.third;

public class DivManager extends Employee{
    private double lev = 1.2;

    @Override
    public double showSal() {
        return super.showSal()*lev+1000;
    }

    public DivManager(String name, double daySal, int workDay, double lev) {
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
