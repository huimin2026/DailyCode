package com.itheima.bbb;

import com.itheima.aaa.Person;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        //System.out.println(p.name);
        //System.out.println(p.age);
        //System.out.println(p.hobby);
        System.out.println(p.id);

        //p.show1(); //private
        //p.show2(); //默认
        // p.show3(); //protected
        p.show4(); //public

        Student s = new Student();
        s.test(); // 子类内部可访问 protected 的 hobby/show3
    }
}
