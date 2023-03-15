package com.wly.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 王露夷
 * @version 1.0
 */
public class test {
    public static void main(String[] args) {
        Map<String, User> stringUserMap = new HashMap<>();
        DAO<User> userDAO = new DAO<>(stringUserMap);
        userDAO.save("1",new User(1,20,"jack"));
        List<User> list = userDAO.list();
        System.out.println(list);
    }
}
