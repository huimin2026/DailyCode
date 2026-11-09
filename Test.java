package com.itheima.a01apidemo;

//导包：定义Random的位置
//扩展：在什么情况下，我不需要导包？
//     情况一：如果使用本包中的类
//     情况二：如果使用java.lang包中的类
//     其他情况都需要导包
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //需求：查询API帮助文档，使用Rand类中获取随机小数的方法

        //1.创建Random对象
        Random r = new Random();

        //2.调用方法获取一个随机的小数[0.0 - 1.0)
        //0.0 ~ 0.9999999999999999999999...
        double num1 = r.nextDouble();
        System.out.println(num1);

        //[0.0 ~ 范围)JDK17才有的
        double num2 = r.nextInt(10);
        System.out.println(num2);

        //3.调用方法获取一个随机的int值[0 ~ 范围)
        int num3 = r.nextInt(10);
        System.out.println(num3);
    }
}
