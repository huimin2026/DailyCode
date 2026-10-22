package com.itheima.oopextendstest10;

public class Test {
    public static void main(String[] args) {
        /*
黑马程序员公司里有很多员工（Employee），按工作内容分为教研部员工(Teacher)和行政部员工(AdminStaff)：
1. 教研部按教学方式，分为讲师(Lecturer)和助教(Tutor)
2. 行政部按负责事项，分为维护专员(Maintainer)、采购专员(Buyer)
3. 每个员工都有：编号、姓名、工作功能
4. 每个员工都有work工作方法，但具体工作内容不一样
要求：使用继承完成该需求。*/
        //讲师
        Lecturer l = new Lecturer("001", "张讲师");
        l.work();
        //助教
        Tutor t = new Tutor("002", "张助教");
        t.work();
        //维护专员
        Maintainer m = new Maintainer("003", "张维护专员");
        m.work();
        //购买专员
        Buyer b = new Buyer("004", "张购买专员");
        b.work();
    }
}
