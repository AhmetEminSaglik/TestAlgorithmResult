package org.ahmeteminsaglik.entity;

import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSearchAlgorithm;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;


public class ResultEntity {
    private EnumDataStructor enumDataStructor;
    private EnumSortAlgorithm enumSortAlgorithm;
    private EnumSearchAlgorithm enumSearchAlgorithm;
    private WordProcessConsept wordProcessConsept= new WordProcessConsept();
    private ComplexityConsept complexitDataStructor;
    private ComplexityConsept complexitSortAlgorithm;
    private ComplexityConsept complexitSearchAlgorithm;

    public EnumDataStructor getEnumDataStructor() {
        return enumDataStructor;
    }

    public void setEnumDataStructor(EnumDataStructor enumDataStructor) {
        this.enumDataStructor = enumDataStructor;
    }

    public EnumSortAlgorithm getEnumSortAlgorithm() {
        return enumSortAlgorithm;
    }

    public void setEnumSortAlgorithm(EnumSortAlgorithm enumSortAlgorithm) {
        this.enumSortAlgorithm = enumSortAlgorithm;
    }

    public EnumSearchAlgorithm getEnumSearchAlgorithm() {
        return enumSearchAlgorithm;
    }

    public void setEnumSearchAlgorithm(EnumSearchAlgorithm enumSearchAlgorithm) {
        this.enumSearchAlgorithm = enumSearchAlgorithm;
    }

    public WordProcessConsept getWordProcessConsept() {
        return wordProcessConsept;
    }

    public void setWordProcessConsept(WordProcessConsept wordProcessConsept) {
        this.wordProcessConsept = wordProcessConsept;
    }

    public ComplexityConsept getComplexitDataStructor() {
        return complexitDataStructor;
    }

    public void setComplexitDataStructor(ComplexityConsept complexitDataStructor) {
        this.complexitDataStructor = complexitDataStructor;
    }

    public ComplexityConsept getComplexitSortAlgorithm() {
        return complexitSortAlgorithm;
    }

    public void setComplexitSortAlgorithm(ComplexityConsept complexitSortAlgorithm) {
        this.complexitSortAlgorithm = complexitSortAlgorithm;
    }

    public ComplexityConsept getComplexitSearchAlgorithm() {
        return complexitSearchAlgorithm;
    }

    public void setComplexitSearchAlgorithm(ComplexityConsept complexitSearchAlgorithm) {
        this.complexitSearchAlgorithm = complexitSearchAlgorithm;
    }
/*public List<ComplexityConsept> getComplexityConseptList() {
        return complexityConseptList;
    }

    public void setComplexityConseptList(List<ComplexityConsept> complexityConseptList) {
        this.complexityConseptList = complexityConseptList;
    }*/
}
