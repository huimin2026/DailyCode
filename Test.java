package com.itheima.a01innerclassdemo3;

public class Test {
    /*1. 定义外部类 School
2. 在里面写静态内部类 Student，静态内部类里面写一个方法 show()，打印：我是静态内部类的学生
3. 定义一个接口 Study，里面有抽象方法 void learn();
4. 在main方法中：
◦ 方式1：创建静态内部类对象，调用show()
◦ 方式2：使用匿名内部类实现Study接口，重写learn方法，打印正在学习Java内部类*/
    public static void main(String[] args) {
        //=========静态内部类使用==========
        //静态内部类创建对象格式：外部类。静态内部类  对象名 = new 外部类.静态内部类（）；
        //重点：不需要先new外部类
        School.Studet stu = new School.Studet();
        stu.show();

        //=================匿名内部类使用==========
        //匿名内部类：没有名字，一次性使用，直接实现接口
        //格式：接口 变量 = new 接口（）{重写抽象方法}；
        Study s = new Study(){
            @Override
            public void learn() {
                System.out.println("正在学习Java内部类");
            }
        };
        s.learn();
    }
}
