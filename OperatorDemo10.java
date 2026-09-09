package operator;

import java.util.Scanner;

public class OperatorDemo10 {
    public static void main(String[] args) {

        //练习1：键盘录入一个整数，判断这个数学是否在1~10之间

        //1.键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();

        //2.判断这个数学是否在1~10之间
        //number > 1    number < 10 同时满足 &
        boolean result1 = number > 1 & number < 10;
        System.out.println(result1);


    }
}
