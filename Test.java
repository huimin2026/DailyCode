package com.itheima.a05interfacedemo5;

public class Test {
    /*乒乓球运动员：姓名，年龄  学打乒乓球 说英语
      篮球运动员：姓名，年龄  学打篮球
      乒乓球教练：姓名，年龄  教打乒乓球 说英语
      篮球教练：姓名，年龄  教打篮球*/
    public static void main(String[] args) {

        //创建运动员或教练对象
        PingPangSporter pps = new PingPangSporter("张三", 18);
        pps.study();
        pps.speakEnglish();

        BasketballSporter bbs = new BasketballSporter("李四", 20);
        bbs.study();

        BasketballCoach bc = new BasketballCoach("王五", 30);
        bc.teach();

        PingPangCoach pc = new PingPangCoach("赵六", 25);
        pc.teach();
        pc.speakEnglish();
    }
}
