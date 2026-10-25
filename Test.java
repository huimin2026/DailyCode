package com.itheima.oopextendstest13;

public class Test {
    public static void main(String[] args) {

    /*题目：继承的作业5（物流快递运费计算）
业务场景：
快递公司需要计算运费，基础快递包含：单号String、重量int、收件人String
行为：计算快递费（计算规则：每公斤10元，不需要考虑小数部分）
有两个子类继承基础快递：
1. 同城速递：重写计算快递费方法，在基础运费上加10元
2. 异地空运：重写计算快递费方法，在基础运费上加15元*/

        //基础快递
        Express e1 = new Express("001", 1, "张三" );
        System.out.println(e1.calculateMoney());

        //同城速递
        SameCityExpress e2 = new SameCityExpress( );
        e2.setId("K002");
        e2.setWeight(2);
        e2.setReceiver("李四");
        System.out.println(e2.calculateMoney());

        //异地空运
        AirExpress e3 = new AirExpress();
        e3.setId("A003");
        e3.setWeight(3);
        e3.setReceiver("王五");
        System.out.println(e3.calculateMoney());
    }
}
