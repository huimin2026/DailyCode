package oopextendstest7;

public class Test {
    public static void main(String[] args) {
        /*按照下面的需求书写一个JavaBean
学生：
属性：姓名、年龄
当我们在学校里面不认识一个同学的时候，都会称呼对方：同学，所以现在认为学生的默认名字为：同学，默认年龄为18岁
需求要点：
1. 学生类，成员变量：姓名name，年龄age
2. 无参构造：默认姓名=同学，默认年龄=18
3. 有参构造：可以手动传入姓名、年龄
4. JavaBean规范：私有成员变量，get、set方法*/
        Student stu = new Student();
        System.out.println(stu.name + " " + stu.age);
    }
}
