package com.itheima.a01apidemo3;

public class StringReverse {
    public String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}
