package com.itheima.oopextendstest13;

public class Express {
    private String id;      //单号
    private int weight;     //重量
    private String receiver;    //收件人

    //无参构造
    public Express(){

    }

    //有参构造
    public Express(String id,int weight,String receiver){
        this.id = id;
        this.weight = weight;
        this.receiver = receiver;
    }

    //计算运费：每公斤10元
    public int calculateMoney(){
        return weight*10;
    }

    //getter setter
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public String getReceiver(){
        return receiver;
    }
    public void setReceiver(String receiver){
        this.receiver = receiver;
    }
}
