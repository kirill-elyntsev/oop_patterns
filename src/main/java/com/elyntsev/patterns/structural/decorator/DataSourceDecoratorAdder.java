package com.elyntsev.patterns.structural.decorator;

public class DataSourceDecoratorAdder implements DataSource {

    private final DataSource dataSource;

    public DataSourceDecoratorAdder(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public int getInteger() {
        return dataSource.getInteger() + 10;
    }
}
