package com.cognitran.classes.topic1.task;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FormatterTaskTest
{
    @Test
    public void should()
    {
        FormatterTask task = new FormatterTask();
        assertEquals("0000000001", task.format(1));
        assertEquals("0000000022", task.format(22));
        assertEquals("0000000333", task.format(333));
        assertEquals("0000004444", task.format(4444));
        assertEquals("1234567890", task.format(1234567890));
    }

}
