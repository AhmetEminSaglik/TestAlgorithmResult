package org.ahmeteminsaglik.abstracts.get.wordprocess;

import org.ahmeteminsaglik.entity.WordProcessConsept;

public interface GetWordProcessConseptService extends GetWordProcessUsedTableService, GetWordProcessStatisticService {
    WordProcessConsept getWordProcessConsept();
}
