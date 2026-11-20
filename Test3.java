package com.itheima.a03test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*题目：字符串转换（作业 3）｜最后一个单词的长度
描述：
给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中最后一个单词的长度。
单词是指仅由字母组成、不包含任何空格字符的最大子字符串。
示例：
1. 输入：s = "Hello World"｜输出：5
2. 输入：s = " fly me to the moon "｜输出：4
3. 输入：s = "luffy is still joyboy"｜输出：6*/

        Scanner sc = new Scanner(System.in);
        //读整行，包含空格
        String s = sc.nextLine();

        //去掉首尾空格
        s = s.trim();
        //找最后一个空格位置
        int lastSpace = s.lastIndexOf(' ');

        //如果没有空格，直接返回整个串长度；否则取后面一段
        if(lastSpace == -1){
            System.out.println(s.length());
        }else{
            String lastWord = s.substring(lastSpace + 1);
            System.out.println(lastWord.length());
        }
        sc.close();
    }
}
