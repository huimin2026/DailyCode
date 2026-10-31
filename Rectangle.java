package com.itheima.test4;

public class Rectangle extends Shape{
    //属性：宽、高
    private double width;
    private double height;

    //构造方法:给宽和高赋值
    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }

    //重写父类周长方法
    @Override
    public double getPerimeter(){
        return 2*(width+height);
    }
    //重写父类面积方法
    @Override
    public double getArea(){
        return width*height;
    }

    //获取宽
    public double getWidth(){
        return width;
    }
    //获取高
    public double getHeight(){
        return height;
    }
}
