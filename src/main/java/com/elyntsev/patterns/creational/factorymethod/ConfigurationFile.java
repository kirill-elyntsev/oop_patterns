package com.elyntsev.patterns.creational.factorymethod;

public class ConfigurationFile implements Configuration{
    @Override
    public String params() {
        return "params from file";
    }
}
