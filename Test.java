package com.itheima.oopextendstest12;

public class Test {
    public static void main(String[] args) {
        /*题目：继承的作业4（电商项目）
业务场景：
某电商平台需要管理商品，基础商品包含名称、价格
行为：showInfo() 展示所有的属性
要求子类按照要求，扩展特有属性
1. 电子产品：
增加品牌、型号
行为：打印名称，价格，品牌，型号等所有属性
2. 服装：
增加尺寸、颜色
行为：打印名称，价格，尺寸，颜色等所有属性*/

        //创建电子产品对象
        Electronic e = new Electronic("华为", "Mate40", "手机", 5999);
        e.showInfo(); // 调用电子产品对象的showInfo方法
        //创建服装对象
        Clothes c = new Clothes("M", "红色");
        c.showInfo(); // 调用服装对象的showInfo方法

    }
}
