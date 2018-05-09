package com.cognitran.classes.topic5.exception;

import java.io.InputStream;
import java.util.List;

public class ProductParser
{
    /**
      sparsuj wszytkie wartości z tablicy - pomiń błędne produkty
      rzuć wyjątkiem:
        jeśli jest za mało lub za dużo elementów
        jeśli nazwa jest pusta
        jeśli nie da się sparsować ceny
        jesli nieznana kategoria
     */
    public List<Product> parseProducts(String[] products) throws ProductParseException
    {
        return null;
    }

    /**
     * 1. Odczytaj listę produktów z pliku.
     * 2. Zapisz do pliku kategorie.txt listę kategorii z liczbą produktów, np.
            warzywa:7
            bielizna:1
            narzędzia:0
       3. Napisz kompresor (GZIPOutputStream) / dekompresor (GZIInputStream). Spakuj / rozpakuj / porównaj zawartość pliku z archiwum.
     */
    public List<Product> parseProductsFromInputStream(InputStream stream) throws ProductParseException
    {
        return null;
    }
}
