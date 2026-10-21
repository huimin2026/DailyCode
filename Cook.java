package com.itheima.oopextendstest9;

public class Cook extends Employee{
    //无参构造
    public Cook(){

    }
    //有参构造
    public Cook(String id, String name, double salary){
        super(id, name, salary);
    }
    //重写work方法：厨师的工作是炒菜
    @Override
    public void work(){
        System.out.println("炒菜");
    }
}
