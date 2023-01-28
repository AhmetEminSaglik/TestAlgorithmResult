package org.ahmeteminsaglik;

import org.ahmeteminsaglik.abstracts.get.api.GetResultConseptService;
import org.ahmeteminsaglik.abstracts.set.api.SetResultConseptService;
import org.ahmeteminsaglik.entity.*;
import org.ahmeteminsaglik.enums.*;
import org.ahmeteminsaglik.business.factory.ConseptFactory;

public class TestAlgorithmResult implements SetResultConseptService, GetResultConseptService {
    private ResultEntity result = new ResultEntity();
    private ConseptFactory factory = new ConseptFactory();
    private WordProcessConsept wordProcessConsept = result.getWordProcessConsept();

    @Override
    public TestAlgorithmResult setDataStructorProcess(EnumDataStructor enumDataStructor) {
        result.setEnumDataStructor(enumDataStructor);
        return this;
    }

    @Override
    public TestAlgorithmResult setSortAlgorithmProcess(EnumSortAlgorithm enumSortAlgorithm) {
        result.setEnumSortAlgorithm(enumSortAlgorithm);
        return this;
    }

    @Override
    public TestAlgorithmResult setSearchAlgorithmProcess(EnumSearchAlgorithm enumSearchAlgorithm) {
        result.setEnumSearchAlgorithm(enumSearchAlgorithm);
        return this;
    }

    @Override
    public TestAlgorithmResult setWordProcessStatistic(WordProcessStatistics statistics) {
        wordProcessConsept.setStatistics(statistics);
        return this;
    }

    @Override
    public TestAlgorithmResult setWordProcessUsedTable(WordProcessUsedTable usedTable) {
        wordProcessConsept.setUsedTable(usedTable);
        return this;
    }

    @Override
    public TestAlgorithmResult setComplexityConseptDataStructor(Stopwatch stopwatch, MemoryUsage memoryUsage) {
        ComplexityConsept consept =
                factory.buildComplexityConsept(EnumProcessName.DATA_STRUCTOR_PROCESS, stopwatch, memoryUsage);
        result.setComplexitDataStructor(consept);
        return this;
    }

    @Override
    public TestAlgorithmResult setComplexityConseptSortAlgorithm(Stopwatch stopwatch, MemoryUsage memoryUsage) {
        ComplexityConsept complexityConsept =
                factory.buildComplexityConsept(EnumProcessName.SORT_PROCESS, stopwatch, memoryUsage);
        result.setComplexitSortAlgorithm(complexityConsept);
        return this;
    }

    @Override
    public TestAlgorithmResult setComplexityConseptSearchAlgorithm(Stopwatch stopwatch, MemoryUsage memoryUsage) {
        ComplexityConsept complexityConsept =
                factory.buildComplexityConsept(EnumProcessName.SEARCH_PROCESS, stopwatch, memoryUsage);
        result.setComplexitSearchAlgorithm(complexityConsept);
        return this;
    }

    @Override
    public EnumDataStructor getDataStructorProcess() {
        return result.getEnumDataStructor();
    }

    @Override
    public EnumSortAlgorithm getSortAlgorithmProcess() {
        return result.getEnumSortAlgorithm();
    }

    @Override
    public EnumSearchAlgorithm getSearchAlgorithmProcess() {
        return result.getEnumSearchAlgorithm();
    }

    @Override
    public ComplexityConsept getDataStructorComplexityConcept() {
        return result.getComplexitDataStructor();
    }

    @Override
    public ComplexityConsept getSortAlgorithmComplexityConcept() {
        return result.getComplexitSortAlgorithm();
    }

    @Override
    public ComplexityConsept getSearchAlgorithmComplexityConcept() {
        return result.getComplexitSearchAlgorithm();
    }

    @Override
    public WordProcessConsept getWordProcessConsept() {
        return result.getWordProcessConsept();
    }

    @Override
    public WordProcessStatistics getWordProcessStatistic() {
        return wordProcessConsept.getStatistics();
    }

    @Override
    public WordProcessUsedTable getWordProcessUsedTable() {
        return wordProcessConsept.getUsedTable();
    }
}
