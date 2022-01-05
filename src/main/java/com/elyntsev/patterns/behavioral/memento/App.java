package com.elyntsev.patterns.behavioral.memento;


public class App {

    public static void main(String[] args) {

        Originator originator = new Originator();
        State abc = new State(new String[]{"A", "B", "C"});
        originator.saveState(abc);
        System.out.println(abc);
        abc.getArray()[0] = "A1";
        System.out.println(abc);
        abc = originator.restoreState();
        System.out.println(abc);
    }
}
