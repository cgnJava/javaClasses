package com.cognitran.classes.topic5.exception;

import java.util.List;

public class ProductParseException extends Exception
{
    private static final long serialVersionUID = 1L;

    private final List<String> errors;

    public ProductParseException(List<String> errors)
    {
        this.errors = errors;
    }

    public List<String> getErrors()
    {
        return errors;
    }
}
