package controllerloop;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*生成一个1~100之间的随机数，利用键盘录入模拟猜的动作，一直猜对为止*/

        //1.生成一个1~100之间的随机数
        Random r = new Random();
        int number = r.nextInt(1,10);
        System.out.println();

        while(true){
            //2.键盘录入模拟猜的动作
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的猜测：");
            int guessNumber = sc.nextInt();

            //3.比较
            if(guessNumber > number){
                System.out.println("猜大了");
            }else if(guessNumber < number){
                System.out.println("猜小了");
            }else{
                System.out.println("猜对了");
                break;
            }
        }

    }
}
