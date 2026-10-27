package com.itheima.bbb;

import com.itheima.aaa.Person;

public class Student extends Person{
    public void test(){
        //System.out.println(name);
        //System.out.println(age);
        System.out.println(hobby);
        System.out.println(id);

        //show1();//private
        //show2();//默认权限
        show3(); //protected
        show4(); //public
    }
}
