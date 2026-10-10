package com.itheima.ooptest12;

public class Student {
    private String name;
    private int age;

    //alt+(Fn)+insert
    public Student(){

    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    //set/get
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    //行为：学习 吃饭 睡觉
    public void study(){
        System.out.println("学习");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void eat(){
        System.out.println("吃饭");
    }
}
