package com.itheima.test3;

public class Test {
    public static void main(String[] args) {
        /*题目
自行车Bicycle：
属性：品牌，行驶速度
行为：移动move，响铃ringBell()
汽车Car：
属性：品牌，行驶速度
行为：移动move，鸣笛honk()
人Person：
属性：名字，年龄，性别
行为：行驶交通工具（能使用所有交通工具）
在测试类中创建Person的对象，让这个人使用任意一款交通工具。*/

        Person p = new Person("张三", 18, "男");
        System.out.println(p.getName()+p.getAge()+p.getGender());

        //创建自行车的对象
        Bicycle b = new Bicycle("永久", 20);
        p.drive(b);

        //创建汽车的对象
        Car c = new Car("宝马", 100);
        p.drive(c);

    }
}
