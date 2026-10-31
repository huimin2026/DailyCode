package com.itheima.test5;

public class Person {
    //属性：姓名、年龄
    private String name;
    private int age;

    public Person(){

    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //获取姓名
    public String getName() {
        return name;
    }
    //设置姓名
    public void setName(String name) {
        this.name = name;
    }
    //获取年龄
    public int getAge() {
        return age;
    }
    //设置年龄
    public void setAge(int age) {
        this.age = age;
    }

    //饲养动物方法：
    public void KeepPet(Animal pet, String something){
        System.out.println("饲养员：" + name + "开始喂动物");
        //调用pet的eat方法
        pet.eat(something);

        //判断是狗，强转，调用lookHome方法
        if(pet instanceof Dog){
            Dog dog = (Dog)pet;
            dog.lookHome();
        }
        //判断是猫，强转，调用catchMouse方法
        else if(pet instanceof Cat){
            Cat cat = (Cat)pet;
            cat.catchMouse();
        }
    }
}
