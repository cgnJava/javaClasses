package com.cognitran.classes.topic5.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;

public class ProductParserTest
{
    @Test
    public void shouldNotParseProductsByName()
    {
        String[] products = {
            "Różowe stringi;23.00;BIELIZNA;2018-01-01",
            "Wiertarka udarowa;175,00;TOOLS;2018-01",
            "Ziemniaki;3.50;2018-01-01",
            "Kapusta;dwa złote;VEGETABLE;2018-03-05"
        };
        ProductParser parser = new ProductParser();
        try
        {
            parser.parseProducts(products, CategoryParseType.BY_NAME);
            fail();
        }
        catch (ProductParseException e)
        {
            List<String> errors = e.getErrors();
            assertEquals(3, errors.size());
            assertEquals("Niepoprawna kategoria: BIELIZNA", errors.get(0));
            assertEquals("Linia 3 powinna mieć 4 elementy", errors.get(1));
            assertEquals("Niepoprawna cena: dwa złote", errors.get(2));
        }
    }

    @Test
    public void shouldNotParseProductsByOrdinal()
    {
        String[] products = {
            "Różowe stringi;23.00;-1;2018-01-01",
            "Wiertarka udarowa;175,00;0;2018-01",
            "Ziemniaki;3.50;1,2018-01-01",
            "Kapusta;dwa złote;1;2018-03-05"
        };
        ProductParser parser = new ProductParser();
        try
        {
            parser.parseProducts(products, CategoryParseType.BY_NAME);
            fail();
        }
        catch (ProductParseException e)
        {
            List<String> errors = e.getErrors();
            assertEquals(3, errors.size());
        }
    }

    @Test
    public void shouldParseProducts()
    {
        
    }
}
