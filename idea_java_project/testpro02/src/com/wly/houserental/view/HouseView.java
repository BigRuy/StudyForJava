package com.wly.houserental.view;

import com.wly.houserental.domain.House;
import com.wly.houserental.srevce.HouseSerevce;
import com.wly.houserental.utils.Utility;

/**
 * 1.显示界面
 * 2.接收用户的输入
 * 3.调用HouseSerevce完成对房屋信息的各种操作
 */
public class HouseView {

    private boolean loop = true;//控制显示菜单
    private int  key;//接收用户选择
    private HouseSerevce houseSerevce = new HouseSerevce(2);

    //显示系统主菜单
    public void mainMenu() {
        do{
            System.out.println("--------------房屋出租系统--------- -----");
            System.out.println("\t\t1.新 增 房 源");
            System.out.println("\t\t2.查 找 房 屋");
            System.out.println("\t\t3.删 除 房 屋");
            System.out.println("\t\t4.修 改 房 屋 信 息");
            System.out.println("\t\t5.房 屋 列 表");
            System.out.println("\t\t6.退    出");
            System.out.print("请输入你的选择（1-6）");
            key = Utility.readInt();
            switch (key){
                case 1:
                    showAddHouse();
                    break;
                case 2:
                    findHouse();
                    break;
                case 3:
                    delHouse();
                    break;
                case 4:
                    System.out.println("");
                    break;
                case 5:
                    showHouse();
                    break;
                case 6:
                    loop = false;
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        }while (loop);
    }
    //显示房屋列表信息
    public void showHouse() {
        System.out.println("-------房屋列表信息--------");
        House[] houses = houseSerevce.list();//调用方法接收返回的数组
        for (int i = 0; i <houses.length ; i++) {
            if(houses[i] == null){//数组里元素为空就不输出
                break;
            }
            System.out.println(houses[i]);//输出对象默认调用toString方法
        }
    }
    //新增房源
    public void showAddHouse() {
        System.out.print("房主姓名：");
        String name = Utility.readString(4);
        System.out.print("房主手机号：");
        String phone = Utility.readString(11);
        System.out.print("房屋地址：");
        String adress = Utility.readString(16);
        System.out.print("租金：");
        int rent = Utility.readInt();
        System.out.print("房屋状态：");
        String state = Utility.readString(3);
        House house = new House(0, name, phone, adress, rent, state);
        //调用添加房屋的方法，将新创建的房屋对象传给这个方法，如果返回true则表示添加成功
        if(houseSerevce.addHouse(house)){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
    }
    //查找房屋
    public void findHouse() {
        System.out.print("请输入要查找的房屋的id：");
        int findId = Utility.readInt();
        if (houseSerevce.findByIdHouse(findId) == null) {
            System.out.println("很抱歉，房屋不存在");
        }else {
            System.out.println(houseSerevce.findByIdHouse(findId));
        }
    }
    //删除房屋
    public void delHouse() {
        System.out.println("---------删除房屋--------");
        System.out.print("请选择要删除房屋的编号（-1退出）：");
        int key = Utility.readInt();
        if(key==-1) {
            System.out.println("你放弃修改房屋");
            return;
        }
        if(houseSerevce.delHouse(key)) {
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }
    //修改房屋信息
    public void UpdateHouse() {
        System.out.println("请输入要修改房屋的id(-1退出)：");
        int id = Utility.readInt();
        if(id == -1) {
            System.out.println("你放弃了修改");
             return;
        }
        //调用根据ID查找房屋的方法
        House byIdHouse = houseSerevce.findByIdHouse(id);
        if(byIdHouse==null) {//判断该方法是否返回为空，如果为空则不能修改
            System.out.println("要修改的房屋信息不存在，无法修改");
            return;
        }
        System.out.println("姓名("+byIdHouse.getName()+"):");
        String newName = Utility.readString(3,"");
        if(!"".equals(newName)) {
            byIdHouse.setName(newName);
        }
        System.out.println("手机号("+byIdHouse.getPhone()+"):");
        String newPhone = Utility.readString(10,"");
        if(!"".equals(newPhone)){
            byIdHouse.setPhone(newPhone);
        }
        System.out.println("地址("+byIdHouse.getAddress()+"):");
        String newAddress = Utility.readString(16,"");
        if(!"".equals(newAddress)){
            byIdHouse.setAddress(newAddress);
        }
        System.out.println("租金("+byIdHouse.getRent()+"):");
        int newRent = Utility.readInt(-1);
        if(newRent!=-1){
            byIdHouse.setRent(newRent);
        }
        System.out.println("出租状态("+byIdHouse.getState()+"):");
        String newState = Utility.readString(3,"");
        if (!"".equals(newState)){
            byIdHouse.setState(newState);
        }
    }

}
