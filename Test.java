package com.itheima.test;

import java.util.Scanner;

public class Test {
    void main(){
        //1.生成一个7位的随机数表示彩票号码
        int num = 1000000 + (int)(Math.random()*9000000);
        //2.键盘录入一个7位数表示用户购买的彩票
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入7位数彩票号码：");
        int inputNum = sc.nextInt();
        //3.判断用户输入的彩票号码和系统生成的彩票号码一致
        if(num == inputNum){
            System.out.println("中奖了");
        }else{
            System.out.println("未中奖");
        }
        System.out.println("系统生成的彩票号码是："+num);
        System.out.println("用户输入的彩票号码是："+inputNum);
    }
}
