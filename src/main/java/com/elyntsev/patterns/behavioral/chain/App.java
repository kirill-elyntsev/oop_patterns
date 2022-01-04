package com.elyntsev.patterns.behavioral.chain;

public class App {
    public static void main(String[] args) {

        Application application = new Application();

        ApplProcessor input = new ApplicationInput();
        ApplProcessor reader = new ApplicationReader();
        ApplProcessor result = new ApplicationResult();


        input.setNext(reader);
        reader.setNext(result);

        input.process(application);
        application.printHistory();
    }
}
