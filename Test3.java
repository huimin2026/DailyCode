package controllerloop;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*生成一个1~100之间的随机数，利用键盘录入模拟猜的动作，一直猜对为止
        抽卡的时候，有保底机制
        小保底：只要三次没有猜中，提示用户猜测范围
        大保底：只要10次没有猜中，猜中了*/

        //1.生成一个1~100之间的随机数
        Random r = new Random();
        int number = r.nextInt(1,10);
        System.out.println();

        //定义两个计数器
        int countA = 0;//小保底
        int countB = 0;//大保底

        while(true){
            //2.键盘录入模拟猜的动作
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的猜测：");
            int guessNumber = sc.nextInt();

            //只要用户猜测一次，计数器就自增一次
            countA++;
            countB++;

            //10次没有猜中，直接触发大保底，用技术手段弥补用户的缺失
            if(countB == 10){
                guessNumber = number;

            }

            //3.比较
            if(guessNumber > number){
                System.out.println("猜大了");
            }else if(guessNumber < number){
                System.out.println("猜小了");
            }else{
                System.out.println("猜对了");
                break;
            }
            //小保底的业务逻辑，需要写在比较的下面
            //触发时间，三次没有猜中
            if (countA % 3 == 0) {
                System.out.println("触发小保底机制，随机数字的范围" + (number - 5) + "到" + (number + 5));
            }
        }

    }
}
