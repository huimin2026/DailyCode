package com.itheima.oopextendstest12;

public class Electronic extends Product{
    private String brand;
    private String model;


    public Electronic(){

    }

    public Electronic(String brand, String model, String name, double price) {
        super(name, price);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void showInfo(){
        System.out.println("名称：" + getName() + ", 价格：" + getPrice() + ", 品牌：" + brand + ", 型号：" + model);
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
}
