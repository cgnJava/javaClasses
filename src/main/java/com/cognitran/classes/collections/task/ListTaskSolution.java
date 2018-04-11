package com.cognitran.classes.collections.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class ListTaskSolution extends ListTask
{
    /**
     * Nie używając metody sublist, napisz funkcję, która zwróci listę elementów od indexu from do to
     */
    @Override
    public List<String> getSublist(List<String> list, int from, int to) {
        List<String> result = new ArrayList<>();
        for (int i = from; i <= to; i++)
        {
            result.add(list.get(i));
        }
        return result;
    }

    /**
     * Zwróć listę unikalnych elementów z listy podanej w parametrze metody.
     */
    @Override
    public List<String> getUniqueList(List<String> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    /**
     * Zwróć listę w odwrotnej kolejności. Nie można użyć Collections.reverse()
     */
    @Override
    public List<String> reverse(List<String> list) {
        List<String> result = new LinkedList<>();
        for (String element : list)
        {
            result.add(0, element);
        }
        return result;
    }

    /**
     * Zwróć największą liczbę z kolekcji.
     */
    @Override
    public int findTheBiggestNumber(List<Integer> list) {
        int max = 0 ;
        for (Integer value : list)
        {
            if (value.intValue() > max)
            {
                max = value.intValue();
            }
        }
        return max;
    }

    /**
     * Posortuj listę w taki sposób:
     * 1. krótsza nazwa jest wcześniej w porządku (metoda length)
     * 2. przy takiej samej długości posortuj alfabetycznie (metoda compareToIgnoreCase).
     */
    @Override
    public List<String> sortListShorterFirst(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int compare = o1.length() - o2.length();
                if (compare == 0)
                {
                    compare = o1.compareToIgnoreCase(o2);
                }
                return compare;
            }
        });
        return list;
    }
}
