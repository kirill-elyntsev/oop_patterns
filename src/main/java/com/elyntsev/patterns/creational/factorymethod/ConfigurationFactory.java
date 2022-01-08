package com.elyntsev.patterns.creational.factorymethod;

public class ConfigurationFactory {

    static Configuration getConfiguration(String param){

        if ("file".equals(param)){
            return new ConfigurationFile();
        }

        if ("db".equals(param)){
            return new ConfigurationDb();
        }
        throw new IllegalArgumentException("unknown paran" + param);
    }
}
