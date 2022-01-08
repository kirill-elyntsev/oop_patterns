package com.elyntsev.patterns.creational.abstractfactory.luminescent;

import com.elyntsev.patterns.creational.abstractfactory.updated.Lampholder;

public class LampholderLuminescent implements Lampholder {
    @Override
    public void hold() {
        System.out.println("Luminescent hold");
    }
}
