package com.elyntsev.patterns.behavioral.strategy;

public class Car implements Strategy{
    @Override
    public void transportation() {
        System.out.println("На машине");
    }
}
