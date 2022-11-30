package com.wly.static_.abstract_;

public class Abstract01 {

}
abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    //父类方法不确定性
    //考虑将这个方法设计为抽象方法
    public abstract void eat();
}