package com.elyntsev.patterns.creational.singleton;

public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            System.out.println("lazy init");
            instance = new LazySingleton();
        }
        return instance;
    }
}
