package com.itheima.a01innerclassdemo2;

public class Test {
    public static void main(String[] args) {
        /*需求：
1. 写外部类 House（房子），私有成员变量：address 地址，构造方法给地址赋值；外部类一个普通方法 showHouse()，打印房子地址
2. 成员内部类 Room（房间），内部类私有变量：roomName 房间名字，构造方法给房间名字赋值
3. 内部类写方法 showInfo()：同时打印【房子地址 + 房间名称】（内部类直接访问外部类私有address）
4. 测试类 Test，创建房子和房间对象，调用showInfo()*/

        //创建成员内部类对象固定格式：外部类.内部类 对象 = new 外部类（）.new 内部类（）；
        House.Room room = new House("北京").new Room("卧室");

        //调用内部类的方法
        room.showInfo();
    }
}
