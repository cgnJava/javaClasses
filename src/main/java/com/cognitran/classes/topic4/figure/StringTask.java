package com.cognitran.classes.topic4.figure;

public class StringTask
{
    /**
     * Oblicz sumę cyf przekazanych jako napis, np. "478" = 19
     */
    public int getSumOf(String value)
    {
        return 0;
    }

    /**
     * Sprawdz czy podany test jest palindromem, np. racecar
     */
    public boolean checkIfPalindrome(String text)
    {
        return false;
    }

    /**
     * Policz spółgłoski
     */
    public int countVowels(String text)
    {
        return 0;
    }

    /**
     * Napisać funkcję, która jako parametr przyjmuje łańcuch postaci ”#RRGGBB” i zwraca tablicę 3 liczb całkowitych w systemie 10. Użyj Integer.parseInt("XX", 16).
       Przykład:
        Wynikiem convertHTMLColor2RGB("#FF0050") powinna być tablica { 255, 0, 80 }.
        Wynikiem convertHTMLColor2RGB("#001020") powinna być tablica { 0, 16, 32 }.
     */
    public int [] convertHTMLColor2RGB(String color)
    {
        return null;
    }

    /**
     *  Napisać funkcję, która sprawdza, czy łańcuch t2 jest anagramem tekstu t1, czyli czy składa się z tych
        samych znaków, ale ustawionych niekoniecznie w tej samej kolejności
        Uwaga, należy sprawdzać jedynie małe i duże litery alfabetu angielskiego, jednak
        bez względu na ich wielkość, tzn. zarówno małe ’a’ jak i duże ’A’ liczone są tak samo.
        Białe znaki (spacja, tab) i przecinki są ignorowane.
        Przykładowo, dla wywołań metody:
            isAnagram("kolej", "olejk"); => true
            isAnagram("kolej", "kole"); => false
            isAnagram("kolej", "JEKOL"); => true
            isAnagram("Gregory House", "Huge ego, sorry"); => true
     */
    public boolean isAnagram(String t1, String t2)
    {
        return false;
    }
}
