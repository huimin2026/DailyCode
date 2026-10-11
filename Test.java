package com.itheima.staticvariabletest1;

public class Test {
    public static void main(String[] args) {
        /*题目

学生有属性：姓名，年龄，老师。
同一个班级，所有学生共享同一个老师。

• 第一名学生：小诗诗，19岁

• 第二名学生：小丹丹，20岁

一开始上课老师是小雯老师；某天小丹丹申请更换老师，换成阿玮老师。
请使用 static 静态变量模拟该效果。

要求：

1. 静态变量，本类全部对象共享；只赋值一次，一个对象修改静态变量，其余对象读取都是修改后的值。

2. 掌握静态变量两种访问方式：类名调用（推荐）、对象名调用。*/

        //最初都是小雯老师上课
        //student这个类所以对象的teacherName都是小雯老师
        Student.teacherName = "小雯";

        //创建第一个学生对象
        Student stu1 = new Student();
        stu1.name = "小诗诗";
        stu1.age = 19;

        //创建第二个学生对象
        Student stu2 = new Student();
        stu2.name = "小丹丹";
        stu2.age = 20;
        stu2.teacherName = "阿玮老师";

        //输出两个学生的信息
        System.out.println("第一个学生："+stu1.name+" "+stu1.age+" "+Student.teacherName);
        System.out.println("第二个学生："+stu2.name+" "+stu2.age+" "+Student.teacherName);
    }
}
