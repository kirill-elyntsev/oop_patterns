package com.elyntsev.patterns.structural.flyweight;

public class ObjectFactory {

    private final HeavyCommonPart heavyCommonPart;

    public ObjectFactory() {
        this.heavyCommonPart = new HeavyCommonPart();
    }

    public ObjectOnLine create(int x){
        return new ObjectOnLine(x,heavyCommonPart);
    }
}
