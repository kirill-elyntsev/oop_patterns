package com.elyntsev.patterns.creational.abstractfactory.luminescent;

import com.elyntsev.patterns.creational.abstractfactory.updated.Bulb;

public class BulbLuminescent implements Bulb {
    @Override
    public void light() {
        System.out.println("Luminescent light");
    }
}
