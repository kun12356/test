package com.rrg.myshop.entity.testFactory;

public class Demo {
    public static void main(String[] args) throws Exception {
        fruit apple = Factory.get("bannle");
        System.out.println(apple);
    }
}
