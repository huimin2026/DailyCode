package com.itheima.oopextendstest13;

public class SameCityExpress extends Express{
    @Override
    public int calculateMoney() {
        return  super.calculateMoney() + 10;
    }
}
