package com.itheima.a03test;

public class BigMultiply {
        public static String multiply(String num1, String num2) {
            int[] res = new int[num1.length() + num2.length()];

            // 倒序遍历每一位相乘
            for (int i = num1.length() - 1; i >= 0; i--) {
                int n1 = num1.charAt(i) - '0';
                // 内层循环用 j！不能再用 i
                for (int j = num2.length() - 1; j >= 0; j--) {
                    int n2 = num2.charAt(j) - '0';
                    int sum = res[i + j + 1] + n1 * n2;
                    res[i + j + 1] = sum % 10;
                    res[i + j] += sum / 10;
                }
            }

            // 转字符串，去掉前导 0
            StringBuilder sb = new StringBuilder();
            int index = 0;
            while (index < res.length && res[index] == 0) {
                index++;
            }
            if (index == res.length) {
                return "0";
            }
            for (int i = index; i < res.length; i++) {
                sb.append(res[i]);
            }
            return sb.toString();
        }
    }
