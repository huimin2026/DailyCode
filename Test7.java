package com.itheima.a03test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        /*键盘输入两个字符串表示的非负整数，求它们的乘积。
注意：需要考虑键盘录入的数据过大，超出 int 取值范围的情况。*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串：");
        String s1 = sc.nextLine().trim();
        System.out.println("请输入第二个字符串：");
        String s2 = sc.nextLine().trim();

        String result = BigMultiply.multiply(s1,s2);
        System.out.println("乘积为：" + result);
        sc.close();
    }
}
