package com.elyntsev.patterns.creational.factorymethod;

public class App {

    public static void main(String[] args) {

        Configuration config;

        config = ConfigurationFactory.getConfiguration("file");
        System.out.println(config.params());

        config = ConfigurationFactory.getConfiguration("db");
        System.out.println(config.params());
    }
}
