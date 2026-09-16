package com.itheima.ifdemo;

import java.util.Scanner;

public class IfTest2 {
    public static void main(String[] args) {
    /*给定正整数 n，
若 n 为奇数，则 f(n) = 3n + 1
若 n 为偶数，则 f(n) = n / 2

示例1：
输入：1
说明：奇数，3 * 1 + 1 = 4
输出：4

示例2：
输入：2
说明：偶数，2 / 2 = 1
输出：1

*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res;
        if(n%2==1){
            res = 3*n+1;
        }else{
            res = n/2;
        }
        System.out.println(res);
        sc.close();

    }
}
