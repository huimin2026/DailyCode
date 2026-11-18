package com.itheima.a02test;

public class AddUtil {
    public static int[] add(int[] arr1,int[] arr2){
        int[] res = new int[arr1.length + 1];
        int carry = 0;
        for(int i = arr1.length - 1;i>=0;i--){
            int sum = arr1[i] + arr2[i] + carry;
            res[i + 1] = sum % 10;
            carry = sum/10;
        }
        res[0] = carry;
        return res;
    }
}
