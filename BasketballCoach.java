package com.itheima.a05interfacedemo5;

public class BasketballCoach extends Coach implements English {
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }
    @Override
    public void teach() {
        System.out.println("教练正在教篮球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("教练正在说英语");

    }
}
