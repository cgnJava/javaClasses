package com.cognitran.classes.collections.task;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.cognitran.classes.collections.Person;

public class MapTaskTest
{
    private MapTask task = new MapTask();

    @Test
    public void shouldGroupByFirstName()
    {
        List<Person> users = new ArrayList<>();
        users.add(new Person(1, "Marian", "Opania", 1));
        users.add(new Person(2, "Lukasz", "Opania", 1));
        users.add(new Person(3, "Marian", "Kowalski", 1));

        Map<String, List<Person>> result = task.groupByFirstName(users);
        assertEquals(2, result.get("Marian").size());
        assertEquals(1, result.get("Lukasz").size());
        assertEquals(null, result.get("Witold"));
    }

    @Test
    public void shouldFindTheMostFrequent()
    {
        assertEquals(2, task.findTheMostFrequent(1, 2, 3, 4, 2));
    }

    @Test
    public void shouldFindMostFrequentlyDrawnNumber()
    {
        int result = task.findMostFrequentlyDrawnNumber();
        assertTrue(result > 0 && result < 31);
    }
}
