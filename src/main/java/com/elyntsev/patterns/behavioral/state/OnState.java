package com.elyntsev.patterns.behavioral.state;

public class OnState implements State {

    @Override
    public State action() {
        System.out.println("Лампа светит");
        return StateProvider.getOffState();
    }
}
