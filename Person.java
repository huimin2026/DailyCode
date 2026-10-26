package com.itheima.oopextendstest14;

public class Person {
    //private私有成员：子类【不能直接继承访问】，但是子类对象内存里存在这个数据的
    private String id;
    //public公开成员：子类可以继承、任意地方直接访问
    public String name;
    //static静态成员：属于类，子类可以访问，不算严格意义上的继承
    public static String ation = "中国";

    //父类构造方法：【不会被子类继承】，子类必须用super调用
    public void secret(){

        System.out.println("这是私有密码方法");
    }
    //公开方法：子类继承，可以直接调用，还可以用来间接拿private的值
    public void sayHello(){
        System.out.println("你好");
    }

    //提供公开get方法，让子类间接访问私有id
    public String getId(){
        return id;
    }
    //提供公开set方法，让子类间接修改private的id
    public void setId(String id){
        this.id = id;
    }
}
