package com.wly.AllExercise.seventh;

public class Person {
    private String name;
    private int age;
    private char gender;


    public String basicInfo() {
        return name+"\n"+age+"\n"+gender;
    }

    public String play() {
        return getName()+"爱玩";
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
