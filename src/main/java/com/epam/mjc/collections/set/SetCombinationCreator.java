package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        HashSet<String> result = new HashSet<>();
        for (String s : firstSet) {
            if(secondSet.contains(s)&&!thirdSet.contains(s)){
                result.add(s);
            }
        }
        for (String s : thirdSet) {
            if(!secondSet.contains(s)&&!firstSet.contains(s)){
                result.add(s);
            }

        }
        return result;
    }
}
