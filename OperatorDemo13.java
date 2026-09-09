package operator;

public class OperatorDemo13 {
    public static void main(String[] args) {
        /* 需求2：
         寻找7的有缘数，定义一个两位数，只要该数字包含7或者7的倍数，就是7的有缘数
         */
        //1.定义一个两位数
        int number = 71;
        //包含7；个位或者十位是7即可
        //7的倍数：number % 7 == 0
        //2.获取个位和十位
        int ge = number % 10;
        int shi = number / 10;

        //3.判断当前数字是否是7的有缘数
        // ge == 7  || shi == 7 || number % 7 == 0
        System.out.println(ge == 7 || shi == 7 || number % 7 == 0);
    }

}
