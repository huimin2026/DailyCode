package com.itheima.a02test;

import java.util.Scanner;

public class Test3Case2 {
    public static void main(String[] args) {
        /*键盘录入任意字符串，请按长度为8拆分每个输入字符串并进行输出
          长度不是8整数倍的字符串申请在后面补数字0，空字符串不处理
          举例：
          输入：abcdabcda
          输出：
              第一行：abcdabcd
              第二行：a0000000*/

        //1.键盘录入任意字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();
        //abcdabcda

        //2.直接在str的后面补0
        //abcdabcda
        //计算最后一行有多少个字符
        int lastLineCount = str.length()%8;//9%8=1
        //计算最后一行补多少个0
        int count = 8 - lastLineCount;//8-1=7
        //补0
        if(count !=0){
            //获取最后一行补的0
            String line = "00000000".substring(0,count);
            //拼接
            str = str + line;
        }

        //3.每8个打印一行
        //abcdabcd   a
        //i += 8:第一行：0索引开始
        //i += 8:第二行：8索引开始
        for(int i = 0;i<str.length();i+=8){
            //每8个截取一次
            String res = str.substring(i,i+8);
            //打印
            System.out.println(res);
        }
    }
}
