package com.wly.poly.polyparameter;

public class Woker extends Employee{

    public Woker(String name, double salry) {
        super(name, salry);
    }

    public void work(){
        System.out.println("普通员工"+getName()+"正在工作");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
