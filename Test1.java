package com.itheima.a03test;

public class Test1 {
    public static void main(String[] args) {
        /*题目：数据脱敏（作业 1）
要求：
1. 把任意手机号中间四位变成 ****
2. 保留邮箱名第一个字母，保留 @ 后面全部内容
例子：
• 13112345678 → 131****5678
• zw1234@163.com → z****@163.com
*/
        String phone = "13112345678";
        String email = "zw1234@163.com";
        System.out.println(DataMaskUtil.maskPhone(phone));
        System.out.println(DataMaskUtil.maskEmail(email));
    }
}
