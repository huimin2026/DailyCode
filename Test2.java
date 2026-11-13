package com.itheima.a01apidemo6;

public class Test2 {
    public static void main(String[] args){
        /*定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，
        调用该方法，并在控制台输出结果
        例如：
        数组为int[] arr = {1,2,3};
        执行方法后的输出结果为：[1,2,3]*/

        //1.定义数组
        int[] arr = {1,2,3};

        //2.定义一个字符串用来拼接
        //String str = "";//如果不知道字符串赋值什么，可以先赋值一个长度为0的字符串

        String str = "[";

        //2.遍历数组
        //第一次循环：i = 0："[" + 1 + "," = [1
        //第二次循环：i = 1："[1," +2 +"," =[1,2
        //第三次循环：i = 2： "[1,2," +3 + "," = [1,2,3
        for(int i= 0;i<arr.length;i++){
            if(i == arr.length - 1){
                str = str + arr[i] + "[";
            }else{
                str = str + arr[i] +",";
            }
        }
        System.out.println(str);

    }
}
