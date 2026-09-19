package loopfor;

import java.util.Scanner;

public class ForDemo6 {
    public static void main(String[] args) {
        /*需求：键盘录入两个数字，表示一个范围。
统计这个范围中。
既能被3整除，又能被5整除数字有多少个？
                 累加思想： 数字-----> sum
                 统计思想： count-----> 满足条件++
                 */
        //1.键盘录入两个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();

        //2.求两个数字最大值和最小值
        //max min
        int max = num1 > num2 ? num1: num2;
        int min = num1 <num2 ? num1 : num2;

        //3.循环获取min~max之间的每一个数字
        int count = 0;
        for(int i = min; i<=max ; i++){
            //4.判断当前循环到的数字是否满足题目的需求
            if(i%3==0&&i%5 ==0){
                count++;
            }
        }
        //4.输出
        if (count == 0){
            System.out.println("在" + min +"~" +max +"之间没有既能被3整除，又能被5整除的数字");
        }else{
            System.out.println("在" + min +"~" +max +"之间有"+count+"个既能被3整除，又能被5整除的数字");
        }
    }
}
