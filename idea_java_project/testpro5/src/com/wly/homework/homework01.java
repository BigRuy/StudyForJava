package com.wly.homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 王露夷
 * @version 1.0
 */
public class homework01 {
    public static void main(String[] args) {
        //实例化对象
        News news1 = new News("新冠确诊病例超千万，数百万印度教信徒奔赴恒河洗澡引民担忧");
        News news2 = new News("男子突然想起两个月前钓的鱼还在网兜里，捞起一看赶紧放生");

        //将对象加入到集合中
        ArrayList arrayList = new ArrayList();
        arrayList.add(news1);
        arrayList.add(news2);

        //进行倒序遍历
        for (int i = arrayList.size()-1; i >= 0 ; i--) {
            //将对象进行向下转型
            News news = (News) arrayList.get(i);
            if(news.getTags().length()>15){//如果标题的长度大于15
                String substring = news.getTags().substring(0, 15);//截取字符串的长度
                System.out.println(substring+"...");
            }

        }


    }
}

class News{
    private String tags;
    private String content;

    public News(String tags) {
        this.tags = tags;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "tags='" + tags + '\'' +
                '}';
    }
}
