package com.itheima.test2;

public class Cat extends Animal{
    //子类同名成员变量
    String name = "小猫";

    //重写父类的show方法
    @Override
    public void show(){
        System.out.println("小猫的方法");
    }
}
