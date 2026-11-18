package com.itheima.a02test;

public class PrintUtil {
    public static void printArr(int[] arr){
        boolean flag = false;
        for(int num : arr){
            if (num !=0){
                flag = true;
            }
            if(flag){
                System.out.print(num + " ");
            }
        }
        if(!flag){
            System.out.print(0);
        }
    }
}
