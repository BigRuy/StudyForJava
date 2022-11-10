package com.wly.poly.polyArray;

public class polyArray {
    public static void main(String[] args) {
        //父类的引用可以指向子类的对象
        Person[] persons = new Person[3];
        persons[0] = new Student("jcak",10,100);
        persons[1] = new Person("fulei",20);
        persons[2] = new teacher("laoshi",40,1000);
        //循环遍历多态数组，调用say
        for (int i = 0; i <persons.length ; i++) {
            //此处调用方法时会根据不同的运行类型来调用不同对象的say
            System.out.println(persons[i].say());//动态绑定机制，根据运行类型来判断执行哪个类下的say方法
            if(persons[i] instanceof Student){//判断运行类型是否是Student
                Student student = (Student)persons[i];//向下转型
                student.study();
            }else if(persons[i] instanceof teacher){
                 teacher teacher = (teacher)persons[i];
                 teacher.teach();
            }else{

            }

        }
    }
}
