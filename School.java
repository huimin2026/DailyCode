package com.itheima.a01innerclassdemo3;

public class School {
    //静态内部类：static修饰，属于外部类本身，不属于外部类对象
    public static class Studet{
        //静态内部类中的成员方法
        public void show(){
            System.out.println("我是静态内部类的学生");
        }
    }
}
