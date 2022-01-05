package com.elyntsev.patterns.behavioral.visitor;

public class CarServiceVip implements Visitor{
    @Override
    public void visit(Engine item) {
        System.out.println("VIP " + item.checkEngine());
    }

    @Override
    public void visit(Transmission item) {
        System.out.println("VIP " + item.refreshOil());
    }

    @Override
    public void visit(Brake item) {
        System.out.println("VIP " + item.replaceBrakePad());
    }
}
