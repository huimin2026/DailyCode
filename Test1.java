package com.itheima.a01strigbuilderdemo;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*题目：
接收用户输入一句话，利用 StringBuilder：
1. 如果句子以问号结尾 → 使用 reverse() 将整段文字反转；
2. 如果不以问号结尾 → 在末尾追加 “～完成”；
3. 最后把 StringBuilder 转成字符串输出；
4. 判断最终字符串是否包含 “黑马”，打印提示。*/

        //创建扫描仪
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一句话：");
        String input = sc.nextLine();

        //使用输入字符串初始化 StringBuilder
        StringBuilder sb = new StringBuilder(input);

        //判断是否以问号结尾
        if(input.endsWith("?")) {
            sb.reverse();
        }else{
            sb.append("～完成");
        }

        //转为普通字符
        String res = sb.toString();
        System.out.println(res);

        //判断最终字符串是否包含 “黑马”
        if(res.contains("黑马")){
            System.out.println("最终字符串包含 “黑马”");
        }else{
            System.out.println("最终字符串不包含 “黑马”");
        }
    }
}
