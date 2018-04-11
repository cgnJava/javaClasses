package com.cognitran.classes.collections.task;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SetTaskTest
{
    private SetTask task = new SetTask();

    @Test
    public void shouldReturnFirstDuplicate()
    {
        assertEquals(null, task.returnFirstDuplicate("1", "2", "3", "4"));
        assertEquals("3", task.returnFirstDuplicate("1", "2", "3", "4", "3", "4"));
    }

    @Test
    public void shouldReturnLastDuplicate()
    {
        assertEquals(null, task.returnLastDuplicate("1", "2", "3", "4"));
        assertEquals("4", task.returnLastDuplicate("1", "2", "3", "4", "3", "4"));
    }

    @Test
    public void countDistinct()
    {
        assertEquals(6, task.countDistinct("1", "2", "3", "1", 1, 2, 3));
    }

    @Test
    public void testHashCodeEquals()
    {
        assertEquals(null, task.findWifeByPesel("-1"));
        assertEquals("Iwona", task.findWifeByPesel("123").getFirstName());
        assertEquals("Witek", task.findWifeByPesel("125").getSurname());
    }
}
