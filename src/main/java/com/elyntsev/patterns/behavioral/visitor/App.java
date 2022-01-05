package com.elyntsev.patterns.behavioral.visitor;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Element> elements = Arrays.asList(new Brake(), new Engine(), new Transmission());

        Visitor visitor = new CarService();

        elements.forEach(element -> element.accept(visitor));

        Visitor visitorVip = new CarServiceVip();
        elements.forEach(element -> element.accept(visitorVip ));
    }
}
