package com.cognitran.classes.collections.task;

public class ArraysTask2
{
    /**
     * zwracaj true, jeśli istnieje miejsce do rozdzielenia tablicy tak, że suma liczb po jednej stronie jest równa sumie liczb po drugiej stronie.
        canBalance([1, 1, 1, 2, 1]) = true
        canBalance([2, 1, 1, 2, 1]) = false
        canBalance([10, 10]) = true
     */
    public boolean canBalance()
    {
        return false;
    }

    /**
     * Stwórz tablicę gdzie wartości mają wzór: {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
     * podpowiedz - n*(n + 1)/2 = liczba elementów w tablicy
     */
    public int[] seriesUp(int n)
    {
        return null;
    }

    /**
     * za kazda liczba 3 dodaj 4
     * fix34a([1, 3, 1, 4]) → [1, 3, 4, 1, 4]
     */
    public int[] fix34a(int[] nums)
    {
        int[] temp = new int[nums.length];
        //Arrays.copyOf(temp, original.length + original.length / 2);
        //Arrays.copyOfRange(arr, 0, someIndex);
        return temp;
    }

    /**
     * Jeżeli za cyfra 3 znajduje się 4 (nie bezposrednio) nalezy przeniesc ta cyfre za 3.
     * fix34b([1, 3, 1, 4]) = [1, 3, 4, 1]
     * fix34b([1, 3, 1, 4, 4, 3, 1]) = [1, 3, 4, 1, 4, 3, 1]
     */
    public int[] fix34b(int[] nums)
    {
        return nums;
    }

    /**
     * Zwraca true jesli tablica array zawiera w takiej samej kolejnosci tablice inner
     * linearIn([1, 2, 4, 6], [2, 4]) = true
     * linearIn([1, 2, 4, 6], [2, 3, 4]) = false
     * linearIn([1, 2, 4, 4, 6], [2, 4, 4, 6]) = true
     */
    public boolean linearIn(int[] array, int[] inner)
    {
        return false;
    }

    /**
     * maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) = 3
     * maxMirror([1, 2, 1, 4]) = 0
     */
    public int maxMirror(int[] nums)
    {
        return 0;
    }

    /**
     * Stworz tablice o wymiarach n*n według wzoru dla 3 = {0, 0, 1,    0, 2, 1,    3, 2, 1}
     * squareUp(3) = [0, 0, 1, 0, 2, 1, 3, 2, 1]
     * squareUp(2) = [0, 1, 2, 1]
     * squareUp(4) = [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
     */
    public int[] squareUp(int n)
    {
        return null;
    }

    /**
     * Zwraca największą ilość wystąpien tej samej liczby w serii
     * 
     * countClumps([1, 2, 2, 3, 4, 4]) = 2
     * countClumps([1, 1, 2, 1, 1]) = 2
     * countClumps([1, 1, 1, 1, 1]) = 5
     */
    public int countClumps(int[] nums)
    {
        return 0;
    }

    /**
     * Zwraca true jesli kazda nastepna liczba jest wieksza lub rowna niz poprzednia
     * scoresIncreasing([1, 3, 4]) = true
     * scoresIncreasing([1, 3, 2]) = false
     * scoresIncreasing([1, 1, 4]) = true
     */
    public boolean scoresIncreasing(int[] scores)
    {
        return false;
    }
}
