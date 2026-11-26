package com.itheima.ui;

import com.itheima.domain.User;

import java.lang.classfile.instruction.SwitchCase;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    //这个方法表示的就是登录注册的主页面（是以控制台的形式进行展示的）

    public void start(){
        System.out.println("游戏的登录注册页面");

        ArrayList<User> list = new ArrayList<>();

        while (true) {
            System.out.println("欢迎来到文字格斗游戏");
            System.out.println("请选择操作：1.登录 2.注册 3.退出");

            Scanner sc = new Scanner(System.in);
            String choose = sc.next();

            switch (choose){
                case "1"-> login(list);
                case "2"-> register(list);
                case "3"-> {
                    System.out.println("用户选择了退出操作");
                    System.exit(0);
                }
                default -> System.out.println("输入有误，请重新选择");
            }
        }
    }

    //登录操作
    public void login(ArrayList<User> list){
        System.out.println("用户选择了登录操作");
    }

    //注册操作
    public void register(ArrayList<User> list){
        System.out.println("用户选择了注册操作");
        //什么叫做注册？
        // 键盘录入用户名 密码，----->User对象  --->集合

        //1.创建User对象（空参）
        User u = new User();

        //2.键盘录入用户名
        //   校验用户名是否符合要求
        //   u.setUsername();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户名：");
            String username = sc.next();

            //1.长度必须在3~16位
            if(!checkLen(3,6,username)){
                System.out.println("用户名的长度不符合要求，必须是3~16位之间");
                continue;
            }
            //2.只能由字母、数字组成，不能是纯数字
            if(!checkUsername(username)){
                System.out.println("用户名的只能由字母、数字组成，不能是纯数字");
                continue;
            }
            //3.用户名唯一
            if(contain(list,username)){
                System.out.println("用户名已经存在，请重新输入");
                continue;
            }

            //当代码执行到这里，表示用户名username长度，内容，符合要求，而且是唯一的
            u.setUsername(username);
            break;
        }
        //3.键盘录入密码
        while (true) {
            System.out.println("请输入密码：");
            String password1 = sc.next();
            System.out.println("请再次输入密码：");
            String password2 = sc.next();

            //长度3~8位
            if(!checkLen(3,8,password1)){
                System.out.println("密码长度不符合要求，必须是3~8之间");
                continue;
            }
            //只能是字母加数字的组合，不能有其他字母
            if(!checkPassword(password1)){
                System.out.println("密码只能是字母加数字组合，不能有其他字母");
                continue;
            }
            //校验两次密码输入是否一致
            if(!password1.equals(password2)){
                System.out.println("两次密码输入不一样，请重新输入~");
                continue;
            }
            //把密码设置到对象当中
            u.setPassword(password1);
            break;
        }
    }

    //作用：判断用户名在集合当中是否包含
    public boolean contain(ArrayList<User> list,String username){
        for(int i=0;i<list.size();i++){
            User u = list.get(i);
            if(u.getUsername().equals(username)){
                return  true;
            }
        }
        return false;
    }



    //统计字符串中，字母，数字，其他字符分别有多少个？
    public int[] getCount(String userInfo) {
        int charCount = 0;
        int numCount = 0;
        int otherCount = 0;

        for (int i = 0; i < userInfo.length(); i++) {
            char c = userInfo.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                charCount++;
            } else if (c >= '0' && c <= '9') {
                numCount++;
            } else {
                otherCount++;
            }
        }
        return new int[]{charCount, numCount, otherCount};
    }

    //校验用户名是否符合要求
    public boolean checkUsername(String username) {

        //判断：不能有别的符号，并且至少包含字母
        int[] arr = getCount(username);
        return  arr[0]> 0&&arr[1]>=0&&arr[2]==0;
    }

    //作用：校验密码是否符合要求
    public boolean checkPassword(String password){
        int[] arr = getCount(password);
        return  arr[0]> 0&&arr[1]>0&&arr[2]==0;
    }


        //作用：判断字符串长度是否在指定的范围之内
        public boolean checkLen ( int minLen, int maxLen, String str){
            return str.length() >= minLen && str.length() <= maxLen;
        }
    }
