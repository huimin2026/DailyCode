package com.itheima.a03test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*题目：字符串转换（作业 5）
描述：
将一个字符串中所有的整数前后加上符号 *，其他字符保持不变。连续的数字视为一个整数。
数据范围：字符串长度满足 1< n< 100
输入描述：
输入一个字符串
输出描述：
字符串中所有出现的数字前后加上符号 *，其他字符保持不变
示例：
输入：Jkdi234klowe90a3
输出：Jkdi*234*klowe*90*a*3*
*/

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //用来拼结果
        StringBuilder res = new StringBuilder();
        //用来临时存一段连续数字
        StringBuilder numBuf = new StringBuilder();

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            //判断是不是数字
            if(ch >='0' && ch <='9'){
                numBuf.append(ch);
            }else{
                //如果缓存里面有数字，先打包加*
                if(numBuf.length()>0){
                    res.append("*").append(numBuf).append("*");
                    numBuf.setLength(0);
                }
                //非数字直接放结果
                res.append(ch);
            }
        }
        //循环结束别忘了最后一段数字
        if(numBuf.length()>0){
            res.append("*").append(numBuf).append("*");
        }
        System.out.println(res);
        sc.close();
    }
}
