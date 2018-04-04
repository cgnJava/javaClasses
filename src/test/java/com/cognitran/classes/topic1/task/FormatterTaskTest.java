package com.cognitran.classes.topic1.task;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FormatterTaskTest
{
    @Test
    public void shouldFormat()
    {
        FormatterTask task = new FormatterTask();
        assertEquals("0000000001", task.format(1));
        assertEquals("0000000022", task.format(22));
        assertEquals("0000000333", task.format(333));
        assertEquals("0000004444", task.format(4444));
        assertEquals("1234567890", task.format(1234567890));
    }

    @Test
    public void shouldFormatSolution2()
    {
        FormatterTask task = new FormatterTask();
        assertEquals("0000000001", task.formatSolution2(1));
        assertEquals("0000000022", task.formatSolution2(22));
        assertEquals("0000000333", task.formatSolution2(333));
        assertEquals("0000004444", task.formatSolution2(4444));
        assertEquals("1234567890", task.formatSolution2(1234567890));
    }

    @Test
    public void shouldFormatSolution3()
    {
        FormatterTask task = new FormatterTask();
        assertEquals("0000000001", task.formatSolution3(1));
        assertEquals("0000000022", task.formatSolution3(22));
        assertEquals("0000000333", task.formatSolution3(333));
        assertEquals("0000004444", task.formatSolution3(4444));
        assertEquals("1234567890", task.formatSolution3(1234567890));
    }

}
