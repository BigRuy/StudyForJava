package com.wly.poly.polyArray;

public class teacher extends Person{
    private double salary;

    public teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say()+"salary="+salary;
    }
    //特有方法
    public void teach(){
        System.out.println("老师"+getName()+"正在授课");
    }
}
