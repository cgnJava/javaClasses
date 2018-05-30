package com.cognitran.classes.topic6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesExample
{
    private static void odczytPlikuTekstowego(String nazwa) throws IOException
    {
        BufferedReader plik2 = null;
        try
        {
            plik2 = new BufferedReader(new FileReader(nazwa));
            String l = plik2.readLine();
            while (l != null)
            {
                System.out.println(l);
                l = plik2.readLine();
            }
        }
        finally
        {
            if (plik2 != null)
            {
                plik2.close();
            }
        }
    }

    private static void zapisPlikuTekstowego(String nazwa) throws IOException
    {
        FileWriter plikWy = null;
        try
        {
            // tworzy nowy plik jeżeli nie istnieje, w przeciwnym przypadku
            // usuwa zawartość pliku i nadpisuje od początku
            plikWy = new FileWriter(nazwa);
            String tekst = "Ala ma kota.\n";
            plikWy.write(tekst);
        }
        finally
        {
            if (plikWy != null)
            {
                plikWy.close();
            }
        }
    }

    public static void main(String[] args) throws IOException
    {
        String nazwaPliku = "D:/test.txt";
        zapisPlikuTekstowego(nazwaPliku);
        odczytPlikuTekstowego(nazwaPliku);
    }
}
