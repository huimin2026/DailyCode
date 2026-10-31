package com.itheima.test4;

public class Circle extends Shape{
    //圆周率常量，固定不变
    private final double PI = 3.14159;
    private double radius;//半径

    //构造方法：给半径赋值
    public Circle(double radius) {
        this.radius = radius;
    }

    //重写周长方法
    @Override
    public double getPerimeter(){
        return 2*PI*radius;
    }
    //重写面积方法
    @Override
    public double getArea(){
        return PI*radius*radius;
    }

    //获取半径
    public double getRadius(){
        return radius;
    }
}
