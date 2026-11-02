package com.itheima.test7;

public abstract class Animal {
    /*定义抽象类 Animal：
• 成员属性：名字、颜色
• 成员方法：抽象方法 eat()，普通喝水方法 drink()
*/
    private String name;
    private String color;

    public Animal(){

    }
    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    //抽象方法 eat
    //alt + 回车：自动修复代码中的bug
    //好处1：让父亲不再纠结方法体到底写什么
    //好处2：强制子类必须重写该方法
    public abstract void eat();

    //普通方法 喝水
    public void drink(){
        System.out.println(name + "正在喝水");
    }


}
