package com.itheima.ifdemo;

import java.util.Scanner;

public class IfTest4 {
    public static void main(String[] args) {
        /*题目：计算BMI

键盘录入你的身高和体重，计算BMI。
BMI公式：\boldsymbol{BMI=体重 \div 身高^2}
体重单位：千克，身高单位：米
BMI数值 身体状态 健康风险
<18.5 消瘦 部分增加
18.5~23.9 正常 正常
24.0~26.9 偏胖 增加
27.0~29.9 肥胖 中度增加
≥30 严重肥胖 严重增加 */
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入身高（米）:");
        double height =  sc.nextDouble();
        System.out.println("请输入体重（千克）：");
        double weight = sc.nextDouble();

        //计算BMI：体重/（身高*身高）
        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);

        //判断区间
        if(bmi < 18.5){
            System.out.println("消瘦");
        }else if(bmi <=23.9){
            System.out.println("正常");
        }else if(bmi <=26.9){
            System.out.println("偏胖");
        }else if(bmi <=29.9){
            System.out.println("肥胖");
        }else{
            System.out.println("严重肥胖");
        }
        sc.close();
    }
}
