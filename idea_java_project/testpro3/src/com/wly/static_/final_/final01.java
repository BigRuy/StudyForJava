package com.wly.static_.final_;

public class final01 {
    private final  double PI ;
    private double r;
    {
        PI = 3.14;
    }
    public final01(double r) {
        this.r = r;
        //PI = 3.14;
    }
    public double area(double r) {
        return PI*r*r;
    }

    public static void main(String[] args) {

    }

}


