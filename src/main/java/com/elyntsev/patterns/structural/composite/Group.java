package com.elyntsev.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Unit {

    private final List<Unit> unitList = new ArrayList<>();

    void addUnit(Unit unit) {
        unitList.add(unit);
    }

    @Override
    public void move() {
        unitList.forEach(Unit::move);
    }
}
