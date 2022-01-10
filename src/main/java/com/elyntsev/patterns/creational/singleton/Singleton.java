package com.elyntsev.patterns.creational.singleton;

public class Singleton {

    private Singleton() {
    }

    static Singleton getInstance() {
        System.out.println("getInstance");
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {

        static {
            System.out.println("init SingletonHolder");
        }

        static final Singleton instance = new Singleton();
    }
}
