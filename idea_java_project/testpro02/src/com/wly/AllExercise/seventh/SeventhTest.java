package com.wly.AllExercise.seventh;

public class SeventhTest {
    public static void main(String[] args) {
        //多态数组
        Person[] people = new Person[2];
        people[0] = new Student("",2,'男',"");
        people[1] = new Teacher("",3,'女',5);
    }

    //方法：完成年龄从低到高排序
    public void Sort(Person[] person) {
        for (int i = 0; i < person.length-1; i++) {
            for (int j = 0; j < person.length-1-i ; j++) {
                if(person[j].getAge()<person[j+1].getAge()) {
                    Person tmep = null;
                    tmep = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = tmep;
                }
            }
        }
    }
}
