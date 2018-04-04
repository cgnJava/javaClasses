package com.cognitran.classes.topic1.task;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MathTaskTest
{
    @Test
    public void shouldReturnValueFrom1to5()
    {
        MathTask task = new MathTask();
        for (int i = 0; i < 1000; i++) {
            int value = task.guess1();
            assertTrue(value >= 1 && value <= 5);
        }
    }

    @Test
    public void shouldReturnValueFrom5to10orFrom15t020()
    {
        MathTask task = new MathTask();
        for (int i = 0; i < 1000; i++) {
            int value = task.guess2();
            assertTrue(value >= 5 && value <= 10 || value >= 15 && value<= 20);
        }
    }

    @Test
    public void shouldReturnValueFrom5to10orFrom15t020_solution2()
    {
        MathTask task = new MathTask();
        for (int i = 0; i < 1000; i++) {
            int value = task.guess2Solution2();
            assertTrue(value >= 5 && value <= 10 || value >= 15 && value<= 20);
        }
    }
}
