package com.wly.AllExercise.third;


public class ThirdTest {
    public static void main(String[] args) {
        OriEmployee jack = new OriEmployee("jack", 100, 30, 1.0);
        DivManager bob = new DivManager("bob", 200, 30, 1.2);
        Double allSal1 = jack.showSal();
        System.out.println(allSal1);
        Double allSal2 = bob.showSal();
        System.out.println(allSal2);

    }
}
