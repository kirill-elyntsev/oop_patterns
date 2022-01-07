package com.elyntsev.patterns.structural.decorator;

public class DataSourceImpl implements DataSource{
    @Override
    public int getInteger() {
        return 42;
    }
}
