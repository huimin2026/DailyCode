package com.itheima.oopextendstest14;

public class Student extends Person{
        public Student(){
            // 子类构造第一行默认隐藏super()，调用父类构造；父类构造不是继承过来的！
            super();
        }

        public void testVisit(){
            // name是public ✅ 继承，可以直接访问
            name = "小明";
            System.out.println(name);

            // id是private ❌ 编译报错！子类不能直接访问
            // id = "001";

            // secret()私有方法 ❌ 编译报错，不能直接调用
            // secret();

            // sayHello() public ✅ 继承，可以直接调用
            sayHello();

            // 如果想用私有id，只能通过父类提供的public方法间接操作
            setId("001");
            System.out.println(getId());
        }
    }
