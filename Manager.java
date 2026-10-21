package com.itheima.oopextendstest9;

public class Manager extends Employee{
    //经理独有的成员变量：管理奖金
    private double bonus;
    //无参构造
    public Manager(){

    }
    //有参构造
    public Manager(String id, String name, double salary, double bonus){
        //调用父类的有参构造,给继承来的属性赋值
        super(id,name,salary);
        this.bonus = bonus;
    }
    //重写父类的work工作方法：经理的工作是管理其他人
    @Override
    public void work(){
        System.out.println("管理其他人");
    }
    //bonus的get和set
    public double getBonus(){
        return bonus;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
}
