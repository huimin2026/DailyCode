package com.itheima.oopextendstest6;

public class Test {
    public static void main(String[] args) {
        /*根据下面的描述定义继承结果
        * 学生：
               属性：姓名，年龄，年级
          老师：
               属性：姓名，年龄，科目*/

        //创建对象
        Student stu = new Student("张三", 18, "三年级");
        System.out.println(stu.name + " " + stu.age + " " + stu.grade);
        Teacher tea = new Teacher("李四", 30, "数学");
        System.out.println(tea.name + " " + tea.age + " " + tea.subject);
    }
}
