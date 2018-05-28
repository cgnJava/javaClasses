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
     * Policz ile wyrazów zaczyna się małą literą, a ile wielką - wskazowka: Character.isUpperCase(), Character.isUpperCase()
     * @return tablica 2-elementowa, gdzie wartość pod pierwszym indeksem jest licznikiem wyrazów zaczynających się od małej litery,
     *         a pod drugim indeksem - licznikiem wyrazów zaczynających się od wielkiej litery
     */
    public int[] countLowercaseUppercase(String... array)
    {
        int[] result = new int[2];
        
        return result;
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

    /**
     * Wiedząc, że 'b' = (char) 'a' + 1, napisz metodę, która zwróci tablicę char[] zawierającą pierwsze n liter alfabetu
     * @see Character.toUpperCase()
     */
    public char[] getFirstCharactersOfAlphabet(int n, boolean uppercase)
    {
        return null;
    }

    /**
     * Zwróć różnicę między największą i najmniejszą wartością w tablicy.
     */
    public int bigDifference(int[] nums)
    {
        return 0;
    }

    /**
     * Zwróć true jeśli tablica zawiera liczbę kończącą się na 3.
     */
    public boolean endsWith3(int[] nums)
    {
        return false;
    }

    /**
     * 
    Zwróć tablicę zawierającą dokładnie te same liczby, co podana tablica, ale uporządkowaną tak, aby wszystkie liczby parzyste znalazły się przed wszystkimi liczbami nieparzystymi.
    Poza tym liczby mogą być w dowolnej kolejności. Możesz modyfikować i zwracać daną tablicę lub tworzyć nową tablicę.
     */
    public int[] evenOdd(int[] nums)
    {
        return null;
    }

    /**
     * Zwróć true jeśli w kazdej sąsiedniej parze w tablicy znajduje się podana w drugim parametrze liczba.
     * np.
     * isEverywhere([1, 2, 1, 3], 1) = true
     * isEverywhere([1, 2, 1, 3], 2) = false, bo 1,3 nie zawiera 2
     */
    public boolean isEverywhere(int[] nums, int val)
    {
        return false;
    }

    /**
     * Zwróć sumę liczb niepowtarzających się, np.
     * loneSum(1,2,3) = 6
     * loneSum(1,2,2) = 1
     * loneSum(1,1,1) = 0
     */
    public int loneSum(int... values)
    {
        return 0;
    }

    /**
     * Jest ciągiem matematycznym?
     * np. evenlySpaced(2,4,6) = true
     * evenlySpaced(2,4,6,7) = false
     */
    public boolean evenlySpaced(int... values)
    {
        return false;
    }

    /**
     * Zwróć wartość, która jest najbliższa 21, bez przekraczania tej wartości.
     * np, blackjack(17,19) = 19
     * blackjack(17,22) = 17
     */
    public int blackjack(int... values)
    {
        return 0;
    }
}
