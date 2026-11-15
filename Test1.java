package com.itheima.a01apidemo8;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*String replace(旧值，新值） 替换
                          注意点：只有返回值才是替换后的结果

         需求：
           过滤玩游戏中骂人的脏话*/

        //1.定义一个敏感词库
        String[] arr = {"日你","艹","sb"};

        //2.键盘录入你说的话
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你说的话：");
        String msg = sc.next();

        //3.替换敏感词
        for(int i = 0; i < arr.length; i++){
            msg = msg.replace(arr[i], "***");
        }
        System.out.println(msg);
    }
}
