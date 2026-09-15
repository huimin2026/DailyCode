package com.itheima.ifdemo;

public class IfDemo8 {
    public static void main(String[] args) {
        /*需求：很多App都有不同的优惠券
假设，现在有以下优惠券
全场商品满10减8
全场商品满50减30
全场商品满100减50
全场商品满200减90

会员卡：全场8折
请问：会员卡和优惠券不能同时使用，最优惠的价格是多少？
     */
// 1. 定义变量记录商品的价格
        double price = 1000;
        // 2. 定义变量记录使用优惠券之后，可以少付的钱
        double discountPrice = 0;

        // 3. 计算使用优惠券之后，可以少付的钱
        if (price > 0) {
            if (price < 10) discountPrice = 0;
            else if (price < 50) discountPrice = 8;
            else if (price < 100) discountPrice = 30;
            else if (price < 200) discountPrice = 50;
            else discountPrice = 90;
        } else {
            System.out.println("商品价格有误");
        }
        // System.out.println("使用优惠券之后，可以少付的钱：" + discountPrice);

        // 4. 定义变量记录使用会员卡之后，可以少付的钱
        double memberPrice = price * 0.2;

        // 5. 判断
        if(discountPrice > memberPrice){
            System.out.println("使用优惠券的价格更低：" + (price - discountPrice));
        }else{
            System.out.println("使用会员卡的价格更低：" + (price - memberPrice));
        }
    }
}


