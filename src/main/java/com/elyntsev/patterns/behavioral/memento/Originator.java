package com.elyntsev.patterns.behavioral.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class Originator {

    private final Deque<Memento> stack = new ArrayDeque<>();

    void saveState(State state) {
        stack.push(new Memento(state));
    }

    State restoreState() {
        return stack.pop().getState();
    }
}
