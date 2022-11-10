package com.wly.poly.polyparameter;

public class testEmployee {
    public static void main(String[] args) {
        Woker tom = new Woker("tom", 2000);
        Manager jack = new Manager("jack", 5000, 200000);
        testEmployee testEmployee = new testEmployee();
        testEmployee.showEmpAnnual(tom);
        testEmployee.showEmpAnnual(jack);
        testEmployee.testWoker(tom);
        testEmployee.testWoker(jack);
    }
    //
    public void showEmpAnnual(Employee employee){
        System.out.println(employee.getAnnual());//动态绑定机制
    }
    //
    public void testWoker(Employee employee){
        if(employee instanceof Woker){
            ((Woker) employee).work();//向下转型的操作
        }else if(employee instanceof Manager){
            ((Manager) employee).manage();
        }else{

        }
    }
}
