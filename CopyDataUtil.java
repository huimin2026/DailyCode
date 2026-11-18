package com.itheima.a02test;

public class CopyDataUtil {
    public static int[] copyData(String str, int len) {
        int[] arr = new int[len];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(str.length() - 1 - i);
            arr[len - 1 - i] = ch - '0';
        }
        return arr;
    }
}
