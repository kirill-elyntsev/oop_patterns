package com.elyntsev.patterns.behavioral.state;

public class OffState implements State {

    @Override
    public State action() {
        System.out.println("Темно");
        return StateProvider.getOnState();
    }
}
