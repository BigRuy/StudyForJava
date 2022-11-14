package com.wly.houserental.srevce;

import com.wly.houserental.domain.House;
import com.wly.houserental.utils.Utility;

/**
 *  1. 响应HouseView的调用
 *  2.完成对房屋信息的各种增删该查操作
 *  3.
 */
public class HouseSerevce {

    private House[] houses;//保存House对象
    private House house;
    private int houseNum = 1;//房屋对象计数
    private int count = 1;//自增长id

    //构造器
    public HouseSerevce(int size) {
        houses = new House[size];//指定数组的大小
        //给数组里一个默认的元素
        houses[0] = new House(1,"jack","1234","海淀区",2000,"为出租");
    }
    //返回房屋信息列表数组
    public House[] list() {
        return houses;
    }
    //添加房屋信息
    public boolean addHouse(House house) {
        if(houseNum == houses.length){//如果房屋数量等于数组长度，则添加失败
            //实现自动扩容
            House[] newhouses = new House[houses.length+1];//创建一个新数组，长度为旧数组长度加1
            for (int i = 0; i < houses.length; i++) {
                //遍历旧数组，将旧数组中的对象复制给新数组中
                newhouses[i] = houses[i];
            }
            houses = newhouses;//让旧数组指向新数组
        }
        //将传进来的新房屋对象添加到数组已有元素的后一位，并且房屋数量加1
        houses[houseNum++] = house;
        //实现房屋对象的编号的自增长，房屋编号自增长后重新赋给房屋对象
        house.setId(++count);
        return true;
    }
    //查找房屋信息
    public House findByIdHouse(int id) {
        //判断id是否存在
        for (int i = 0; i <houseNum ; i++) {
            if(id == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;

    }
    //删除房屋信息
    public boolean delHouse(int id) {
        System.out.print("确认是否删除（Y/N）：请小心选择");
        char key = Utility.readChar();
        if(key=='N'){
            return false;
        }
        int index = -1;//记录要删除房屋的下标
        //遍历所有已经存在的房屋
        for (int i = 0; i < houseNum; i++) {
            if(id == houses[i].getId()) {//判断传进来的id是否等于数组中一个房屋的id
                index = i;//把数组的下标给index
            }
        }
        //判断是否找到有这个房子，没找到直接放回false
        if(index == -1){
            return false;
        }
        //删除操作
        //把下标后面的元素向前移动
        for (int i = index; i <houseNum-1 ; i++) {
            houses[i+1].setId(count-1);//将要移动的元素id更新后再进行向前移动
            houses[i] = houses[i+1];

        }
        //把最后的一个元素的位置置空,并且房屋数量每次删除完都减1
        houses[--houseNum] = null;
        return true;
    }
}
