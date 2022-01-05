package com.elyntsev.patterns.behavioral.visitor;

public interface Element {
    void accept(Visitor v);
}
