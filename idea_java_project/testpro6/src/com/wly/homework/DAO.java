package com.wly.homework;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author 王露夷
 * @version 1.0
 */
public class DAO<T>{
    private Map<String,T> map = new HashMap<>();

    public DAO(Map<String, T> map) {
        this.map = map;
    }

    //保存T类型的对象到map中
    public void save(String id,T entity){
        map.put(id,entity);
    }
    //从map中获取id对应的对象
    public T get(String id){
        return map.get(id);
    }

    //替换map中的key为id的内容，改为entity对象
    public void update(String id,T entity){
        map.put(id,entity);
    }
    //返回map中存放的所有T对象
    public List<T> list(){
        Set<String> strings = map.keySet();
        ArrayList<T> ts1 = new ArrayList<>();
        for (Object o :strings) {
            ts1.add(map.get(o));
        }
        return ts1;
    }
    //删除指定的id对象
    public void delete(String id){
        map.remove(id);
    }
}
