package com.elyntsev.patterns.structural.flyweight;

public class App {

    public static void main(String[] args) {

        ObjectFactory objectFactory = new ObjectFactory();

        ObjectOnLine object = objectFactory.create(1);
        System.out.println(object.toString());
    }
}
