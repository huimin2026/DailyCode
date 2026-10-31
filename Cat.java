package com.itheima.test5;

public class Cat extends Animal {
    //构造方法
    public Cat() {
    }
    public Cat(String color, int age){
        super(age,color);
    }

    //重写eat方法
    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "的猫吃" + something);
    }

    //猫猫独有方法：逮老鼠
    public void catchMouse(){
        System.out.println("小猫逮老鼠！喵喵喵");
    }
}
