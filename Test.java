package com.itheima.test7;

public class Test {
    public static void main(String[] args) {
        /*题目
定义抽象类 Animal：
• 成员属性：名字、颜色
• 成员方法：抽象方法 eat()，普通喝水方法 drink()
定义猫类 Cat，继承 Animal：
• 重写 eat() 方法：猫吃鱼
• 新增独有方法：抓老鼠
定义狗类 Dog，继承 Animal：
• 重写 eat() 方法：狗吃骨头
• 新增独有方法：看家
编写测试类，创建对象调用方法测试。*/

        //创建猫类对象
        Cat c = new Cat("小花", "白色");
        System.out.println((c.getColor() + "," + c.getName()));
        c.catchMouse();
        c.eat();
        c.drink();

        //创建狗类对象
        Dog g = new Dog("小黑", "黑色");
        System.out.println((g.getColor() + "," + g.getName()));
        g.watchHome();
        g.eat();
        g.drink();
    }
}
