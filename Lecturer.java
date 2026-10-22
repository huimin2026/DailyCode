package com.itheima.oopextendstest10;

public class Lecturer extends Teacher{
    public Lecturer(){

    }
    public Lecturer(String id, String name){
        super(id, name);
    }
    //重写工作方法
    @Override
    public void work(){
        System.out.println("讲师：给学员讲课");
    }
}
