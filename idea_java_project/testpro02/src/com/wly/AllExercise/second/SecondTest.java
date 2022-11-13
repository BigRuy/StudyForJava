package com.wly.AllExercise.second;

public class SecondTest {
    public static void main(String[] args) {
        Teacher jack = new Professor("jack", 20, "历史老师", 3000,1.3);
        Teacher tom = new AssProfessor("tom", 30, "物理老师", 2500, 1.2);
        Teacher bob = new Lecturer("bob", 40, "数学老师", 2000, 1.2);
        String intro = bob.introduce();
        System.out.println(intro);

    }
}
