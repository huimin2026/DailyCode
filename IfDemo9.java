package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo9 {
    public static void main(String[] args) {
   /* 键盘录入任意三个大于0的小数，判断这三个数值构成什么类型的三角形？
    需要判断的类型如下：
    等边、等腰、直角、普通、无效

    三角形的构成条件：任意两边之和大于第三边
    a + b > c && a + c > b && b + c > a

    细节1：
    现实的生活经验，有可能跟代码是相反的，我们要梳理好其中的逻辑

    细节2：
    if的第三种格式下，存在多个判断的范围如果有重叠
    等边 < 等腰

    A范围 < B范围
    记得：小范围写在上面，大范围写在下面*/
        //1.键盘录入三个小数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个小数：");
        double a = sc.nextDouble();
        System.out.println("请输入第二个小数：");
        double b = sc.nextDouble();
        System.out.println("请输入第三个小数：");
        double c = sc.nextDouble();

        //2.判断三个数值是否可以构成三角形
        if(a + b > c && a+c>b && b+c>a){
            //判断构成什么类型的三角形
            //等边 等腰 直角 普通
            if(a==b&&b==c){//10 10 10
                System.out.println("等边三角形");
            }else if (a==b||a==c||b==c){
                System.out.println("等腰三角形");
            }else if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a){
                System.out.println("直角三角形");
            }else{
                System.out.println("普通三角形");
            }
        }else{
            //无效
            System.out.println("无效三角形");
        }
    }
}
