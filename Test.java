package com.itheima.ooptest12;

public class Test {
    public static void main(String[] args) {
        /*
       定义一个Javabean类描述学生
       属性：姓名 年龄
       行为：学习、睡觉、吃饭
       */

        //创建对象
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(18);
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        stu1.study();
        stu1.sleep();
        stu1.eat();

        Student stu2 = new Student("李四", 19);
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());
        stu2.study();
        stu2.sleep();
        stu2.eat();
    }
}
