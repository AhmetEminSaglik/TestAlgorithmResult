package org.ahmeteminsaglik.entity;

import org.ahmeteminsaglik.MemoryUsage;
import org.ahmeteminsaglik.Stopwatch;
import org.ahmeteminsaglik.enums.EnumProcessName;

public class ComplexityConsept {
    private Stopwatch stopwatch;
    private MemoryUsage memoryUsage;
    private EnumProcessName enumProcessName;


    public Stopwatch getStopwatch() {
        return stopwatch;
    }

    public void setStopwatch(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    public MemoryUsage getMemoryUsage() {
        return memoryUsage;
    }

    public void setMemoryUsage(MemoryUsage memoryUsage) {
        this.memoryUsage = memoryUsage;
    }

    public EnumProcessName getEnumProcessName() {
        return enumProcessName;
    }

    public void setEnumProcessName(EnumProcessName enumProcessName) {
        this.enumProcessName = enumProcessName;
    }

    @Override
    public String toString() {
        return "ComplexityConsept{" +
                "\nenumProcessName=" + enumProcessName +
                ",\nstopwatch=" + stopwatch +
                ",\nmemoryUsage=" + memoryUsage +
                '}';
    }
}
