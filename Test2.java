package com.itheima.a03test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*题目：计算某个字符出现的次数（作业 2）
描述：
写一个程序，接受一个由字母、数字和空格组成的字符串，和一个字符，然后输出输入字符串中该字符的出现次数。（不区分大小写字母）
数据范围：1< n<1000
输入描述：
第一行输入一个由字母、数字和空格组成的字符串，第二行输入一个字符（保证该字符不为空格）。
输出描述：
输出输入字符串中含有该字符的个数。（不区分大小写字母）
示例：
输入
ABCabc
A
输出
2
思路：循环判断；字母大小写 ASCII 差 32，用来忽略大小写。*/

        Scanner sc = new Scanner(System.in);
        //读整行字符串（含空格）
        String str = sc.nextLine();
        //读目标字符
        char key = sc.nextLine().charAt(0);

        int count = 0;
        //转成统一大小写比较
        char keyUp = Character.toUpperCase(key);

        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            char cUp = Character.toUpperCase(c);
            if(cUp == keyUp){
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
