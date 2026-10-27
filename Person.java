package com.itheima.aaa;

public class Person {
    //4种权限修饰符的成员变量
    private String name; //private 本类才能访问
    int age; //默认（缺省）同包才能访问
    protected String hobby; //protected 同包 + 不同包子类
    public String id; //public 所有类都能访问

    //4种权限修饰符的成员方法
    private void show1(){
        System.out.println("private方法show1");
    }
    void show2(){
        System.out.println("默认方法show2");
    }
    protected void show3(){
        System.out.println("protected方法show3");
    }
    public void show4(){
        System.out.println("public方法show4");
    }
}
