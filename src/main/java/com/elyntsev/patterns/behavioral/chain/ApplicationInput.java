package com.elyntsev.patterns.behavioral.chain;

public class ApplicationInput extends ApplProcessor {
    @Override
    protected void processInternal(Application application) {
        application.addHistoryRecord("Заявление на рассмотрение");
    }

    @Override
    public String getProcessorName() {
        return "Принятие на рассмотрение";
    }
}
