package com.elyntsev.patterns.behavioral.chain;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private final List<String> historyRecordList = new ArrayList<>();

    void addHistoryRecord(String record){
        historyRecordList.add(record);
    }

    void printHistory(){
        System.out.println(historyRecordList);
    }
}
