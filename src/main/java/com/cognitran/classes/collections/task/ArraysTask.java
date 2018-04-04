package com.cognitran.classes.collections.task;

public class ArraysTask
{
    /**
     * Zwróć tablicę wypełnioną posortowanymi wartościami od 1 do n lub od n do 1 w zależności od wartości flagi descending.
     */
    public int[] generateArrayWithAscendingOrDescendingNumbers(int n, boolean descending) {
        int[] array = new int[n];
        
        return array;
    }

    /**
     * Oblicz średnią arytmetyczną podanych liczb.
     */
    public double calculateAverage(int[] values) {
        // uwaga: w Javie po operacji dzielenia zachowywane są typy: 1/2 (jako int) = 0 więc należy robić rzutowanie 1/(double)2
        
        return 0.0;
    }

    /**
     * Oblicz medianę elementów w tablicy
     * dla nieparzystej liczby elementów w tablicy - to jest środkowa wartość po posortowaniu
     * dla parzystej średnia arytmetyczna ze środkowych 2 wartości
     */
    public double calculateMedian(double[] values) {
        double result = values[0];
        if (values.length % 2 == 1) { // modulo - reszta z dzielenia
            
        }
        else {
            
        }
        return result;
    }
}
