package com.itheima.test1;

public class StudentManger {

    //定义一个方法表示注册用户
    //参数Person:此时可以传递Person本身的对象

    public void register(Person person){
        //姓名为张三的同学注册成功，账号zhangsan，密码123456
        System.out.println("姓名为"+person.getName()+"的账户注册成功，账号"+person.getUsername()+"，密码"+person.getPassword());

        //传递不同的对象，调用不同类里面的work方法
        person.work();
    }
}
