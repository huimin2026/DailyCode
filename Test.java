package com.itheima.a01apidemo4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       /*boolean equals方法（要比较的字符串）
         boolean equalsIgnoreCase(要比较的字符串）

         练习：
           已知正确的用户名和密码，请用程序实现模拟用户登录
           总共给三次机会，登入之后，给出相应的提示*/

        //字符串比较的两个方法
        //第一个方法：equals方法完全一致
        /*String username = "zhangsan";
        String rightUsername = "zhangsan";
        boolean b1 = username.equals(rightUsername);*/

        //1.已知正确的用户名和密码
        String rightUsername = "zhangsan";
        String rightPassword = "123456";

        //2.让用户键盘录入登录的用户名和密码
        Scanner sc = new Scanner(System.in);


        //3.比较用户名和密码是否正确
        for(int i= 1;i<=3;i++){
            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();
        boolean result = username.equals(rightUsername) && password.equals(rightPassword);
        if(result == true){
            System.out.println("登录成功！");
            //跳出循环
            break;
        }else{
            //如果登录失败，循环继续，总共有三次机会
            if(i<=2){
                System.out.println("登录失败,还剩下"+(3-i)+"次机会");
            }else{
                System.out.println("登录失败,账号" + username + "已锁定");
            }

        }
        }
    }
}
