package com.itheima.oopextendstest10;

public class Employee {
    //员工编号（String保留前导0）
    private String id;
    //员工姓名
    private String name;
    //无参构造
    public Employee(){

    }
    //有参构造
    public Employee(String id, String name){
        this.id = id;
        this.name = name;
    }
    //工作方法，交给子类重写
    public void work(){

    }
    //get和set方法
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
