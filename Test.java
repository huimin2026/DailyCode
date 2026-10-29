package com.itheima.test2;

public class Test {
    /*题目：
    定义父类Animal，有成员变量name、方法show()；
    定义子类Cat，继承自Animal，重写show()方法；
    用多态写法Animal a = new Cat();    观察变量和方法的访问规则*/

    public static void main(String[] args) {
       //多态写法：父类引用指向子类对象
        //左边Animal：编译类型（看左边）
        //右边new Cat():运行类型（看右边）
        Animal a = new Cat();

        //多态访问成员变量：编译看左边，运行看左边
        //会找父类Animal里面的name
        System.out.println(a.name);

        //多态访问成员变量的方法：编译看左边，运行看右边
        //找子类重写后的show方法
        a.show();
    }

}
