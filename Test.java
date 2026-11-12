package com.itheima.a01apidemo6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*键盘录入一个字符串，统计字符串中大写字母、小写字母、数字字符出现的次数*/

        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        //定义三个计数器
        int smallCount = 0;
        int bigCount = 0;
        int numberCount = 0;

        //2.遍历字符串
        for(int i = 0; i < str.length(); i++){
            //c:依次表示每一个遍历得到的字符
            char c = str.charAt(i);
            //判断
            if(c >= 'a' && c <= 'z'){
                smallCount++;
            }else if(c >= 'A' && c <= 'Z'){
                bigCount++;
            }else if(c >= '0' && c <= '9'){
                numberCount++;
            }
        }
        System.out.println("小写字母的个数是：" + smallCount);
        System.out.println("大写字母的个数是：" + bigCount);
        System.out.println("数字字符的个数是：" + numberCount);
    }
}
