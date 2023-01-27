package org.ahmeteminsaglik.factoryutility;

import org.ahmeteminsaglik.MemoryUsage;
import org.ahmeteminsaglik.Stopwatch;
import org.ahmeteminsaglik.entity.ComplexityConsept;
import org.ahmeteminsaglik.entity.WordProcessConsept;
import org.ahmeteminsaglik.enums.EnumProcessName;
import org.ahmeteminsaglik.enums.EnumWordTable;

public class ConseptFactory {
    public ComplexityConsept buildComplexityConsept(EnumProcessName processName, Stopwatch stopwatch, MemoryUsage memoryUsage) {
        ComplexityConsept consept = new ComplexityConsept();
        consept.setEnumProcessName(processName);
        consept.setStopwatch(stopwatch);
        consept.setMemoryUsage(memoryUsage);
        return consept;
    }

    public WordProcessConsept buildWordProcessConsept(EnumWordTable enumTotalWordList, EnumWordTable enumSearchWordList, int foundWord, int missingWord) {
        WordProcessConsept consept = new WordProcessConsept();
        consept.setEnumTotalWordList(enumTotalWordList);
        consept.setEnumSearchWordList(enumSearchWordList);
        consept.setFoundWord(foundWord);
        consept.setMissingWord(missingWord);
        return consept;
    }
}
