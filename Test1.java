package com.itheima.a04test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        /*需求：定义一个集合，添加数字，并进行遍历
          遍历格式参照：[元素1,元素2,元素3]*/

        //1.创建一个集合
        ArrayList<Integer> list = new ArrayList<>();
        //2.添加数据
        list.add(1);
        list.add(2);
        list.add(3);

        //3.进行遍历
        System.out.println("[");
        for(int i = 0;i<list.size();i++){
            //i:索引
            //list.get(i):元素/数据
            Integer num = list.get(i);
            if(i == list.size() - 1){
                System.out.println(num+"]");
            }else{
                System.out.println(num+",");
            }
        }
    }
}
