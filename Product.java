package com.itheima.oopextendstest12;

public class Product {
    private String name;
    private double price;

    //无参构造
    public Product() {
    }

    //有参构造
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    //showInfo方法，子类重写
    public void showInfo() {
        System.out.println("名称：" + name + ", 价格：" + price);
    }

    //get和set方法
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
}
