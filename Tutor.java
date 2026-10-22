package com.itheima.oopextendstest10;

public class Tutor extends Teacher{
    public Tutor(){

    }
    public Tutor(String id, String name){
        super(id, name);
    }
    @Override
    public void work(){
        System.out.println("助教：辅导学员，批改作业");
    }
}
