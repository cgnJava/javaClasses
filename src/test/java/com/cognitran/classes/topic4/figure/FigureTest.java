package com.cognitran.classes.topic4.figure;

import org.junit.Test;

public class FigureTest
{
    @Test
    public void testFigures()
    {
        Figure[] figures = new Figure[] {};
        for (Figure figure : figures)
        {
            System.out.println(figure.getCircumference());
            System.out.println(figure.getArea());
        }
    }
}
