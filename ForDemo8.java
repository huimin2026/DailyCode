package loopfor;

import java.util.Scanner;

public class ForDemo8 {
    public static void main(String[] args){
        /*牛牛开始学习数列啦。现在他想计算以下数列前n项的和：
S(n) = 1 − 2 + 3 − 4 + …

示例1：
输入：4
说明：S(4) = 1 − 2 + 3 − 4 = -2
输出： -2
*/
        //1.键盘录入一个数据，表示循环的范围，n
        Scanner sc = new Scanner(System.in);
        System.out.println("请输出一个数字：");
        int n = sc.nextInt();

        //2.定义求和变量

        int sum = 0;
        //3.循环
        for(int i = 1 ; i<=n ; i++){
            //判断当前的数字是奇数还是偶数
            if(i % 2 == 0){
                //偶数
                sum = sum - i;
            }else{
                //奇数
                sum = sum + i;
            }
        }
        //输出
        System.out.println(sum);
    }
}
