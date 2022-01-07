package com.elyntsev.patterns.structural.flyweight;

public class ObjectOnLine {

    private final int x;
    private final HeavyCommonPart heavyCommonPart;

    public ObjectOnLine(int x, HeavyCommonPart heavyCommonPart) {
        this.x = x;
        this.heavyCommonPart = heavyCommonPart;
    }

    @Override
    public String toString() {
        return "ObjectOnLine{" +
                "x=" + x +
                ", heavyCommonPart=" + heavyCommonPart +
                '}';
    }
}
