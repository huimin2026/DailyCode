package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo6 {
    public static void main(String[] args) {
        //1.定义一个变量记录价格
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入订单价格：");
        double price = sc.nextDouble();

        //2.计算两个app优惠之后的价格
        double price1 = price * 0.9;//饱了么

        double price2 = 0;
        if (price >= 30) {
            price2 = price - 10;
        } else {
            //原价
            price2 = price;
        }
        //3.判断
        if (price1 < price2) {
            System.out.println("在美单App下单更划算");
        } else {
            System.out.println("在饱了么App下单更划算");
        }
    }
}
