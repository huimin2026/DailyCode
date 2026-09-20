package controllerloop;

import java.util.Scanner;

public class BreakDemo3 {
    public static void main(String[] args) {
        /*键盘录入一个大于等于2的整数，判断是否为质数

        质数：除了1和它本身以外，不能被其他数整除的数*/

        //1.键盘录入一个大于等于2的整数
        Scanner sc = new Scanner(System.in);
        int number = 0;
        while (true){
            System.out.println("请输入一个大于等于2的整数：");
            number = sc.nextInt();
            if(number >= 2){
                break;
            }else{
                System.out.println("输入的数字不符合要求，请重新输入");
            }
        }
        //2.判断number记录的数据，是否为一个质数
        int count = 0;
        for(int i = 2;i<number;i++){
            if(number%i==0){
                count++;
                break;
            }
        }
        //3.判断count
        if(count == 0){
            System.out.println(number + "是质数");
        }else{
            System.out.println(number + "不是质数");
        }
    }

}
