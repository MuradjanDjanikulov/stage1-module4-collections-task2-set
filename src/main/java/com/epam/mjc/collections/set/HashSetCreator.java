package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (int j : sourceList) {
            if (j % 2 == 0) {
                result.add(j);
                while ((j = j / 2) >= 1) {
                    result.add(j);
                }
            } else {
                result.add(j);
                result.add(j * 2);
            }

        }
        return result;
    }
}
