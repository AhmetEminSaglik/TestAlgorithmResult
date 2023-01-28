package org.ahmeteminsaglik.abstracts.set;

import org.ahmeteminsaglik.MemoryUsage;
import org.ahmeteminsaglik.Stopwatch;
import org.ahmeteminsaglik.TestAlgorithmResult;

public interface SetAllComplexityService {
    TestAlgorithmResult setComplexityConseptDataStructor(Stopwatch stopwatch, MemoryUsage memoryUsage);

    TestAlgorithmResult setComplexityConseptSortAlgorithm(Stopwatch stopwatch, MemoryUsage memoryUsage);

    TestAlgorithmResult setComplexityConseptSearchAlgorithm(Stopwatch stopwatch, MemoryUsage memoryUsage);
}
