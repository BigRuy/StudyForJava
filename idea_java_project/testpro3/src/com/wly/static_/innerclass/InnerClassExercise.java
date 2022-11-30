package com.wly.static_.innerclass;

public class InnerClassExercise {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        //匿名内部类在底层的实际生成代码
        //class niming impelements Bell{
        //      @Override
        //      public void ring() {
        //          System.out.println("懒猪起床了");
        //      }
        // }
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}
interface Bell{
    void ring();
}
class CellPhone{
    public void alarmclock(Bell bell){//形参是接口类型
        bell.ring();//动态绑定
    }
}