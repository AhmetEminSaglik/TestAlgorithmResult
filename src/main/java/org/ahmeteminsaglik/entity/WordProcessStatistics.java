package org.ahmeteminsaglik.entity;

public class WordProcessStatistics {
    private int foundWord;
    private int missingWord;

    public WordProcessStatistics() {
    }

    public WordProcessStatistics(int foundWord, int missingWord) {
        this.foundWord = foundWord;
        this.missingWord = missingWord;
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
