package com.elyntsev.patterns.behavioral.observer;

public class ConsumerB {

    Listener listener = data -> System.out.println("ConsumerB data:" + data);

    public Listener getListener() {
        return listener;
    }
}
