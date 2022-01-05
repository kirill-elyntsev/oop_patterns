package com.elyntsev.patterns.behavioral.strategy;

public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void applyStrategy(){
        strategy.transportation();
    }
}
