package org.ahmeteminsaglik.abstracts.get;

import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSearchAlgorithm;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;

public interface GetUsedAlgorithmService {
    EnumDataStructor getDataStructorProcess();

    EnumSortAlgorithm getSortAlgorithmProcess();

    EnumSearchAlgorithm getSearchAlgorithmProcess();
}
