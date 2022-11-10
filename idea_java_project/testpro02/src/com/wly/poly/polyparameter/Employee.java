package com.wly.poly.polyparameter;

public class Employee {
    private String name;
    private double salry;

    public double getAnnual(){
        return 12 * salry;
    }


    public Employee(String name, double salry) {
        this.name = name;
        this.salry = salry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalry() {
        return salry;
    }

    public void setSalry(double salry) {
        this.salry = salry;
    }
}
