package com.itheima.ooptest6;

public class Test {
    public static void main(String[] args) {
        Worker w = new Worker();
        w.age = 25;
        w.name = "张三";
        w.workAge = "5年";

        System.out.println("员工的名字是：" + w.name + ",年龄是：" + w.age + ",工作年限是：" + w.workAge);

        w.work();
    }
}
