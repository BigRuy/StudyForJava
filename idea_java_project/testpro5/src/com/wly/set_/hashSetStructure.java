package com.wly.set_;

import java.util.HashSet;

/**
 * @author 王露夷
 * @version 1.0
 */
public class hashSetStructure {
    public static void main(String[] args) {
        //模拟一个hashset的底层结构，hashset底层就是hashMap的底层
        //创建一个数组,数组类型为Node
        Node[] table = new Node[16];

        //创建一个节点
        Node john = new Node("john", null);
        table[2] = john;
        HashSet hashSet = new HashSet();
        hashSet.add("john");

    }
}
class Node{//节点，存储数据，并且可以指向下一个节点
    Object name;//存放数据
    Node next;//指向下一个节点

    public Node(Object name, Node next) {
        this.name = name;
        this.next = next;
    }
}
