package com.cognitran.classes.topic1.task;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DietGuideTest
{
    @Test
    public void shouldGiveAdviceCorrectAdvices()
    {
        DietGuide dietGuide = new DietGuide();

//      1. nie udzielamy porad dla absurdalnych wartości
        assertEquals("Przepraszam, nie umiem nic doradzić.", dietGuide.giveAdvice(0, 0, 0));
//      2. nie udzielamy porad ludziom starszym od 100 lat
        assertEquals("Jeżeli ktoś przeżył tyle lat, nie potrzebuje porad.", dietGuide.giveAdvice(101, 70, 160));
//      3. porady dla nieletnich opatrzone specjalną klauzulą
        assertEquals("Porady dla nieletnich należy zawsze skonsultować z lekarzem.", dietGuide.giveAdvice(16, 50, 140));
//      4. ostre ostrzeżenie dla nastolatków (18-19 lat) > 100kg
        assertEquals("To zdecydowana nadwaga! - nie powinno się tyle ważyć w tak młodym wieku.", dietGuide.giveAdvice(19, 110, 130));
//      5. ostrzeżenie anorektyczne - dla osób lżejszych od 40kg i wyższych niż 1,5m
        assertEquals("Zagrożenie anoreksją.", dietGuide.giveAdvice(20, 30, 180));
//      6. dla cięższych niż 100kg uwaga w zależności od wzrostu (dla wyższych niż 2m waga jest uzasadniona)
        assertEquals("Dość ciężko, lecz przy tym wzroście waga jest uzasadniona", dietGuide.giveAdvice(50, 110, 203));
        assertEquals("Dość ciężko, zastanów się, czy to nie za dużo?", dietGuide.giveAdvice(50, 110, 190));
    }
}
