package com.itheima.a02test;

import java.util.Scanner;

public class Test3Case1 {
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

        //2.遍历字符串，每8个字符打印一行
        for(int i = 0;i<str.length();i++){
            //获取字符串里面的每一个字符
            char c = str.charAt(i);
            //打印字符，不换行
            System.out.print(c);
            //判断，打印8次，才进行换行

            if((i+1)%8 == 0){
                //只换行，不打印任何数据
                System.out.println();
            }
        }

        //3.在后面补0
        //计算最后一行有多少个字符
        //长度8  0
        //长度9  1
        //长度10 2
        int lastLineCount= str.length() % 8;
        //在最后一行补多少个0
        int count = 8 - lastLineCount;
        //循环打印
        for(int i = 0;i<count;i++){
            System.out.print("0");
        }
            System.out.print("0");
    }
}
