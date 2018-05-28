package com.cognitran.classes.collections.task;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import com.cognitran.classes.collections.Person;

public class MapTask
{
    /**
     * Pogrupuj listę użytkowników po imieniu.
     */
    public Map<String, List<Person>> groupByFirstName(List<Person> users)
    {
        Map<String, List<Person>> result = new HashMap<>();
        return result;
    }

    /**
     * (zrobione) Zwróć najczęściej występującą liczbę z tablicy. Podpowiedz: użyj Map<Integer, Integer>, gdzie klucz to liczba, a wartość to licznik wystąpień.
     */
    public int findTheMostFrequent(int... array) {
        Map<Integer, Integer> counterMap = new HashMap<>();
        for (int element : array)
        {
            Integer key = Integer.valueOf(element);
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

    /**
     * Przeanalizuj powyższe zadanie i algorytm.
     * Napisz podobną funkcję, która zwróci najczęściej losowaną liczbę od 1 do 30 (liczba losowań=1000).
     */
    public int findMostFrequentlyDrawnNumber()
    {
        Random rand = new Random();
        Map<Integer, Integer> counterMap = new HashMap<>();
        for (int i = 0; i < 1_000; i++)
        {
            int number = rand.nextInt(29) + 1;
        }
        return 0;
    }

    /**
     * Zwróć mapę gdzie kluczem będzie pierwsza litera pisana wielkimi literami, a wartością ostatnia litera pisana małą literą, np.
     * pairs(["code", "bug"]) → {"C": "e", "B": "g"}
     * pairs(["0code", "bug0"]) → {"C": "e", "B": "g"}
     */
    public Map<String, String> pairs(String... strings)
    {
        return null;
    }

    /**
     * Zlicz wystąpienia słów. np.
     * wordCount("a", "b", "a", "c", "b") = {"a": 2, "b": 2, "c": 1}
     */
    public Map<String, Integer> wordCount(String... strings)
    {
        return null;
    }

    /**
     * Zwróć mapę wyrazów gdzie kluczem jest wyraz a wartością boolean który mówi czy wyraz wystąpił przynajmniej 2 razy
     */
    public Map<String, Boolean> wordMultiple(String... strings)
    {
        return null;
    }

    /**
     * gdy łańcuch pojawi się w tablicy 2., 4., 6. ... raz., dołącz łańcuch do wyniku. Zwróć pusty ciąg znaków, jeśli żaden ciąg nie pojawi się po raz drugi.
     */
    public String wordAppend(String[] strings)
    {
        return "";
    }
}
