package com.itheima.test2;

public class Test {
    public static void main(String[] args) {
        /*1. 定义接口 Animal
• 抽象方法：void run();
• JDK8 默认方法 default void drink()：输出「动物喝水」，内部调用接口私有实例方法
• JDK8 静态方法 static void showTip()：输出「动物是生物」，内部调用接口私有静态方法
• JDK9 私有实例方法 private void prepare()：输出「找到水源」，给 drink() 复用
• JDK9 私有静态方法 private static void baseMsg()：输出「生命活动」，给 showTip() 复用
2. 定义第二个接口 Pet
• 默认方法 default void drink()：输出「宠物喝温水」
3. 定义类 Dog，同时实现 Animal、Pet
4. 测试类 TestDemo
• 创建Dog对象，调用run()、drink()
• 用接口名调用静态方法 showTip()*/

        Dog dog = new Dog();
        dog.drink();
        dog.run();
        Animal.showTip();
    }
}
