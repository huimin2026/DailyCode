package com.itheima.test5;

public class Animal {

    //共同属性：年龄、颜色
    private int age;
    private String color;

    //无参构造
    public Animal() {
    }
    //有参构造
    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }
    //获取年龄
    public int getAge() {
        return age;
    }
    //设置年龄
    public void setAge(int age) {
        this.age = age;
    }
    //获取颜色
    public String getColor() {
        return color;
    }
    //设置颜色
    public void setColor(String color) {
        this.color = color;
    }

    //共同的eat方法，父类占位
    public void eat(String something) {
    }
}
