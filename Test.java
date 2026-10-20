package com.itheima.oopextendstest8;

public class Test {
    public static void main(String[] args) {
        /*题目：带有继承结构的标准JavaBean类
需求：书写一个完整的继承体系，要求私有化成员变量、get/set方法、构造方法、其他的成员方法
各类信息
1. 本科学生
属性：姓名、年龄、年级
行为：吃饭、睡觉、学习（攻读学士学位）
2. 硕士研究生
属性：姓名、年龄、年级
行为：吃饭、睡觉、学习（攻读硕士学位）
补充：硕士研究生住宿条件升级，在豪华版学生公寓睡觉
3. 专业课老师
属性：姓名、年龄、学科
行为：吃饭、睡觉、教书（教专业课知识）
4. 通识课老师
属性：姓名、年龄
行为：吃饭、睡觉、教书（教通识课知识）*/

        //创建对象
        BachelorStudent bs = new BachelorStudent("张三", 20, "大三");
        System.out.println(bs.getName() + " " + bs.getAge() + " " + bs.getGrade()); // 输出：张三 20 大三
        bs.eat();
        bs.sleep();
        bs.study();

        // 创建硕士研究生对象
        MasterStudent ms = new MasterStudent("李四", 25, "硕士");
        System.out.println(ms.getName() + " " + ms.getAge() + " " + ms.getGrade());
        ms.eat();
        ms.sleep();
        ms.study();

        // 创建专业课老师对象
        MajorTeacher mt = new MajorTeacher("王老师", 35, "计算机");
        System.out.println(mt.getName() + " " + mt.getAge() + " " + mt.getSubject());
        mt.eat();
        mt.sleep();
        mt.teach();

        // 创建通识课老师对象
        GeneralTeacher gt = new GeneralTeacher("刘老师", 39, "通识课");
        System.out.println(gt.getName() + " " + gt.getAge() + " " + gt.getSubject());
        gt.eat();
        gt.sleep();
        gt.teach();
            }
        }
