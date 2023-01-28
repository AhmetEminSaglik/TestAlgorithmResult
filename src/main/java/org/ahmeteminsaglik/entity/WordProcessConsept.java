package org.ahmeteminsaglik.entity;


public class WordProcessConsept {
    private WordProcessStatistics statistics;
    private WordProcessUsedTable usedTable;

    public WordProcessConsept() {
    }

    public WordProcessConsept(WordProcessUsedTable usedTable,WordProcessStatistics statistics ) {
        this.usedTable = usedTable;
        this.statistics = statistics;
    }

    public WordProcessStatistics getStatistics() {
        return statistics;
    }

    public void setStatistics(WordProcessStatistics statistics) {
        this.statistics = statistics;
    }

    public WordProcessUsedTable getUsedTable() {
        return usedTable;
    }

    public void setUsedTable(WordProcessUsedTable usedTable) {
        this.usedTable = usedTable;
    }
}
