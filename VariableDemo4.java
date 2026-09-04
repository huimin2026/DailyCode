package variable;

public class VariableDemo4 {

    public static void main(String[] args){
        /*
            定义8种数据类型的变量：

            整数类型：byte、short、int、long
            浮点数类型：float、double
            字符类型：char
            布尔类型：boolean

            变量的定义格式：
                   数据类型 变量名 = 数据值；
         */

        // 1.定义byte类型的变量
        byte b = 127;
        System.out.println(b);

        // 2.定义short类型的变量
        short s = 32767;
        System.out.println(s);

        // 3.定义int类型的变量
        int i = 2147483647;
        System.out.println(i);

        // 4.定义long类型的变量
        //细节：long类型数据必须以L结尾，必须以f或者F结尾
        //建议：一般写成大写的
        long l = 9223372036854775807L;
        System.out.println(l);

        // 5.定义float类型的变量
        //细节：float类型数据必须以f或者F结尾
        //建议：一般写成大写的
        float f = 3.14f;
        System.out.println(f);

        // 6.定义double类型的变量
        double d = 3.14;
        System.out.println(d);

        // 7.定义char类型的变量
        char c = 'a';
        System.out.println(c);

        // 8.定义boolean类型的变量
        boolean bb = true;
        System.out.println(bb);
    }
}
