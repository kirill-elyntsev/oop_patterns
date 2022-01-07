package com.elyntsev.patterns.structural.composite;

public class App  {

    public static void main(String[] args) {

        Group group = new Group();

        group.addUnit(new Marine());
        group.addUnit(new Tank());
        group.move();
    }
}
