package com.elyntsev.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class EventProducer {

    private final List<Listener> listenerList = new ArrayList<>();

    void addListener(Listener listener) {
        listenerList.add(listener);
    }

    void removeListener(Listener listener) {
        listenerList.remove(listener);
    }

    void event(String data) {
        listenerList.forEach(listener -> listener.onUpdate(data));
    }
}
