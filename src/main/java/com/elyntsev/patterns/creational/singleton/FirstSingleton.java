package com.elyntsev.patterns.creational.singleton;

public class FirstSingleton {

    private static FirstSingleton instance = new FirstSingleton();

    private FirstSingleton() {
    }

    public static FirstSingleton getInstance() {
        return instance;
    }
}
