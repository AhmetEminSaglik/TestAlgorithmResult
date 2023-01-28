package org.ahmeteminsaglik.entity;

import org.ahmeteminsaglik.enums.EnumWordTable;

public class WordProcessUsedTable {
    private EnumWordTable enumTotalWordList;
    private EnumWordTable enumSearchWordList;

    public WordProcessUsedTable() {
    }

    public WordProcessUsedTable(EnumWordTable enumTotalWordList, EnumWordTable enumSearchWordList) {
        this.enumTotalWordList = enumTotalWordList;
        this.enumSearchWordList = enumSearchWordList;
    }

    public EnumWordTable getEnumTotalWordList() {
        return enumTotalWordList;
    }

    public void setEnumTotalWordList(EnumWordTable enumTotalWordList) {
        this.enumTotalWordList = enumTotalWordList;
    }

    public EnumWordTable getEnumSearchWordList() {
        return enumSearchWordList;
    }

    public void setEnumSearchWordList(EnumWordTable enumSearchWordList) {
        this.enumSearchWordList = enumSearchWordList;
    }
}
