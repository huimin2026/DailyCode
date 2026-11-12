package com.itheima.a01apidemo05;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       /*public char charAt(int index):根据索引返回字符
         public int length():返回字符串中字符的个数

         需求：键盘录入一个字符串，使用程序实现在控制台遍历该字符串*/

        //chatAt
        String str = "你好你好123";
        char c = str.charAt(3);
        System.out.println(c);

        //length
        int len = str.length();
        System.out.println(len);

        //键盘录入一个字符串，使用程序实现在控制台遍历该字符串
        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();

        for(int i = 0;i<s.length();i++){
            char cc = s.charAt(i);
            System.out.println(cc);
        }
    }
}
