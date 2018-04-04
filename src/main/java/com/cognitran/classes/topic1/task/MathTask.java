package com.cognitran.classes.topic1.task;

import java.util.Arrays;
import java.util.List;

public class MathTask
{
    /**
     * Zwraca wartośc od 1 do 5.
     * @return
     */
    public int guess1()
    {
        //System.out.println( (int) 99.9999 );
        return (int) Math.round(4 * Math.random() + 1);
    }

    /**
     * Wiedząc że Math.random() zwraca wartości [0, 1) napisz funkcję która zwróci wartości z zakresu od 5 do 10 lub od 15 do 20 włącznie.
     * @return the number
     */
    public int guess2()
    {
        double number = Math.random();
        if (number >= 0.5)
        {
            return (int) Math.round(5 * Math.random() + 5);
        }
        return (int) Math.round(5 * Math.random() + 15);
    }

    public int guess2Solution2()
    {
        List<Integer> list = Arrays.asList(5, 6, 7, 8, 9, 10, 15, 16, 17, 18, 19, 20);
        int index = (int) Math.round((list.size() - 1) * Math.random());
        return list.get(index).intValue();
    }
}
