package com.itheima.test4;

public class Test {
    public static void main(String[] args) {
        /*
题目要求：
• 定义“长方形类”
◦ 属性：宽、高
◦ 行为：计算周长、计算面积
• 定义“圆形类”
◦ 属性：圆周率、半径
◦ 行为：计算周长、计算面积
• 定义“学生类”
◦ 属性：姓名、年龄
◦ 行为：使用图形类的方法，打印图形信息，并打印周长和面积*/

        //创建学生对象
        Student stu = new Student("张三", 18);

        //多态写法：父类引用 指向 子类对象
        Shape rect = new Rectangle(10, 20);
        Shape circle = new Circle(5);

        //同一个useShape方法，传不同图形
        stu.useShape(rect);
        stu.useShape(circle);
    }
}
