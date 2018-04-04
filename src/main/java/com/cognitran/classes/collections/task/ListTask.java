package com.cognitran.classes.collections.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListTask
{
    /**
     * Nie używając metody sublist, napisz funkcję, która zwróci listę elementów od indexu from do to
     */
    public List<String> getSublist(List<String> list, int from, int to) {
        List<String> result = new ArrayList<>();
        
        return result;
    }

    /**
     * Zwróć listę unikalnych elementów z listy podanej w parametrze metody.
     */
    public List<String> getUniqueList(List<String> list) {
        List<String> result = new ArrayList<>();
        return result;
    }

    /**
     * Zwróć listę w odwrotnej kolejności. Nie można użyć Collections.reverse()
     */
    public List<String> reverse(List<String> list) {
        return list;
    }

    /**
     * Zwróć największą liczbę z kolekcji.
     */
    public int findTheBiggestNumber(List<Integer> list) {
        return list.get(0).intValue();
    }

    /**
     * Posortuj listę w taki sposób:
     * 1. krótsza nazwa jest wcześniej w porządku (metoda length)
     * 2. przy takiej samej długości posortuj alfabetycznie (metoda compareToIgnoreCase).
     */
    public List<String> sortListShorterFirst(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        return list;
    }
}
