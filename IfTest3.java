package com.itheima.ifdemo;

import java.util.Scanner;

public class IfTest3 {
    public static void main(String[] args) {
        /*忽略次卡规则，请计算充值不同的额度，卡里余额是多少？

储值卡规则：
充值金额 赠送金额
1000元 200元
2000元 500元
3000元 700元
5000元 1300元
10000元 2500元
20000元 6000元
50000元 15000元

余额 = 充值金额 + 赠送金额

• 充1000 → 1000+200=1200

• 充2000 → 2000+500=2500

• 充3000 → 3000+700=3700

• 充5000 → 5000+1300=6300

• 充10000 → 10000+2500=12500

• 充20000 → 20000+6000=26000

• 充50000 → 50000+15000=65000
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入充值金额：");
        int money = sc.nextInt();
        int balance = 0;
        if(money == 1000){
            balance = money + 200;
        }else if(money == 2000){
            balance = money + 500;
        }else if(money == 3000){
            balance = money + 700;
        }else if(money == 5000){
            balance = money + 1300;
        }else if(money == 10000){
            balance = money + 2500;
        }else if(money == 20000){
            balance = money + 6000;
        }else if(money == 50000){
            balance = money + 15000;
        }else{
            System.out.println("没有该挡位");
        }
        System.out.println("卡里余额：" + balance);
        sc.close();

    }
}
