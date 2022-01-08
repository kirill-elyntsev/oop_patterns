package com.elyntsev.patterns.creational.abstractfactory.led;

import com.elyntsev.patterns.creational.abstractfactory.updated.AbstractFactory;
import com.elyntsev.patterns.creational.abstractfactory.updated.Bulb;
import com.elyntsev.patterns.creational.abstractfactory.updated.Lampholder;

public class LedFactory implements AbstractFactory {
    @Override
    public Bulb createBulb() {
        return new BulbLed();
    }

    @Override
    public Lampholder createLampHolder() {
        return new LampholderLed();
    }
}
