package com.elyntsev.patterns.behavioral.command;

public class App {

    public static void main(String[] args) {

        Executor executor = new Executor();

        executor.addCommand(new AdderABC());
        executor.addCommand(new Echo());

        executor.executeCommands();
        executor.addCommand(String::toUpperCase);
    }
}
