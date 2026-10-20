package com.itheima.oopextendstest8;

public class Student extends Person{
    private String grade;

    //空参构造
    public Student(){

    }

    //带全部参数构造方法（父 + 子）
    public Student(String name,int age,String grade){
        super(name,age);
        this.grade = grade;
    }

    //get/set
    public String getGrade(){
        return grade;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }

    //行为
    public void study(){
        System.out.println("学习");
    }
}
