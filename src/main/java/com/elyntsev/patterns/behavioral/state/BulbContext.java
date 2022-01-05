package com.elyntsev.patterns.behavioral.state;

public class BulbContext {

    private State state = StateProvider.getOffState();

    void performState() {
        setState(state.action());
    }

    void setState(State state) {
        this.state = state;
    }

}
