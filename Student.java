package com.itheima.test4;

public class Student {
    //属性：姓名、年龄
    private String name;
    private int age;

    //构造方法：给姓名和年龄赋值
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //多态重点：参数是父类Shape
    //传Rectangle、Circle子类对象都可以进来
    public void useShape(Shape s){
        System.out.println("学生：" + name);
        //判断传进来的是长方形还是圆形
        if(s instanceof Rectangle){
            Rectangle r = (Rectangle)s;
            System.out.println("使用的是长方形，周长：" + r.getPerimeter() + "，面积：" + r.getArea());
        }else if(s instanceof Circle){
            Circle c = (Circle) s;
            System.out.println("使用的是圆形，周长：" + c.getPerimeter() + "，面积：" + c.getArea());
        }

        //多态：编译看父类Shape，运行看真实子类，自动调用重写后的方法
        System.out.println("周长：" + s.getPerimeter() + "，面积：" + s.getArea());
    }

}
