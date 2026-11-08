package com.itheima.a01innerclassdemo4;

public class Test {
    public static void main(String[] args) {
        /*📝 练习题（只考匿名内部类）
需求：
1. 定义一个接口 Game，里面有抽象方法 void play();
2. 在测试类的main方法里面，用匿名内部类实现这个接口
3. 重写play方法，控制台输出：开心地玩游戏啦
4. 最后调用play()方法执行
*/

        //匿名内部类，实现Game接口
        Game g = new Game(){
            //重写接口里面的抽象方法
            @Override
            public void play() {
                System.out.println("开心地玩游戏啦");
            }
        };
        //调用方法
        g.play();
    }
}
