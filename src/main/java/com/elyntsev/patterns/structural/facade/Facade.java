package com.elyntsev.patterns.structural.facade;

public class Facade {

    private final HellSystemA hellSystemA;
    private final HellSystemB hellSystemB;

    public Facade(HellSystemA hellSystemA, HellSystemB hellSystemB) {
        this.hellSystemA = hellSystemA;
        this.hellSystemB = hellSystemB;
    }

    void simpleAction(){
        hellSystemA.actionA();
        hellSystemA.secondActionA();
        hellSystemB.actionB();
        hellSystemB.secondActionB();
    }
}
