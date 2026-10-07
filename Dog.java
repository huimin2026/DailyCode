package com.itheima.ooptest7;

public class Dog {
    //姓名、年龄
    private String name;
    private int age;

    //get/set

    //name
    //value:表示将来要赋的值 小白
    public void setName(String value){
        //给对象中的属性进行赋值
        name = value;
    }

    public String getName(){
        return name;
    }

    //age
    //num:表示将来要赋的值 2
    public void setAge(int num){
        //给对象中的属性进行赋值
        if(num >=0 && num <= 15){
            age = num;
        }else{
            System.out.println("年龄设置不合法");
        }
    }

    public int getAge(){
        return age;
    }

    //行为：吃骨头
    public void eat(){
        System.out.println(age + "岁的" + name + "，正在吃骨头");
    }
}
