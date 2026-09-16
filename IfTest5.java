package com.itheima.ifdemo;

import java.util.Scanner;

public class IfTest5 {
    public static void main(String[] args){
        /*题目：计算电费

用电量采用阶梯计费：

1. 0～100度：0.5元/度

2. 100～200度：超出100的部分按0.8元/度

3. 超过200度：超出200的部分按1.2元/度

输入usage代表用电量，输出总电费cost。
示例：输入usage=150
cost = 1000.5 + 500.8 = 90*/
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用电量：");
        int usage = sc.nextInt();
        double cost;

        if(usage <= 100){
            cost = usage * 0.5;
        }else if(usage <= 200){
            cost = 100*0.5+(usage-100)*0.8;
        }else{
            cost = 100*0.5 + 100*0.8 + (usage - 200)*1.2;
        }
        System.out.println("总电费为：" + cost);
        sc.close();
    }
}
