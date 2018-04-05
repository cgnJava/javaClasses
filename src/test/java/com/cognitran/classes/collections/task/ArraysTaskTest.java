package com.cognitran.classes.collections.task;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArraysTaskTest
{
    @Test
    public void shouldGenerateArrayWithAscendingOrDescendingNumbers()
    {
        ArraysTask task = new ArraysTask();
        assertArrayEquals(new int[] {1,2,3,4,5,6}, task.generateArrayWithAscendingOrDescendingNumbers(6, false));
        assertArrayEquals(new int[] {3,2,1}, task.generateArrayWithAscendingOrDescendingNumbers(3, true));
    }

    @Test
    public void shouldCountLowercaseUppercase()
    {
        ArraysTask task = new ArraysTask();
        int[] result = task.countLowercaseUppercase("Adam", "alfa", "Gdańsk", "1", "", null);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void shouldCalculateAverage()
    {
        ArraysTask task = new ArraysTask();
        assertEquals(5.25, task.calculateAverage(new int[] {1, 5, 6, 9}), 0.01);
    }

    @Test
    public void shouldCalculateMedian()
    {
        ArraysTask task = new ArraysTask();
        assertEquals(1250, task.calculateMedian(new double[] {1900, 1000, 1200, 1300}), 0.01);
        assertEquals(1200, task.calculateMedian(new double[] {1900, 1000, 1200}), 0.01);
    }

}
