package com.itheima.oopextendstest4;

public class Test {
    public static void main(String[] args) {
        /*练习：方法重写的练习（手机版本升级）
背景：
在手机的发展历史中，第一代手机功能比较单一，只能用来打电话，比如在电视中经常见到的大哥大。
随着第二代数字移动通信系统（2G）的发展，手机体积逐渐变小，开始具备短信，彩信，基本功能。
进入到21世纪，主要是2009年左右，智能手机开始普及。按照这个背景设计手机的Javabean类。

第一代手机：
功能：打电话

第二代手机：
功能：打电话，发短信

第三代手机：
功能：打电话升级为视频通话，发短信，玩游戏*/

        //创建第一代手机的对象
        FirstGenerationPhone phone1 = new FirstGenerationPhone();
        phone1.call();

        //创建第二代手机的对象
        SecondGenerationPhone phone2 = new SecondGenerationPhone();
        phone2.call();
        phone2.sendMessge();

        //创建第三代手机的对象
        ThirdGenerationPhone phone3 = new ThirdGenerationPhone();
        phone3.call();
        phone3.sendMessge();
        phone3.playGame();
    }
}
