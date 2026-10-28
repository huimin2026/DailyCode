package com.itheima.test1;

public class Test {
    public static void main(String[] args) {
        /*题目
编写程序，包含三类角色：学生、老师、管理员
共性属性：姓名、账号、密码
各自行为 work：
• 学生 work：工作是学习
• 老师 work：工作是教书
• 管理员 work：工作是管理网站
学生管理系统，提供 register（注册）方法，可以注册所有角色。
注册成功输出示例：
姓名为张三的同学注册成功，账号zhangsan，密码123456
提示：适合用父类 + 继承实现。*/

        //创建一个学生的对象
        Student stu = new Student("张三","zhangsan","123456");

        //创建学生管理系统的对象
        StudentManger sm = new StudentManger();
        //把stu注册到学生管理系统当中
        sm.register(stu);

        //创建一个老师的对象
        Teacher t = new Teacher("张三","zhangsan","123456");
        //把t注册到学生管理系统当中
        sm.register(t);
    }
}
