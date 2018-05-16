package com.cognitran.classes.topic5.exception;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ProductParser
{
    public static void main(String[] args)
    {
        System.out.println( ";;".split(";").length ); //0
        System.out.println( "0;;".split(";").length ); //1
        System.out.println( ";0;".split(";").length ); //2
        System.out.println( ";;".split(";", -1).length ); //3
    }

    private final SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

    /**
      Sparsuj wszytkie wartości z tablicy - pomiń błędne produkty
      rzuć wyjątkiem:
        jeśli jest za mało lub za dużo elementów
        jeśli nazwa jest pusta
        jeśli nie da się sparsować ceny
        jesli nieznana kategoria
        nie łapiemy ogólnego Exception - tylko konkretny np. IllegalArgumentException, NumberFormatException etc.

        2.
        liczbą w 2-giej kolumnie może być przecinek zamiast kropki
        jeśli nazwa nie zaczyna się wielką literą - Character.isUpperCase()
        jeśli cena jest mniejsza o zera
        jeśli cena jest równa 0 dla kategorii GIFT
        odczytanie daty
        obsługa CategoryParseType
     */
    public List<Product> parseProducts(String[] products, CategoryParseType categoryParseType) throws ProductParseException
    {
        List<String> errors = new ArrayList<>();
        List<Product> result = new ArrayList<>();
        int i = 0;
        for (String line : products)
        {
            i++;
            String[] split = line.split(";", -1);
            if (split.length != 4)
            {
                errors.add("Linia " + i + " powinna mieć 4 elementy");
            }
            else
            {
                Product product = parseSingleLine(split, errors, categoryParseType, i);
                result.add(product);
            }
        }
        if (!errors.isEmpty())
        {
            throw new ProductParseException(errors);
        }
        return result;
    }

    private Product parseSingleLine(String[] line, List<String> errors, CategoryParseType categoryParseType, int i)
    {
        Product product = new Product();
        if (line[0].isEmpty())
        {
            errors.add("Nazwa w linii " + i + " nie może być pusta");
        }
        product.setName(line[0]);
        try
        {
            double number = Double.parseDouble( line[1].replace(",", ".") );
            product.setPrice(number);
        }
        catch (NumberFormatException ex)
        {
            errors.add("Niepoprawna cena: " + line[1]);
        }
        try
        {
            product.setCategory(ProductType.valueOf(line[2]));
        }
        catch (IllegalArgumentException ex)
        {
            errors.add("Niepoprawna kategoria: " + line[2]);
        }
        return product;
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
