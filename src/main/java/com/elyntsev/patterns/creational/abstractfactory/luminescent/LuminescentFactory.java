package com.elyntsev.patterns.creational.abstractfactory.luminescent;

import com.elyntsev.patterns.creational.abstractfactory.updated.AbstractFactory;
import com.elyntsev.patterns.creational.abstractfactory.updated.Bulb;
import com.elyntsev.patterns.creational.abstractfactory.updated.Lampholder;

public class LuminescentFactory implements AbstractFactory {

    @Override
    public Bulb createBulb() {
        return new BulbLuminescent();
    }

    @Override
    public Lampholder createLampHolder() {
        return new LampholderLuminescent();
    }
}
