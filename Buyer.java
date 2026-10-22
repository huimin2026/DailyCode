package com.itheima.oopextendstest10;

public class Buyer extends AdminStaff {
    public Buyer() {

    }
    public Buyer(String id, String name) {
        super(id, name);
    }
    @Override
    public void work() {
        System.out.println("购买专员：购买办公用品");
    }
}
