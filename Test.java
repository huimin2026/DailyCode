package com.itheima.oopextendstest1;

public class Test {
    public static void main(String[] args) {
        /*
        学生：
            属性：姓名，年龄，年级
            行为：吃饭，学习
        老师：
            属性：姓名，年龄，科目
            行为：吃饭，讲课*/

        //创建对象
        Student s = new Student();
        s.name = "小诗诗";
        s.age = 18;
        s.grade = "大一";

        System.out.println(s.name + " " + s.age + " " + s.grade);

        s.eat();
        s.studt();

        System.out.println("------------");

        //创建老师对象
        Teacher t = new Teacher();
        t.name = "张老师";
        t.age = 30;
        t.subject = "数学";

        System.out.println(t.name + " " + t.age + " " + t.subject);

        t.eat();
        t.teach();
    }
}
