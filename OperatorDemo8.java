package operator;

import java.util.Scanner;

public class OperatorDemo8 {
    public static void main(String[] args){
        /*
        练习1：键盘录入你和你朋友的身高，比一比谁更高？



         */

        //练习1：键盘录入你和你朋友的身高，比一比谁更高？

        //1. 键盘录入两个小数，分别表示我和我朋友的身高
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入我的身高：");
        double myHeight = sc.nextDouble();
        System.out.println("请输入我朋友的身高：");
        double friendHeight = sc.nextDouble();

        //2.比较
        boolean result = myHeight >= friendHeight;
        System.out.println(result);



    }
}
