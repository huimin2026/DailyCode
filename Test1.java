package com.itheima.a02test;

public class Test1 {
    public static void main(String[] args) {
        /*定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。
例如：数组为 int[] arr = {1,2,3};
执行方法后的输出结果为：[1, 2, 3]*/

        //1.定义测试数组
        int[] arr = {1,2,3};
        //2.调用方法，接收返回值
        String result = arrToString(arr);
        System.out.println(result);

    }
    public static String arrToString(int[] arr){
        //1.创建StringBuilder对象
        StringBuilder sb = new StringBuilder();
        //2.遍历数组
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if(i != arr.length - 1){
                sb.append(", ");
            }
        }
        //3.返回结果
        return sb.toString();

    }
}
