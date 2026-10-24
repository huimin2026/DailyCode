package com.itheima.oopextendstest12;

public class Clothes extends Product{
    private String size;
    private String color;

    public Clothes(){
    }

    public Clothes(String size, String color){
        this.size = size;
        this.color = color;
    }

    @Override
    public void showInfo(){
        System.out.println("尺寸：" + size + ", 颜色：" + color);
    }
    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    }
