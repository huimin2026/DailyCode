package com.itheima.a01innerclassdemo2;

public class House {
    //外部类私有成员变量：房子地址
    private String address;

    //外部类构造方法，给地址赋值
    public House(String address){
        this.address = address;
    }

    //外部类普通方法：打印房子地址
    public void showHouse(){
        System.out.println("房子地址是：" + address);
    }

    //=========成员内部类：定义在外部类里面，和成员变量同级==========
    public class Room{
        //内部类私有变量：房间名字
        private String roomName;

        //内部类构造方法，给房间名赋值
        public Room(String roomName){
            this.roomName = roomName;
        }

        //内部类方法：同时打印房子地址+房间名
        //重点：成员内部类可以直接访问外部类的私有成员address
        public void showInfo(){
            System.out.println("房子地址是：" + address + ", 房间名字是：" + roomName);
        }
    }
}
