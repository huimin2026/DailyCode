package com.itheima.ooptest7;

public class Test {
    public static void main(String[] args) {
        /*小狗有属性：姓名、年龄。
        行为：吃骨头
        实现以下需求
        要求1：小狗的年龄：0~15岁
        要求2：打印小狗的所有信息：小白，2岁
        要求3：调用吃骨头的方法打印效果：2岁的小白，正在吃骨头
        */

        Dog d = new Dog();
        d.setName("小白");
        d.setAge(2);
        System.out.println(d.getName() + "，" + d.getAge() + "岁");
        d.eat();
    }
}
