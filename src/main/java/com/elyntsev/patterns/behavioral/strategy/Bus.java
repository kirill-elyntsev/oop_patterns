package com.elyntsev.patterns.behavioral.strategy;

public class Bus implements Strategy{
    @Override
    public void transportation() {
        System.out.println("На автобусе");
    }
}
