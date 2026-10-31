package com.itheima.test5;

public class Test {
    public static void main(String[] args) {
        /*
1. 定义狗类
属性：年龄，颜色
行为：eat(String something)（something表示吃的东西）
看家lookHome方法(无参数)
2. 定义猫类
属性：年龄，颜色
行为：eat(String something)方法(something表示吃的东西)
逮老鼠catchMouse方法(无参数)
3. 定义Person饲养员类
属性：姓名，年龄
行为：饲养动物keepPet(Dog dog,String something)方法*/

        //创建饲养员
        Person person = new Person("张三", 20);

        //多态写法
        Animal dog = new Dog("金毛", 2);
        Animal cat = new Cat("橘色", 1);

        //喂狗，食物骨头
        person.KeepPet(dog, "骨头");
        //喂猫，食物鱼
        person.KeepPet(cat, "鱼");
    }
}
