package com.itheima.ooptest3;

public class Test {
    public static void main(String[] args) {
        //创建手机对象
        Phone p = new Phone();
        //给属性赋值
        p.brand = "华为";
        p.color = "黑色";
        p.price = 3999.99;
        //输出属性的值
        System.out.println("手机的品牌是：" + p.brand + ",颜色是：" + p.color + ",价格是：" + p.price);
    }
}
