package com.itheima.test1;

public abstract class Animal {
    String name;
    String color;

    public Animal(){

    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public abstract void eat();
}
