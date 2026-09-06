package variable;

import java.util.Scanner;

public class VariableDemo8 {
    public static void main(String[] args) {

        //BMI = 体重 / 身高的平方

        // 1. 键盘录入体重 KG  55
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的体重：");
        double weight = sc.nextDouble();

        // 2.键盘录入身高 150
        System.out.println("请输入您的身高：");
        double height = sc.nextDouble();

        // 3. 计算BMI
        double bmi = weight / (height * height);
        System.out.println(bmi);
    }
}
