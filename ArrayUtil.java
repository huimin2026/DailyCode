package com.itheima.a02test;

public class ArrayUtil {
    /*
     *方法作用：把int数组拼接成[元素1，元素2，元素3]格式字符串
     * @parmam arr 传入的int数组
     * @return 拼接后的字符串
     * */
    public static String arrToString(int[] arr){
        //数组为null，返回[]
        if(arr == null){
            return "[]";
        }
        //数组里面没有元素，返回[]
        if(arr.length == 0){
            return "[]";
        }
        //创建StringBuilder对象来拼接
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if(i != arr.length - 1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
