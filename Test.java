package com.itheima.ooptest11;

public class Test {
    public static void main(String[] args) {
        //定义一个Javabean类描述学生
        //属性：姓名 年龄 性别 身高

        //创建对象
        Student s = new Student();
        Student ss = new Student("zhangsan", 18, "male", 175);

        //使用get获取打印属性
        System.out.println(ss.getName());
        System.out.println(ss.getAge());
        System.out.println(ss.getGender());
        System.out.println(ss.getHeight());
    }
}
