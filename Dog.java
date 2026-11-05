package com.itheima.test2;

public class Dog implements Animal, Pet {
    @Override
    public void run() {
        System.out.println("小狗撒欢跑");
    }

    @Override
    public void drink() {
        //二选一开启注释
        Animal.super.drink();
        //Pet.super.drink();
    }
}
