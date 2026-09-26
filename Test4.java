package array;

public class Test4 {
    public static void main(String[] args) {
        /*前置练习：
              交换两个变量中的数据*/

        int a = 10;
        int b = 20;

        //定义一个第三方变量
        int temp = a;
        //把变量b中记录的值，赋值给a
        a = b;
        //把变量a原来的值（temp），赋值给b
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}
