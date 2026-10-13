package com.itheima.finalTest;

public class CircleTest {
    public static void main(String[] args) {
        /*
        定义一个Javabean描述圆
        属性：半径和圆周率
        行为：计算圆的面积和周长*/

        //创建一个圆的对象
        Circle c = new Circle(1.5);

        //获取圆里面的属性
        System.out.println(c.getRadii());
        System.out.println(c.getPI());

        //计算圆的面积和周长
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
    }
}
