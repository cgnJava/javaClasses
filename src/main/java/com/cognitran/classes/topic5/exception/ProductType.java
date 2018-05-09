package com.cognitran.classes.topic5.exception;

public enum ProductType
{
    TOOLS("T"), VEGETABLE("V"), FRUIT("F");

    private final String value;

    private ProductType(String value)
    {
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }
}
