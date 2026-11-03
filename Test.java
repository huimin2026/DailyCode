package com.itheima.test1;

public class Test {
    public static void main(String[] args) {
        /*题目
定义三个动物类：青蛙Frog、狗Dog、兔子Rabbit
共同属性：名字、颜色
各自行为：
• 青蛙：吃虫子、蛙泳
• 狗：吃骨头、狗刨
• 兔子：吃胡萝卜*/

        // 创建对象
        Frog f = new Frog("青蛙", "绿色");
        System.out.println(f.getName() + " " + f.getColor());
        f.eat();
        f.swim();
        Dog d = new Dog("狗", "棕色");
        System.out.println(d.getName() + " " + d.getColor());
        d.eat();
        d.swim();
        Rabbit r = new Rabbit("兔子", "白色");
        System.out.println(r.getName() + " " + r.getColor());
        r.eat();
    }
}
