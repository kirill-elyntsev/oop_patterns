package com.elyntsev.patterns.behavioral.strategy;

public class Taxi implements Strategy {
    @Override
    public void transportation() {
        System.out.println("На такси");
    }
}
