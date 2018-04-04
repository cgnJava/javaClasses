package com.cognitran.classes.collections.task;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SetTaskTest
{
    @Test
    public void shouldReturnFirstDuplicate()
    {
        SetTask task = new SetTask();
        assertEquals(null, task.returnFirstDuplicate("1", "2", "3", "4"));
        assertEquals("3", task.returnFirstDuplicate("1", "2", "3", "4", "3", "4"));
    }

    @Test
    public void shouldReturnLastDuplicate()
    {
        SetTask task = new SetTask();
        assertEquals(null, task.returnLastDuplicate("1", "2", "3", "4"));
        assertEquals("4", task.returnLastDuplicate("1", "2", "3", "4", "3", "4"));
    }

    @Test
    public void countDistinct()
    {
        SetTask task = new SetTask();
        assertEquals(6, task.countDistinct("1", "2", "3", "1", 1, 2, 3));
    }
}
