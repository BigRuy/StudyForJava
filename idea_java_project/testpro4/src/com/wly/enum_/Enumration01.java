package com.wly.enum_;

/**
 * @author 王露夷
 * @version 1.0
 */
public class Enumration01 {
    public static void main(String[] args) {
        Week[] weeks =  Week.values();
        for(Week week : weeks){//增强for循环
            System.out.println(week.getName());
        }

    }
}
class Season1{
    private String name;
    private String desc;

    public static final Season1 SPRING = new Season1("春天","温暖");

    private Season1(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }
    public String getDesc() {
        return desc;
    }
}
enum Season2{
    SPRING("春天","温暖");
    private String name;
    private String desc;

    Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
enum Week{
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),
    FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期日");
    private String name;
    Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                '}';
    }
}
