package com.springdemo;

// @Component
public class Tea implements HotDrink {
    @Override
    public void prepareDrink() {
        System.out.println("Preparing tea");
    }
}
