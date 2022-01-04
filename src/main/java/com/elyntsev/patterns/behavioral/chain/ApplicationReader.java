package com.elyntsev.patterns.behavioral.chain;

public class ApplicationReader extends ApplProcessor{
    @Override
    protected void processInternal(Application application) {
        application.addHistoryRecord("Заявление рассмотрено");
    }

    @Override
    public String getProcessorName() {
        return "Рассмотреное заявление";
    }
}
