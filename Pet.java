package com.itheima.test2;

public interface Pet {
    default void drink(){
        System.out.println("宠物喝温水");
    }
}
