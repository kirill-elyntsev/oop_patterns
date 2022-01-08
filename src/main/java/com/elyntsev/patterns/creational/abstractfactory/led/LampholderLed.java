package com.elyntsev.patterns.creational.abstractfactory.led;

import com.elyntsev.patterns.creational.abstractfactory.updated.Lampholder;

public class LampholderLed implements Lampholder {
    @Override
    public void hold() {
        System.out.println("Led hold");
    }
}
