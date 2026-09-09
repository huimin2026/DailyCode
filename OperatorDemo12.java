package operator;

import java.util.Scanner;

public class OperatorDemo12 {
    public static void main(String[] args) {
        /*
         需求1：
         键盘录入一个四位整数，判断这个整数是否是回文数？

         */

        //键盘录入一个四位整数，判断这个整数是否是回文数？

        //1.键盘录入一个四位整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位整数：");
        int number = sc.nextInt();

        //2.数字拆分
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        int qian = number / 1000 % 10;

        System.out.println("个位是：" + ge);
        System.out.println("十位是：" + shi);
        System.out.println("百位是：" + bai);
        System.out.println("千位是：" + qian);

        //3.判断这个整数是否是回文数？
        // qian == ge && shi == bai
        System.out.println(qian == ge && shi == bai);
    }
}