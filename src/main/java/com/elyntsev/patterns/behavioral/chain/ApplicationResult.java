package com.elyntsev.patterns.behavioral.chain;

public class ApplicationResult extends ApplProcessor {
    @Override
    protected void processInternal(Application application) {
        application.addHistoryRecord("Заявление принято");
    }

    @Override
    public String getProcessorName() {
        return "Прием заявления";
    }
}
