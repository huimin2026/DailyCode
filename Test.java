package com.itheima.oopextendstest11;

public class Test {
    public static void main(String[] args){
        /*
业务场景：餐厅菜品系统的继承体系构建
1. 热菜
属性：菜名、价格、口味、烹饪时间
行为：菜品介绍（示例："热菜水煮鱼，价格88元，口味麻辣，烹饪时间20分钟，适合重口味食客"）
2. 凉菜
属性：菜名、价格、口味、保质期
行为：菜品介绍（示例："凉菜拍黄瓜，价格10元，口味酸辣，保质期30分钟，适合所有食客"）*/

        HotDish hd = new HotDish("水煮鱼", 88, "麻辣", 20);
        hd.show();
        ColdDish cd = new ColdDish("拍黄瓜", 10, "酸辣", 30);
        cd.show();
    }
}
