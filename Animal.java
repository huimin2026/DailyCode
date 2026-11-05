package com.itheima.test2;

public interface Animal {
    //抽象方法
    void run();

    //JDK8 默认方法
    default void drink(){
        prepare();
        System.out.println("动物喝水");
    }

    //JDK8 静态方法
    static void showTip(){
        baseMsg();
        System.out.println("动物是生物");
    }

    //JDK9 私有实例方法
    private void prepare(){
        System.out.println("找到水源");
    }

    //JDK9 私有静态方法
    private static void baseMsg(){
        System.out.println("生命活动");
    }

}
