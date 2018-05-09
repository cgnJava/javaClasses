package com.cognitran.classes.topic5.exception;

import java.util.List;

import org.junit.Test;

public class ProductParserTest
{
    @Test
    public void shouldNotParseProducts()
    {
        String[] products = {
            "Różowe stringi;23.00;bielizna",
            "Wiertarka udarowa;175.00;T",
            "Ziemniaki;3.50",
            "Kapusta;dwa złote;V"
        };
        ProductParser parser = new ProductParser();
        try
        {
            parser.parseProducts(products);
        }
        catch (ProductParseException e)
        {
            List<String> errors = e.getErrors();
            
        }
    }

    @Test
    public void shouldParseProducts()
    {
        
    }
}
