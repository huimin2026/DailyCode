package com.itheima.oopextendstest5;

public class Phone extends SmartDevice {
    @Override
    public double payment(){
        //调用父类里面的payment方法先计算出商品的价格
        double payment = super.payment();
        payment = payment*0.9;
        return payment;
    }
}
