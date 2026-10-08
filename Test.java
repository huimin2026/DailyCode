package com.itheima.ooptest8;

public class Test {
    public static void main(String[] args){
        /*在校学生有属性：姓名、年龄、身高、体重。
行为：学习。

实现以下需求
要求1：大一新生，张三，18岁，183cm，60kg，刚进大学努力学习。
要求2：大二期间张三体重增加了10kg
要求3：大三期间张三减肥成功，身高增加2cm，体重减少3kg
要求4：打印大学毕业之后，张三的所有信息*/

        //1.创建学生对象
        Student s =  new Student();
        //2.赋值
        s.setName("张三");
        s.setAge(18);
        s.setHeight(183);
        s.setWeight(60);

        //要求1：大一新生，张三，18岁，183cm，60kg，刚进大学努力学习。
        System.out.println(s.getName()+","+s.getAge()+","+s.getHeight()+","+s.getWeight());
        s.study();

        //要求2
        //隐藏的逻辑：年龄 +1
        s.setAge(s.getAge()+1);
        //大二期间张三体重增加了10kg
        s.setWeight(s.getWeight()+10);
        System.out.println(s.getName()+","+s.getAge()+","+s.getHeight()+","+s.getWeight());

        //要求3
        //大三期间张三减肥成功，身高增加2cm，体重减少3kg
        s.setAge(s.getAge()+1);
        s.setHeight(s.getHeight()+2);
        s.setWeight(s.getWeight()-3);
        System.out.println(s.getName()+","+s.getAge()+","+s.getHeight()+","+s.getWeight());

        //要求4 打印大学毕业之后，张三的所有信息
        s.setAge(s.getAge()+1);
        System.out.println(s.getName()+","+s.getAge()+","+s.getHeight()+","+s.getWeight());
    }
}
