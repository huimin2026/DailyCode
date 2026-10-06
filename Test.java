package com.itheima.ooptest2;

public class Test {
    public static void main(String[] args) {
        //创建对象记录第一个学生的信息
        Student s1 = new Student();
        s1.name = "张三";
        s1.gender = '男';
        s1.age = 18;
        s1.height = 175.5;

        //获取学生的信息
        System.out.println("学生的信息是：" + s1.name + "," + s1.gender + "," + s1.age + "," + s1.height);

        //创建对象记录第二个学生的信息
        Student s2 = new Student();
        s2.name = "李四";
        s2.gender = '女';
        s2.age = 19;
        s2.height = 165.5;

        //获取学生的信息
        System.out.println("学生的信息是：" + s2.name + "," + s2.gender + "," + s2.age + "," + s2.height);
    }
}
