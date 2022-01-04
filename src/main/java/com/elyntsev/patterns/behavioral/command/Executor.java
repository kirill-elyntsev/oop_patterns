package com.elyntsev.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Executor {

    private final List<Command> commandList = new ArrayList<>();

    void addCommand(Command command){
        commandList.add(command);
    }

    void executeCommands(){
        commandList.stream().map(command -> command.execute("value"))
                .forEach(System.out::println);
    }
}
