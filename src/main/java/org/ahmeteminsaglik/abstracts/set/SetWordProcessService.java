package org.ahmeteminsaglik.abstracts.set;

import org.ahmeteminsaglik.TestAlgorithmResult;
import org.ahmeteminsaglik.enums.EnumWordTable;

public interface SetWordProcessService {
    TestAlgorithmResult setWordProcessConsept(EnumWordTable enumTotalWordList, EnumWordTable enumSearchWordList, int foundWord, int missingWord);

}
