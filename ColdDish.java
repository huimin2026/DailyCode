package com.itheima.oopextendstest11;

public class ColdDish extends Dish{
    private int shelfLife;
    public ColdDish(){

    }
    public ColdDish(String name, double price, String taste, int shelfLife){
        super(name, price, taste);
        this.shelfLife = shelfLife;
    }
    public int getShelfLife(){
        return shelfLife;
    }
    public void setShelfLife(int shelfLife){
        this.shelfLife = shelfLife;
    }
    @Override
    public void show(){
        System.out.println("凉菜"+getName()+"，价格"+getPrice()+"元，口味"+getTaste()+"，保质期"+shelfLife+"天，适合所有食客");
    }
}
