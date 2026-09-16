package switchdemo;

import java.util.Scanner;

public class SwitchDemo3 {
    public static void main(String[] args){
        /*. 1.switch作用：匹配表达式的值，执行对应case代码

2. switch表达式支持：byte、short、int、char、枚举、字符串；不支持long、小数（double/float）

3. case后面只能写常量值，不能写变量；case的值不能重复

4. break：跳出switch。不加break会发生case穿透，继续往下执行后面case代码

5. default：所有case都不匹配时执行，位置可以放任意地方，习惯写最后

6. case穿透的用处：多个case执行相同代码，可以省略break合并*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字1~5：");
        int num = sc.nextInt();

        switch (num) {
            case 1 :
                System.out.println("一");
                break;//break，结束switch，防止穿透
            case 2 :
                System.out.println("二");
                break;
                //case穿透演示：2和3执行相同代码
            case 3 :
            case 4 :
                System.out.println("三或四");
                break;
            case 5 :
                System.out.println("五");
                break;
            default://都不匹配执行
                System.out.println("输入的数字不在1~5之间");
                break;
        }
        sc.close();
    }

}
