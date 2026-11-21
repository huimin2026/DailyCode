package com.itheima.a03test;

import java.util.Random;

public class Test6 {
    public static void main(String[] args){
        /*案例：生成验证码（作业 6）
验证码可以包含小写字母、大写字母、数字；长度固定为 5；必须是 4 个字母 + 1 个数字，数字只有 1 位，放在任意位置。*/

        //1.创建长度52的数组，存放全部大小写字母
        char[] letterArr = new char[52];
        //循环存入26个小写字母 a~z
        for(int i= 0;i<26;i++){
            letterArr[i] = (char)('a'+i);
        }
        //循环存入26个大写字母A~Z
        for(int i = 0; i < 26; i++){
            letterArr[i+26] = (char)('A' + i);
        }

        //2.创建随机对象
        Random r = new Random();
        //3.创建验证码数组，固定长度5
        char[] codeArr = new char[5];

        //循环4次，取出4个随机字母
        for(int i = 0;i<4;i++){
            //随机生成索引：0~51
            int randomIndex = r.nextInt(52);
            //根据索引拿字母放进验证码数组
            codeArr[i] = letterArr[randomIndex];
        }

        //4.生成0~9的随机数字，转成字符
        int number = r.nextInt(10);
        char numberChar = (char) (number + '0');

        //5.随机选一个位置（0~4）放数字
        int randomPos = r.nextInt(5);
        codeArr[randomPos] = numberChar;

        //6.将验证码数组转成字符串
        String verifyCode = new String(codeArr);
        System.out.println(verifyCode);
    }
}
