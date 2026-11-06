package com.itheima.a01innerclassdemo1;

public class Test {
    public static void main(String[] args) {
        /*需求：写一个Javabean类描述汽车
          属性：汽车的品牌，车龄，颜色，发动机的品牌，使用年限

          内部类的意义：
             内部类表示的事物是外部类的一部分
             内部类单独存在，没有实际意义
          */

        //1.先创建外部类对象 Car
        Car car = new Car("奔驰", 5, "红色");
        //2.成员内部类创建格式：外部类对象.new 内部类（）
        Car.Engine engine = car.new Engine("奔驰", 5);

        //打印查看数据
        System.out.println("汽车品牌：" + car.getCarBrand());
        System.out.println("汽车车龄：" + car.getCarAge());
        System.out.println("汽车颜色：" + car.getCarColor());
        System.out.println("发动机品牌：" + engine.getEngineBrand());
        System.out.println("发动机使用年限：" + engine.getEngineAge());
    }
}
