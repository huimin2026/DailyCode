package com.itheima.oopextendstest13;

public class AirExpress extends Express{
    @Override
    public int calculateMoney() {
        return super.calculateMoney() + 15;
    }
}
