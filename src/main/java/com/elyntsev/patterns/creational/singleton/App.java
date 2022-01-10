package com.elyntsev.patterns.creational.singleton;

public class App {

    public static void main(String[] args) {

        FirstSingleton firstSingleton = FirstSingleton.getInstance();
        System.out.println(firstSingleton);
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}
