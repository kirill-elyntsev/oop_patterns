package com.elyntsev.patterns.creational.factorymethod;

public class ConfigurationDb implements Configuration {
    @Override
    public String params() {
        return "params from db";
    }
}
