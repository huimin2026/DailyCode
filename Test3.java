package looploop;

public class Test3 {
    public static void main(String[] args) {
          /*
       打印正三角形
        *
        **
        ***
        ****
        *****
        打印倒三角形
        *****
        ****
        ***
        **
        *

        限定：每次只能输出一个*
        */

        //打印正三角形的第一行

        //外循环：把在一行打印N个星的事情，重复五次
        for(int i = 1;i<=5;i++){
            //内循环：在一行打印1~5个星
            for (int j=1;j<=6-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
