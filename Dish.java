package com.itheima.oopextendstest11;

public class Dish {
    private String name;  //菜名
    private double price; //价格
    private String taste; //口味

    //无参构造
    public Dish(){

    }

    //有参构造
    public Dish(String name, double price, String taste){
        this.name = name;
        this.price = price;
        this.taste = taste;
    }

    //get、set
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getTaste(){
        return taste;
    }
    public void setTaste(String taste){
        this.taste = taste;
    }

    //菜品介绍方法，供子类重写
    public void show(){

    }
}
