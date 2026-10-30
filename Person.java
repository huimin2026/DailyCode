package com.itheima.test3;

public class Person {
    /*人Person：
属性：名字，年龄，性别
行为：行驶交通工具（能使用所有交通工具）*/
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Person(){

    }

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //行为：行驶交通工具（能使用所有交通工具）
    public void drive(Vehicle vehicle){
        //表示当前的交通工具正在行驶
        vehicle.move();
        //响铃、鸣笛
        //判断一下传递过来的是不是自行车
        if(vehicle instanceof Bicycle){
            Bicycle b = (Bicycle)vehicle;
            b.ringBell();
        }else if(vehicle instanceof Car){
            Car c = (Car)vehicle;
            c.honk();
        }else{
            System.out.println("没有这个交通工具");
        }
    }
}
