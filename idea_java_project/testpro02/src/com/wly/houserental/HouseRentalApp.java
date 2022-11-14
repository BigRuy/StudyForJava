package com.wly.houserental;

import com.wly.houserental.view.HouseView;

/**
 * 房屋出租系统程序的主入口
 * 调用HouseView类
 */
public class HouseRentalApp {
    public static void main(String[] args) {
        new HouseView().mainMenu();
    }
}
