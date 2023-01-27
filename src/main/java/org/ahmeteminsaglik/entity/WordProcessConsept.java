package org.ahmeteminsaglik.entity;

import org.ahmeteminsaglik.enums.EnumWordTable;

public class WordProcessConsept {
    private EnumWordTable enumTotalWordList;
    private EnumWordTable enumSearchWordList;
    private int foundWord;
    private int missingWord;

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

    public int getFoundWord() {
        return foundWord;
    }

    public void setFoundWord(int foundWord) {
        this.foundWord = foundWord;
    }

    public int getMissingWord() {
        return missingWord;
    }

    public void setMissingWord(int missingWord) {
        this.missingWord = missingWord;
    }
}
