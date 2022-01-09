package com.elyntsev.patterns.creational.builder;

public class App {

    public static void main(String[] args) {

        BigObject bigObject = new BigObject.BigObjectBuilder("1")
                .withParam2("2")
                .withParam3("3")
                .withParam4("4")
                .withParam5("5")
                .build();
        System.out.println(bigObject);
    }
}
