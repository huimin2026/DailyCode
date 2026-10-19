package com.itheima.oopextendstest6;

public class Teacher extends Person{
    String subject;

    //空参构造
    public Teacher() {
        System.out.println("Teacher的空参构造执行了~");
    }

    //带参构造
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
        System.out.println("Teacher的带参构造执行了~");
    }
}
