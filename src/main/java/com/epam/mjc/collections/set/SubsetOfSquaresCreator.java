package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        HashSet<Integer> result = new HashSet();
        for (int i = 0; i < sourceList.size(); i++) {
            int j = sourceList.get(i)*sourceList.get(i);
            if(j>=lowerBound&&j<=upperBound){
                result.add(j);
            }
        }
        return result;
    }
}
