package com.itheima.toolclasstest;

public class Test {
    public static void main(String[] args) {
        /*题目需求

在实际开发中，经常会遇到一些数组使用的工具类。请按照如下要求编写一个数组的工具类完成以下需求：

1. 提供一个方法printArr，用于遍历数组。格式如下：[10, 20, 50, 34, 100]（只考虑整数数组）

2. 提供一个方法getAverage，用于返回平均分。（只考虑整数数组）

要求：写工具类，两个都是静态方法。

• printArr(int[] arr)：打印数组，输出格式 [10, 20, 50, 34, 100]

• getAverage(int[] arr)：计算数组元素平均值，返回结果。*/

        //创建一个数组
        int[] arr = {10, 20, 50, 34, 100};
        //遍历
        ArrayUitl.printArr(arr);

        //创建一个数组
        int[] arr2 = {1,2,3,4,7};
        //ctrl + alt +v 自动生成左边的接受变量
        double avg = ArrayUitl.getAverage(arr2);
        System.out.println(avg);

    }
}
