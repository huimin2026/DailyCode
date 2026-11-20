package com.itheima.a03test;

public class Test4 {
    public static void main(String[] args) {
        /*题目：字符串获取信息（作业 4）
身份证编码规则：
• 第 1、2 位：省份
• 第 3、4 位：城市
• 第 5、6 位：区县
• 第 7～14 位：出生年月日
• 第 15、16 位：所在地派出所
• 第 17 位：性别（奇数男，偶数女）
• 第 18 位：个人信息码
要求：
假设有身份证：321104200801121234，获取出生年月日和性别并输出。
输出样例：
出生年月日：2008年01月12日
性别为：男*/

        //固定身份证串，也可以自己输入
        String idCard = "321104200801121234";

        //截取7~14位（下标从0开始
        String birthStr = idCard.substring(6, 14);
        String year = birthStr.substring(0,4);
        String month = birthStr.substring(4,6);
        String day = birthStr.substring(6,8);

        //第17位、下标16
        char sexChar = idCard.charAt(16);
        int sexNum = sexChar - '0';
        String sex = (sexNum % 2 == 0) ? "女" : "男";

        //输出结果
        System.out.println("性别为：" + sex);
        System.out.println("出生年月日：" + year + "年" + month + "月" + day + "日");

    }
}
