package com.elyntsev.patterns.creational.abstractfactory.led;

import com.elyntsev.patterns.creational.abstractfactory.updated.Bulb;

public class BulbLed implements Bulb {
    @Override
    public void light() {
        System.out.println("led light");
    }
}
