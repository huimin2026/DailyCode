package com.itheima;

public class oopextendstest3 {
        public static void main(String[] args) {
            Zi z = new Zi();
            z.ziShow();
        }
    }

    //父类 Fu
    class Fu {
        String name = "Fu";
        String address = "南京";
    }

    //子类 Zi 继承 Fu
    class Zi extends Fu {
        String name = "Zi";

        public void ziShow() {
            // 1.输出 Zi
            System.out.println(name);
            // 2.输出 Fu
            System.out.println(super.name);
            // 3.输出 南京
            System.out.println(super.address);
            System.out.println(this.address);
            System.out.println(address);
        }
    }
