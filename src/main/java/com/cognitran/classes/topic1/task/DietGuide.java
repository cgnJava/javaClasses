package com.cognitran.classes.topic1.task;

public class DietGuide {

    /**
     * Napisz kod poradnika dietetycznego, analizującego następujące dane:
     * - wiek
     * - wzrost
     * - wagę
     *  Na ich podstawie poradnik wyświetla na ekranie odpowiednie wskazówki:
     *  1. nie udzielamy porad dla absurdalnych wartości
     *  2. nie udzielamy porad ludziom starszym od 100 lat
     *  3. porady dla nieletnich opatrzone specjalną klauzulą
     *  4. ostre ostrzeżenie dla nastolatków > 100kg
     *  5. ostrzeżenie anorektyczne - dla osób > 10 lat, lżejszych od 40kg i większych od 1m
     *  6. dla cięższych niż 100kg uwaga w zależności od wzrostu (dla wyższych niż 2m waga jest uzasadniona)
     *
     * @param age
     * @param weight in kg
     * @param height in cm
     * @return
     */
    public String giveAdvice(int age, int weight, int height) {

        return "Niestety nie możemy nic doradzić - poczekaj na nowszą wersję oprogramowania";
    }
}
