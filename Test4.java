package com.itheima.a02test;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        /*定义一个任意的字符串，打乱里面的内容
          “abcd"
          "dcba"*/

        //1.定义一个字符串
        String str = "abcd";

        //2.把字符串str变成字符数组
        char[] arr = str.toCharArray();

        //3.打乱字符数组arr中的内容
        Random r = new Random();

        for(int i = 0;i<arr.length;i++) {
            //获取一个随机的索引
            int index = r.nextInt(arr.length);
            //把随机索引index位置的元素和i位置的元素进行交换
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        //4.打乱后的字符数组arr转换成字符串
        String res = new String(arr);
        System.out.println(res);
    }
}
