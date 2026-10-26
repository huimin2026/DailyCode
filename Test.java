package com.itheima.oopextendstest14;

public class Test {
    public static void main(String[] ags){
        /*定义父类Person，里面包含：
1. private String id（私有成员变量）
2. public String name（公开成员变量）
3. protected int age（受保护成员变量）
4. static String nation = "中国"（静态成员变量）
5. private void secret()（私有方法）
6. public void sayHello()（公开方法）
7. 无参构造方法 Person()
再定义子类Student继承Person，在测试类中尝试访问各个成员，思考：
① 哪些成员子类可以直接继承、直接访问？
② 哪些不能直接访问？
③ 构造方法会不会被继承？
④ private的变量在子类对象里面存在吗？
*/

        Student student = new Student();
        student.testVisit();
    }
}
