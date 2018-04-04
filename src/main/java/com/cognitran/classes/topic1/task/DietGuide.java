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
     *  5. ostrzeżenie anorektyczne - dla osób lżejszych od 40kg i wyższych niż 1m
     *  6. dla cięższych niż 100kg uwaga w zależności od wzrostu (dla wyższych niż 2m waga jest uzasadniona)
     *
     * @param age
     * @param weight in kg
     * @param height in cm
     * @return and advice
     */
    public String giveAdvice(int age, int weight, int height) {
        if (age <= 0 || weight <= 0 || height <= 0) {
            return "Przepraszam, nie umiem nic doradzić.";
        }
        if (age > 100) {
            return "Jeżeli ktoś przeżył tyle lat, nie potrzebuje porad.";
        }
        if (age < 18) {
            return "Porady dla nieletnich należy zawsze skonsultować z lekarzem.";
        }
        if (age < 20 && weight > 100) {
            return "To zdecydowana nadwaga! - nie powinno się tyle ważyć w tak młodym wieku.";
        }
        if (weight < 40 && height > 100) {
            return "Zagrożenie anoreksją.";
        }
        if (weight > 100) {
            if (height > 200) {
                return "Dość ciężko, lecz przy tym wzroście waga jest uzasadniona";
            }
            return "Dość ciężko, zastanów się, czy to nie za dużo?";
        }
        return "Niestety nie możemy nic doradzić - poczekaj na nowszą wersję oprogramowania";
    }
}
