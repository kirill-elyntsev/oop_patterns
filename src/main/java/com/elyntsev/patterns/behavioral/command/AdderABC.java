package com.elyntsev.patterns.behavioral.command;

public class AdderABC implements Command {
    @Override
    public String execute(String data) {
        return data + " ABC";
    }
}
