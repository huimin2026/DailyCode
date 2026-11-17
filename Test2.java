package com.itheima.a02test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
        /*键盘录入字符串，将该字符串进行反转，当前输入拜拜的时候程序停止运行
          例如，键盘录入abc，输出结果cba

          for:知道循环的次数
          while：不知道循环次数*/

        Scanner sc = new Scanner(System.in);
        while(true){
            //1.键盘录入字符串
            System.out.println("请输入字符串：");
            String str = sc.next();//123

            //2.判断
            if(str.equals("拜拜")){
                //程序停止运行
                System.out.println("程序停止运行");
                break;
            }else{
                //反转
                StringBuilder sb = new StringBuilder(str);
                sb.reverse();
               String res = sb.toString();
               System.out.println(res);

            }
        }
    }
}
