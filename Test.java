package com.itheima.a01apidemo3;

import java.util.Scanner;

public class Test {
    /*需求：
    1.接收用户输入一段字符串
    2.统计里面大写字母、小写字母、数字的数量
    3.使用StringBuilder把原字符串反转
    4.输出统计结果、反转后的字符串*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段字符串：");
        String str = sc.nextLine();

        //调用统计方法
        CharCount cc = new CharCount();
        cc.count(str);
        //调用反转方法
        StringReverse sr = new StringReverse();
        String reverseStr = sr.reverse(str);
        System.out.println("反转后的字符串是：" + reverseStr);
        sc.close();

    }
}
