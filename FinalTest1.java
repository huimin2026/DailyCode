package com.itheima.finalTest;

public class FinalTest1 {
    public static void main(String[] args) {
//        final 修饰变量，此时叫做常量
        /*点1：只能被赋值一次，一旦赋值，无法再次修改
        特点2：常量名通常使用大写，单词之间用下划线连接

        细节：
        基本数据类型：
        byte short int long float double char boolean
                变量里面记录的是真实的数据
        final int a = 10; 此时变量里面记录的数据无法发生改变
        引用数据类型：
        除了上面四类八种，其他所以的数据类型都是引用数据类型
        int[] Student Teacher...
        stu里面的记录对象的内存地址，不可改变的是stu记录的内存地址
        而对象里面的属性值，是可以发生改变
        final Student stu = new Student();

        综上所述：
        final修饰哪个变量这个变量里面记录的内容就无法再次发生改变*/
        final int NUMBER = 100;
        System.out.println(NUMBER);
    }

    }



