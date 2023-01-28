package org.ahmeteminsaglik.abstracts.set.algorithm;

import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSearchAlgorithm;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;

public interface SetUsedAlgorithmService {
    TestAlgorithmResult setDataStructorProcess(EnumDataStructor enumDataStructor);

    TestAlgorithmResult setSortAlgorithmProcess(EnumSortAlgorithm enumSortAlgorithm);

    TestAlgorithmResult setSearchAlgorithmProcess(EnumSearchAlgorithm enumSearchAlgorithm);
}
