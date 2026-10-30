package com.itheima.test3;

public class Bicycle extends Vehicle{
    /*自行车Bicycle：
属性：品牌，行驶速度
行为：移动move，响铃ringBell()*/

    public Bicycle(){
        super();
    }

    public Bicycle(String brand, double speed){
        super(brand, speed);
    }

    @Override
    public void move(){
        System.out.println(getBrand() + "的自行车正在以" + getSpeed() + "km/h的速度移动");
    }

    public void ringBell(){
        System.out.println(getBrand() + "的自行车正在响铃");
    }
}
