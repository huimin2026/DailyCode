package com.itheima.a01apidemo2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //1.创建Sanner对象，接收用户输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.nextLine();

        //1.判断是否包含java
        if(str.contains("java")){
            System.out.println("找到了java");
        }

        //2.把所以java替换成Java
        String newStr = str.replace("java", "Java");
        System.out.println(newStr);

        //3.截取索引2到6（包含2，不包含6）
        String sub = newStr.substring(2,6);
        System.out.println("截取[2,6)");

        //4.StringBuilder反转
        StringBuilder sb = new StringBuilder(newStr);
        sb.reverse();
        System.out.println("反转结果" + sb);

        sc.close();
    }
}
