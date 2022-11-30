package com.wly.static_.innerclass;

/**
 * 演示匿名内部类的使用
 */
public class Anonymous {
    public static void main(String[] args) {
        Outer03 outer03 = new Outer03();
        outer03.method();
    }
}
class Outer03{
    public void method() {
        //创建了一个接口类型的匿名内部类
        //TIger的编译类型是IA接口类型
        //Tiger的运行类型是匿名内部类的类型
        /*
         class Outer$1 impelements IA{
            @Override
            public void cry() {
                System.out.println("老虎叫唤");
            }
         }
         */
        IA tiger = new IA(){
            @Override
            public void cry() {
                System.out.println("老虎叫唤");
            }
        };
        System.out.println(tiger.getClass());
        tiger.cry();
    }
}
interface IA{
    public void cry();
}