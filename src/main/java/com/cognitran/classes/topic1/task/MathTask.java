package com.cognitran.classes.topic1.task;

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
        return 0;
    }
}
