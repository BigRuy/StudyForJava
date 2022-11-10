package com.wly.poly.polyparameter;

public class Manager extends Employee{
    private double bonus;

    public void manage(){
        System.out.println("经理"+getName()+"正在管理");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual()+bonus;
    }

    public Manager(String name, double salry, double bonus) {
        super(name, salry);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
