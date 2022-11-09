package com.wly.poly;

public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("tom");
        Dog dog1 = new Dog("dog1");
        Bone bone = new Bone("大棒骨");
        tom.feed(dog1,bone);

    }
}
