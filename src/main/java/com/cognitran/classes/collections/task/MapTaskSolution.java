package com.cognitran.classes.collections.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import com.cognitran.classes.collections.Person;

public class MapTaskSolution extends MapTask
{
    /**
     * Pogrupuj listę użytkowników po imieniu.
     */
    public Map<String, List<Person>> groupByFirstName(List<Person> users)
    {
        Map<String, List<Person>> result = new HashMap<>();
        for (Person person : users) {
            List<Person> list = result.get(person.getFirstName());
            if (list == null)
            {
                list = new ArrayList<>();
                result.put(person.getFirstName(), list);
            }
            list.add(person);
        }
        return result;
    }

    /**
     * Przeanalizuj powyższe zadanie i algorytm.
     * Napisz podobną funkcję, która zwróci najczęściej losowaną liczbę od 1 do 30 (liczba losowań=1000).
     */
    @Override
    public int findMostFrequentlyDrawnNumber()
    {
        Random rand = new Random();
        Map<Integer, Integer> counterMap = new HashMap<>();
        for (int i = 0; i < 1_000; i++)
        {
            int key = rand.nextInt(29) + 1;
            Integer counter = counterMap.get(key);
            counterMap.put(key, Integer.valueOf(counter == null ? 1 : counter.intValue() + 1));
        }
        int result = 0;
        int maxValue = 0;
        for (Entry<Integer, Integer> entry : counterMap.entrySet())
        {
            if (entry.getValue().intValue() > maxValue)
            {
                maxValue = entry.getValue().intValue();
                result = entry.getKey().intValue();
            }
        }
        return result;
    }

}
