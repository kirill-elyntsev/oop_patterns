package com.elyntsev.patterns.creational.abstractfactory.updated;

import com.elyntsev.patterns.creational.abstractfactory.led.LedFactory;
import com.elyntsev.patterns.creational.abstractfactory.luminescent.LuminescentFactory;

public class App {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = configuration("Led");
        execute(abstractFactory);
        abstractFactory = configuration("Luminescent");
        execute(abstractFactory);
    }

    public static void execute(AbstractFactory abstractFactory) {
        Bulb bulb = abstractFactory.createBulb();
        Lampholder lampholder = abstractFactory.createLampHolder();
        bulb.light();
        lampholder.hold();
    }

    public static AbstractFactory configuration(String name) {
        if ("Led".equals(name)) {
            return new LedFactory();
        }
        if ("Luminescent".equals(name)) {
            return new LuminescentFactory();
        }
        throw new IllegalArgumentException("unknow param" + name);
    }
}
