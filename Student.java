package com.itheima.ooptest11;

public class Student {
    //属性：姓名 年龄 性别 身高
    private String name;
    private int age;
    private String gender;
    private int height;

    //构造方法
    //习惯：空参
    public Student(){

    }

    //带全部参数的构造方法
    public Student(String name,int age,String gender,int height){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    //get set方法
    public String getName(){
        return  name;
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

    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }
}
