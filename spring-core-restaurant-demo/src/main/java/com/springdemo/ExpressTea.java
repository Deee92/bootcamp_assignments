package com.springdemo;

// @Component
public class ExpressTea implements HotDrink {
    @Override
    public void prepareDrink() {
        System.out.println("Preparing express tea");
    }
}
