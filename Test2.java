package com.itheima.a04test;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        /*题目
需求：定义一个集合，添加一些学生对象。学生类属性：id、姓名、年龄。
要求：
1. 遍历集合，将所有学生的属性打印在控制台上，每个学生一行。
2. 定义一个方法，根据 id 查找学生的信息。存在返回索引；不存在返回 -1。*/

        //1.创建集合对象
        ArrayList<Student>list = new ArrayList<>();

        //2.创建一些学生对象
        Student s1 = new Student("001", "张三", 18);
        Student s2 = new Student("002", "李四", 19);
        Student s3 = new Student("003", "王五", 20);

        //3.添加到集合
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //4.遍历集合，将所有学生的属性打印在控制台上，每个学生一行。
        for(int i = 0;i<list.size();i++){
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge());
        }

        //5.查找对应的id
        int index = findStudent(list, "002");
        System.out.println(index);

    }
    public static int findStudent(ArrayList<Student> list, String id){
        for(int i = 0; i < list.size(); i++){
            Student stu = list.get(i);
            if(stu.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
