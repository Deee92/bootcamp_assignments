package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;

// @Component
public class Restaurant {
    @Autowired
    HotDrink hotDrink;

//    @Autowired
//    com.springdemo.Restaurant(com.springdemo.HotDrink hotDrink) {
//        this.hotDrink = hotDrink;
//    }

//    @Required
//    @Autowired
//    public void setHotDrink(com.springdemo.HotDrink hotDrink) {
//        this.hotDrink = hotDrink;
//    }
    
    public HotDrink getHotDrink() {
        return hotDrink;
    }
}
