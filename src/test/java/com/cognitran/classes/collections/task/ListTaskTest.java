package com.cognitran.classes.collections.task;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ListTaskTest
{
    private ListTask task = new ListTask();

    @Test
    public void shouldGetSublist()
    {
        List<String> list = Arrays.asList("Ala", "ma", "kota");
        List<String> result = task.getSublist(list, 1, 1);
        assertEquals(1, result.size());
        assertEquals("ma", result.get(0));
    }

    @Test
    public void shouldGetUniqueList()
    {
        List<String> result = task.getUniqueList(Arrays.asList("Ala", "ma", "kota", "Ala", "kota"));
        assertEquals(3, result.size());
        assertThat(result, containsInAnyOrder("Ala", "ma", "kota"));
    }

    @Test
    public void shouldReverse()
    {
        List<String> result = task.reverse(Arrays.asList("Ala", "ma", "kota"));
        assertEquals(3, result.size());
        assertThat(result, contains("kota", "ma", "Ala"));
    }

    @Test
    public void shouldFindTheBiggestNumber()
    {
        assertEquals(3, task.findTheBiggestNumber(Arrays.asList(1, 2, 3)));
    }

    @Test
    public void shouldSortListShorterFirst()
    {
        task.sortListShorterFirst(Arrays.asList("", "", ""));
    }
}
