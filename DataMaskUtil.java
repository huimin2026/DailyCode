package com.itheima.a03test;

public class DataMaskUtil {

    //手机号脱敏
    public static String maskPhone(String phone){
        if(phone == null || phone.length() !=11){
            return phone;
        }
        //保留前三位和后四位
        return phone.substring(0,3) + "****" + phone.substring(7);
    }

    //邮箱脱敏
    public static String maskEmail(String email){
        if(email == null || email.length() == 0){
            return email;
        }
        //保留邮箱名第一个字母，保留 @ 后面全部内容
        int index = email.indexOf("@");
        return email.charAt(0) + "****" + email.substring(index);
    }
}
