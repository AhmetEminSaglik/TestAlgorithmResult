package org.ahmeteminsaglik.business.factory;

import org.ahmeteminsaglik.MemoryUsage;
import org.ahmeteminsaglik.Stopwatch;
import org.ahmeteminsaglik.entity.ComplexityConsept;
import org.ahmeteminsaglik.enums.EnumProcessName;

public class ConseptFactory {
    public ComplexityConsept buildComplexityConsept(EnumProcessName processName, Stopwatch stopwatch, MemoryUsage memoryUsage) {
        ComplexityConsept consept = new ComplexityConsept();
        consept.setEnumProcessName(processName);
        consept.setStopwatch(stopwatch);
        consept.setMemoryUsage(memoryUsage);
        return consept;
    }
}
