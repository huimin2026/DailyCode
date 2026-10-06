package com.itheima.ooptest4;

public class Test {
    public static void main(String[] args) {
       //创建老师的对象
        Teacher t= new Teacher();

        //赋值
        t.age = 30;
        t.name = "张老师";

        //获取老师的信息
        System.out.println("老师的名字是：" + t.name + ",年龄是：" + t.age);

        //相当于让老师去干活
        t.eat();
        t.sleep();
        t.teach();
    }
}
