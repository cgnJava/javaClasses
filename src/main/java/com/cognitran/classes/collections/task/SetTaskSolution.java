package com.cognitran.classes.collections.task;

import java.util.HashSet;
import java.util.Set;

public class SetTaskSolution extends SetTask
{
    /**
     * Zwróć pierszy duplikat z tablicy używając HashSet, jeżeli nie ma duplikatu wzróć null
     */
    @Override
    public String returnFirstDuplicate(String... array)
    {
        Set<String> set = new HashSet<>();
        for (String element : array) {
            if (set.contains(element)) {
                return element;
            }
            else {
                set.add(element);
            }
        }
        return null;
    }

    /**
     * Zwróć ostatni duplikat z tablicy używając HashSet, jeżeli nie ma duplikatu wzróć null
     */
    @Override
    public String returnLastDuplicate(String... array)
    {
        Set<String> set = new HashSet<>();
        String lastElement = null;
        for (String element : array) {
            if (!set.add(element)) {
                lastElement = element;
            }
        }
        return lastElement;
    }

    /**
     * Policz ile różnych elementów znajduje się w tablicy przekazanej w parametrze (użyj java.util.HashSet)
     */
    @Override
    public int countDistinct(Object... array)
    {
        Set<Object> set = new HashSet<>();
        for (Object element : array) {
            set.add(element);
        }
        return set.size();
    }
}
