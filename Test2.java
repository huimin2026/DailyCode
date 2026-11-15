package com.itheima.a01apidemo8;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*需求：接收用户输入一段文字
① 判断字符串是不是以 “黑马” 开头；
② 如果包含 “Java”，把所有 “Java” 替换成 “Java 编程”；
③ 截取从索引 2 到倒数第 2 的子串输出；
④ 如果字符串首尾有空格，先去掉空格再做上面操作。*/

        //创建扫描对象，接收键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段文字：");
        //获取输入内容
        String str = sc.nextLine();

        //trim:去除字符串首尾空格
        str = str.trim();

        //startWith 判断字符串是否以“黑马”开头
        boolean flag1 = str.startsWith("黑马");
        System.out.println("字符串是否以“黑马”开头：" + flag1);

        //contains 判断是否包含“Java”
        if(str.contains("Java")){
            //replace:替换所以匹配内容
            str = str.replace("Java", "Java 编程");
        }

        //获取字符串最后一个字符的索引
        int endIndex = str.length() - 1;
        //substring(起始，结束）：左闭右开，截取索引 2 到倒数第二位
        String subStr = str.substring(2, endIndex);
        System.out.println("截取的子串是：" + subStr);

        //关闭扫描器
        sc.close();
    }
}
