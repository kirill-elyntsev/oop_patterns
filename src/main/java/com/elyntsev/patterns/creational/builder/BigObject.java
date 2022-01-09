package com.elyntsev.patterns.creational.builder;

public class BigObject {

    private String param1;
    private String param2;
    private String param3;
    private String param4;
    private String param5;

    BigObject(BigObjectBuilder builder) {
        this.param1 = builder.param1;
        this.param2 = builder.param2;
        this.param3 = builder.param3;
        this.param4 = builder.param4;
        this.param5 = builder.param5;
    }

    @Override
    public String toString() {
        return "BigObject{" +
                "param1='" + param1 + '\'' +
                ", param2='" + param2 + '\'' +
                ", param3='" + param3 + '\'' +
                ", param4='" + param4 + '\'' +
                ", param5='" + param5 + '\'' +
                '}';
    }

    public static class BigObjectBuilder {

        private String param1;
        private String param2;
        private String param3;
        private String param4;
        private String param5;


        BigObjectBuilder(String param1) {
            if (param1 == null && param1.trim() == "") {
                throw new IllegalArgumentException("param1 must be not empty");
            }
            this.param1 = param1;
        }

        BigObjectBuilder withParam2(String param2) {
            this.param2 = param2;
            return this;
        }

        BigObjectBuilder withParam3(String param3) {
            this.param3 = param3;
            return this;
        }

        BigObjectBuilder withParam4(String param4) {
            this.param4 = param4;
            return this;
        }

        BigObjectBuilder withParam5(String param5) {
            this.param5 = param5;
            return this;
        }

        BigObject build() {
            return new BigObject(this);
        }
    }
}
