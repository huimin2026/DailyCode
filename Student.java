package com.itheima.ooptest8;

public class Student {
    private String name;
    private int age;
    private int height;
    private int weight;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
    public void setHeight(int h){
        height = h;
    }
    public int getHeight(){
        return height;
    }
    public void setWeight(int w){
        weight = w;
    }
    public int getWeight(){
        return weight;
    }

    //学习方法
    public void study(){
        System.out.println("努力学习");
    }
}
