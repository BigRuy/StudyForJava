package com.wly.houserental.domain;

/**
 * 1.一个House对象就表示一个房屋信息
 */
public class House {

    private int id;//编号
    private String name;//房主姓名
    private String phone;//手机号
    private String address;//房屋地址
    private int rent;//租金
    private String state;//房屋状态

    public House(int id, String name, String phone, String address, int rent, String state) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return id +
                "\t" + name +
                "\t\t" + phone +
                "\t\t" + address +
                "\t" + rent +
                "\t" + state;
    }
}
