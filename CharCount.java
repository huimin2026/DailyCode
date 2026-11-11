package com.itheima.a01apidemo3;

public class CharCount {
    public void count(String s){
        int upper = 0;
        int lower = 0;
        int num = 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='A'&&c<='Z'){
                upper++;
            }else if (c>='a'&&c<='z'){
                lower++;
            }else if (c>='0'&&c<='9'){
                num++;
            }
            System.out.println("大写字母个数："+upper);
            System.out.println("小写字母个数："+lower);
            System.out.println("数字个数："+num);
        }
    }
}
