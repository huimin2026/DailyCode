package loopwhile;

import java.util.Scanner;

public class WhileDemo5 {
    public static void main(String[] args) {
        /*描述
给定一个整数n，请计算其所有数位之和。若n为负数，请先取其绝对值。
示例1
输入：12
说明：1 + 2 = 3
输出：3
示例2
输入：-305
说明：获取绝对值305，再求和3 + 0 + 5 = 8
输出：8
第1遍：number=305

1. 305%10 → 拿出5
sum = 0 +5 → sum=5

2. 305/10 → 删掉5，剩下30
现在 number=30

第2遍：number=30

1. 30%10 →拿出0
sum =5+0 →sum=5

2. 30/10 →删掉0，剩下3
现在 number=3

第3遍：number=3

1. 3%10 →拿出3
sum=5+3 →sum=8

2. 3/10 →删掉3，剩下0
现在 number=0

number变成0，number !=0 不成立，循环停下

盆子sum里面现在是8，打印出来。


*/
        //1.键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();

        //2.获取number的绝对值
        // 正数 0 本身 负数 相反数
        if(number < 0){
            number = -number;
        }

        //3.定义求和变量
        int sum = 0;

        //4.利用循环获取number上的每一位数字
        //305：
        //  个位：number % 10
        //  去掉个位：number / 10 ---30
        //   个位：number%10   0
        //   去掉个位： number / 10---3
        //   个位：number%10
        //    去掉个位：number / 10---0
        while(number != 0){
            //获取个位
            //System.out.println(number % 10);
            sum = sum + (number % 10);

            //去掉个位
            number = number / 10;
        }
        System.out.println("sum="+sum);
    }
}
