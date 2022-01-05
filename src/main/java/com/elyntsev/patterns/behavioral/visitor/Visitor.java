package com.elyntsev.patterns.behavioral.visitor;

public interface Visitor {

    void visit(Engine item);

    void visit(Transmission item);

    void visit(Brake item);
}
