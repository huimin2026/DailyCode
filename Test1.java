package com.itheima.a01apidemo7;

public class Test1 {
    public static void main(String[] args){
        /*需求：只保留用户名第一个字符，后面用三个***替代*/

        String username = "zhangsan";
        //charAt(0)
        char firstName1 = username.charAt(0);
        String encryption = firstName1 + "***";
        System.out.println(encryption);

        //substring(0,1)
        String firstName2 = username.substring(0,1);
        System.out.println(firstName2);
        String encryption2 = firstName2 + "***";
        System.out.println(encryption2);
    }
}
