package operator;

import java.util.Scanner;

public class OperatorDemo11 {
    public static void main(String[] args) {
        //练习2：键盘录入一个整数，判断这个数字是否不在1~10之间

        //1.键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();

        //2.判断这个数字是否不在1~10之间
        boolean result = number <= 1 | number >= 10;
        System.out.println(result);
    }
}
