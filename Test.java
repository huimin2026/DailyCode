package com.itheima.oopextendstest2;

public class Test {
    public static void main(String[] args) {
       /*现在有三个电子设备，请设计他们的继承结构
1. 安卓手机
属性：品牌，价格
行为：打电话，发短信，nfc功能
2. 苹果手机
属性：品牌，价格
行为：打电话，发短信
3. 笔记本电脑
属性：品牌，价格
行为：编程*/

        //创建安卓手机的对象
        Android a = new Android();
        a.brand = "华为";
        a.price = 5000;
        System.out.println(a.brand+","+a.price);
        a.NFC();
        a.call();
        a.sendMessage();

        //创建苹果手机的对象
        IOS i = new IOS();
        i.brand = "苹果";
        i.price = 6000;
        System.out.println(i.brand+","+i.price);
        i.call();
        i.sendMessage();

        //创建笔记本电脑的对象
        Laptop l = new Laptop();
        l.brand = "戴尔";
        l.price = 8000;
        System.out.println(l.brand+","+l.price);
        l.coding();
    }
}
