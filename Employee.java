package com.itheima.oopextendstest9;

public class Employee {
    //成员变量：工号,姓名，工资
    private String id;
    private String name;//工号写成String（字符串），而不是int数字，是行业习惯，防止出问题
    private double salary;

    //无参构造
    public Employee(){

    }

    //有参构造
    public Employee(String id,String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //工作方法，空方法，留给子类重写
    public void work(){

    }
    //吃饭方法：吃米饭，子类共用这个方法，不用重写
    public void eat(){
        System.out.println("吃米饭");
    }

    //get、set方法，用来获取和设置私有变量
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
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
}
