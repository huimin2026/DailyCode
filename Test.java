package com.itheima.oopextendstest9;

public class Test {
    public static void main(String[] args) {
        /*1.经理
        成员变量：工号，姓名，工资，管理奖金
        成员方法：工作（管理其他人），吃饭（吃米饭）

        2.厨师
        成员变量：工号，姓名，工资
        成员方法：工作（做饭），吃饭（吃米饭）*/

        //创建经理对象：工号001，姓名张经理，工资8000，奖金2000
        Manager m = new Manager("001", "张经理", 8000, 2000);
        //调用经理的工作方法,吃饭方法（继承来的）
        m.work();
        m.eat();

        //创建厨师对象：工号002，姓名张厨师，工资5000
        Cook c = new Cook("002", "张厨师", 5000);
        //调用厨师的工作方法
        c.work();
        //调用吃饭方法（继承来的）
        c.eat();
    }
}
