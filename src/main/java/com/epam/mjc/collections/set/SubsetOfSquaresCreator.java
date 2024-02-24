package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        HashSet<Integer> result = new HashSet<>();
        for (Integer integer : sourceList) {
            int j = integer * integer;
            if (j >= lowerBound && j <= upperBound) {
                result.add(j);
            }
        }
        return result;
    }
}
