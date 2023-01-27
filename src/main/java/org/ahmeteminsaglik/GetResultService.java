package org.ahmeteminsaglik;

import org.ahmeteminsaglik.entity.ComplexityConsept;
import org.ahmeteminsaglik.entity.WordProcessConsept;
import org.ahmeteminsaglik.enums.EnumDataStructor;
import org.ahmeteminsaglik.enums.EnumSearchAlgorithm;
import org.ahmeteminsaglik.enums.EnumSortAlgorithm;


public interface GetResultService {
    EnumDataStructor getDataStructorProcess();

    EnumSortAlgorithm getSortAlgorithmProcess();

    EnumSearchAlgorithm getSearchAlgorithmProcess();

    WordProcessConsept getWordProcessConsept();

    ComplexityConsept getDataStructorComplexityConcept();

    ComplexityConsept getSortAlgorithmComplexityConcept();

    ComplexityConsept getSearchAlgorithmComplexityConcept();
}
