package com.itheima.a02test;

public class Test5 {
    public static void main(String[] args) {
        /*定义两个字符串，记录为非负整数。输入字符串“12395”和“123”，求这两个超大数字相加的结果并输出；注意：数据过大，超过int取值范围，不能直接转数字相加，需要使用字符串来模拟加法运算。
        */

        String str1 = "12395";
        String str2 = "133";

        int len =str1.length() > str2.length() ? str1.length() : str2.length();
        int[] arr1 = CopyDataUtil.copyData(str1,len);
        int[] arr2 = CopyDataUtil.copyData(str2,len);

        int[] resultArr = AddUtil.add(arr1,arr2);
        PrintUtil.printArr(resultArr);
    }
}
