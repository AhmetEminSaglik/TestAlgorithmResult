package org.ahmeteminsaglik;

import org.ahmeteminsaglik.enums.*;

public interface SetResultService {

    AlgorithmTestResult setDataStructorProcess(EnumDataStructor enumDataStructor);

    AlgorithmTestResult setSortAlgorithmProcess(EnumSortAlgorithm enumSortAlgorithm);

    AlgorithmTestResult setSearchAlgorithmProcess(EnumSearchAlgorithm enumSearchAlgorithm);

    AlgorithmTestResult setWordProcessConsept(EnumWordTable enumTotalWordList, EnumWordTable enumSearchWordList, int foundWord, int missingWord);

    AlgorithmTestResult setComplexityConseptDataStructor(Stopwatch stopwatch, MemoryUsage memoryUsage);

    AlgorithmTestResult setComplexityConseptSortAlgorithm(Stopwatch stopwatch, MemoryUsage memoryUsage);

    AlgorithmTestResult setComplexityConseptSearchAlgorithm(Stopwatch stopwatch, MemoryUsage memoryUsage);
}
