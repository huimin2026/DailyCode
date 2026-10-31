package com.itheima.test5;

public class Dog extends Animal {

    //构造方法
    public Dog() {
    }
    public Dog(String color, int age){
        super(age,color);
    }

    //重写eat方法
    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "的狗吃" + something);
    }

    //狗狗独有方法：看家
    public void lookHome(){
        System.out.println("小狗看家！汪汪汪");
    }
}
