package com.itheima.ooptest9;

public class Student {
    private int age;

    public void setAge(){
        //int age = 10;
        //触发就近原则
        System.out.println(age);

        //使用了上面成员变量age
        System.out.println(this.age);
    }
}
