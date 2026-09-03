package variable;

public class VariableDemo3 {
    /*
变量的注意事项：
 1．只能存一个值
 2．变量名不允许重复定义
 3．变量在使用之前一定要进行赋值
 4．一条语句可以定义多个变量，也可以连续赋值
*/

    int a, b, c, d;

    public static void main(String[] args) {
        VariableDemo3 demo = new VariableDemo3();

        // 连续赋值
        demo.a = demo.b = demo.c = demo.d = 10;

        System.out.println(demo.a);
        System.out.println(demo.b);
        System.out.println(demo.c);
        System.out.println(demo.d);

        int aa = 10;
    }
}
