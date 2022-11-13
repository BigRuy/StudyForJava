package com.wly.AllExercise.sixth;

import java.util.Objects;

public class Docter {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    @Override
    public boolean equals(Object obj) {
        if(this == obj){//如果是同一个类，直接输出true
            return true;
        }
        if(obj instanceof Docter){
            Docter docter = (Docter)obj;
            return this.name.equals(docter.name) && this.age==docter.age && this.job.equals(docter.job) && this.gender==docter.gender && this.sal==docter.sal;
        }
        return false;
    }



    @Override
    public int hashCode() {
        return Objects.hash(name, age, job, gender, sal);
    }

    public Docter(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
