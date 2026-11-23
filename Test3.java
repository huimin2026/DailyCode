package com.itheima.a04test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*需求：
做一个水果货架程序
1. 定义水果类 Fruit，属性：水果编号、水果名字、价格
2. 用 ArrayList 存水果对象
3. 实现4个功能：
① 打印货架上所有水果
② 根据编号找水果，找到返回下标，找不到返回-1
③ 根据编号删除这个水果
④ 根据编号修改水果价格
*/

        //1.创建集合，用来放水果
        ArrayList<Fruit> fruitList = new ArrayList<>();
        //添加水果
        fruitList.add(new Fruit("001", "苹果", 10.0));
        fruitList.add(new Fruit("002", "香蕉", 5.0));
        fruitList.add(new Fruit("003", "橘子", 8.0));

        Scanner sc = new Scanner(System.in);

        //打印全部水果
        System.out.println("货架上所有水果：");
        printFruit(fruitList);

        //查找水果
        System.out.println("请输入要查找的水果编号：");
        String findId = sc.next();
        int index = findFruitById(fruitList, findId);
        if (index != -1) {
            System.out.println("找到水果：" + fruitList.get(index));
        } else {
            System.out.println("没有找到该编号的水果");
        }

        //删除水果
        System.out.println("请输入要删除的水果编号：");
        String delId = sc.next();
        int delIndex = findFruitById(fruitList, delId);
        if (delIndex != -1) {
            fruitList.remove(delIndex);
            System.out.println("删除成功");
        } else {
            System.out.println("没有找到该编号的水果，删除失败");
        }

        //修改水果价格
        System.out.println("请输入要修改的水果编号：");
        String updateId = sc.next();
        int updateIndex = findFruitById(fruitList, updateId);
        if (updateIndex != -1) {
            System.out.println("请输入新的价格：");
            double newPrice = sc.nextDouble();
            fruitList.get(updateIndex).setPrice(newPrice);
            System.out.println("修改成功");
        } else {
            System.out.println("没有找到该编号的水果，修改失败");
        }
        System.out.println("修改后的水果列表：");
        printFruit(fruitList);
    }
    //打印所有水果
    public static void printFruit(ArrayList<Fruit> fruitList) {
        for (int i = 0; i < fruitList.size(); i++) {
            System.out.println(fruitList.get(i));
        }
    }
    //根据编号找水果
    public static int findFruitById(ArrayList<Fruit> fruitList, String id) {
        for (int i = 0; i < fruitList.size(); i++) {
            if (fruitList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}