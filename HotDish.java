package com.itheima.oopextendstest11;

public class HotDish extends Dish{
    private int cookTime;

    //无参
    public HotDish(){

    }

    //有参
    public HotDish(String name, double price, String taste, int cookTime){
        super(name, price, taste);
        this.cookTime = cookTime;
    }
    public int getCookTime(){
        return cookTime;
    }
    public void setCookTime(int cookTime){
        this.cookTime = cookTime;
    }

    //介绍重写方法
    @Override
    public void show(){
        System.out.println("热菜"+getName()+"，价格"+getPrice()+"元，口味"+getTaste()+"，烹饪时间"+cookTime+"分钟，适合重口味食客");
    }
}
