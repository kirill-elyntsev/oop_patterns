package com.elyntsev.patterns.structural.proxy.lazy;

public interface HeavyObject {

    void init(String value);

    String getValue();

    boolean isInit();
}
