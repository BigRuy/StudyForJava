package com.wly.List_;

/**
 * @author 王露夷
 * @version 1.0
 */
public class linkedList_ {
    public static void main(String[] args) {
        //模拟一个简单的双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node rose = new Node("rose");
        //连接三个节点，形成链表
        //jack->tom->rose
        jack.next = tom;
        tom.next = rose;
        //rose->tom->jack
        rose.prev = tom;
        tom.prev = jack;
        //定义一个头节点
        Node first = jack;//让头节点指向jack，表示双向链表的头节点
        Node last = rose;//让尾节点指向rose，表示双向链表的尾节点

        //双向链表添加一个节点
        //要求在指定位置进行插入
        Node bob = new Node("Bob");
        bob.insertNode(bob,tom,rose);

        //从头到尾进行遍历
        while(true){
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        //从尾到头进行遍历
        while(true){
            if(last == null){
                break;
            }
            System.out.println(last);
            last = last.prev;
        }
    }
}


//定义一个类Node，用于表示双向链表的一个结点
class Node{
    public Object item;//真正存放数据
    public Node next;//指向后一个节点
    public Node prev;//指向前一个节点
    public Node(Object name){
        this.item = name;
    }
    /**
     * @param n 表示要添加的新的节点对象
     * @param before 表示需要添加在链表的位置的前一个元素
     * @param behind 表示需要添加在链表的位置的后一个元素
     */
    public void insertNode(Node n,Node before,Node behind){
        n.next = behind;
        n.prev = before;
        before.next = n;
        behind.prev = n;
    }

    @Override
    public String toString() {
        return "Node name = "+item;
    }
}
