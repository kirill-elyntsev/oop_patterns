package com.elyntsev.patterns.behavioral.state;

public class App {
    public static void main(String[] args) {

        BulbContext context = new BulbContext();

        context.performState();
        context.performState();
        context.performState();

    }
}
