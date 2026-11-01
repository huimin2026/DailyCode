package com.itheima.test6;

public class Test {
    public static void main(String[] args){
        /*1. 父类：Phone，有call()方法，输出：手机可以打电话

2. 子类：HuaWei、XiaoMi，分别重写call()

◦ HuaWei的call：华为手机高清通话

◦ XiaoMi的call：小米手机极速通话

3. 写一个Person类，里面有方法 usePhone(Phone p)，调用p.call()

4. 测试类，用多态写法，让人分别使用两款手机*/

        Phone p1 = new HuaWei();
        Phone p2 = new XiaoMi();

        Person person = new Person();
        person.UsePhone(p1);
        person.UsePhone(p2);
    }
}
