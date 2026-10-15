package com.itheima.oopextendstest1;

public class Teacher extends Person{
    //子类特有的内容
    //属性：学科
    String subject;

    //行为：教书
    public void teach(){
        System.out.println("老师正在教书");
    }
}
