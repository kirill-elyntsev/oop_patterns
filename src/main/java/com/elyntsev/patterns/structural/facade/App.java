package com.elyntsev.patterns.structural.facade;

public class App {

    public static void main(String[] args) {

        HellSystemA systemA = new HellSystemA();
        HellSystemB systemB = new HellSystemB();

        Facade facade = new Facade(systemA, systemB);
        facade.simpleAction();
    }
}
