package com.elyntsev.patterns.behavioral.command;

public class Echo implements Command {

    @Override
    public String execute(String data) {
        return data;
    }
}
