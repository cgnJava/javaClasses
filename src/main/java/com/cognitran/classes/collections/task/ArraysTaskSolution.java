package com.cognitran.classes.collections.task;

import java.util.Arrays;

public class ArraysTaskSolution extends ArraysTask
{
    /**
     * Zwróć tablicę wypełnioną posortowanymi wartościami od 1 do n lub od n do 1 w zależności od wartości flagi descending.
     */
    @Override
    public int[] generateArrayWithAscendingOrDescendingNumbers(int n, boolean descending) {
        int[] array = new int[n];
        if (descending) {
            for (int i = n - 1; i >= 0; i--) {
                array[i] = n - i;
            }
        }
        else {
            for (int i = 0; i < n; i++) {
                array[i] = i + 1;
            }
        }
        return array;
    }

    /**
     * Policz ile wyrazów zaczyna się małą literą, a ile wielką - wskazowka: Character.isUpperCase(), Character.isUpperCase()
     * @return tablica 2-elementowa, gdzie wartość pod pierwszym indeksem jest licznikiem wyrazów zaczynających się od małej litery,
     *         a pod drugim indeksem - licznikiem wyrazów zaczynających się od wielkiej litery
     */
    @Override
    public int[] countLowercaseUppercase(String... array)
    {
        int[] result = new int[2];
        for (String element : array)
        {
            if (element != null && element.length() > 0) {
                if (Character.isLowerCase(element.charAt(0))) {
                    result[0]++;
                }
                else if (Character.isUpperCase(element.charAt(0))) {
                    result[1]++;
                }
            }
        }
        return result;
    }

    /**
     * Oblicz średnią arytmetyczną podanych liczb.
     */
    @Override
    public double calculateAverage(int[] values) {
        // uwaga: w Javie po operacji dzielenia zachowywane są typy: 1/2 (jako int) = 0 więc należy robić rzutowanie 1/(double)2
        int sum = 0;
        for (int value : values)
        {
            sum += value;
        }
        return sum / (double) values.length;
    }

    /**
     * Oblicz medianę elementów w tablicy
     * dla nieparzystej liczby elementów w tablicy - to jest środkowa wartość po posortowaniu
     * dla parzystej średnia arytmetyczna ze środkowych 2 wartości
     */
    @Override
    public double calculateMedian(double[] values) {
        Arrays.sort(values);
        double result = values[0];
        int middle = values.length / 2;
        if (values.length % 2 == 1) { // modulo - reszta z dzielenia
            result = values[middle];
        }
        else {
            result = (values[middle] + values[middle - 1]) / 2;
        }
        return result;
    }
}
