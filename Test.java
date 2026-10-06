package com.itheima.ooptest1;

public class Test {
    public static void main(String[] args) {
        //创建对象：记录第一只小狗的信息
        //格式：
        //     类名  对象名 = new 类名（）；

        //创建了一个对象，管理第一只小狗信息
        Dog d1 = new Dog();

        //赋值
        d1.name = "小白";
        d1.age = 2;
        d1.weight = 3.5;
        d1.color = "白色";

        //获取第一只小狗的信息
        System.out.println("第一只小狗的名字是：" + d1.name + ",年龄是：" + d1.age + ",体重是：" + d1.weight + ",颜色是：" + d1.color);

        //创建第二个对象，管理第二只小狗的信息
        Dog d2 = new Dog();
        d2.name = "小黑";
        d2.age = 1;
        d2.weight = 2.5;
        d2.color = "黑色";

        //获取第二只小狗的信息
        System.out.println("第二只小狗的名字是：" + d2.name + ",年龄是：" + d2.age + ",体重是：" + d2.weight + ",颜色是：" + d2.color);
    }
}
