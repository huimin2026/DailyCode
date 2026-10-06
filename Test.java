package com.itheima.ooptest5;

public class Test {
    public static void main(String[] args) {
        Cook c = new Cook();
       c.age = 25;
       c.cookLeve1 = "一级";
       c.name = "张三";

       //获取厨师的属性值并打印在控制台
        System.out.println("厨师的名字是：" + c.name + ",年龄是：" + c.age + ",烹饪水平是：" + c.cookLeve1);

        //让厨师对象去烹饪
        c.cooking();
    }
}
