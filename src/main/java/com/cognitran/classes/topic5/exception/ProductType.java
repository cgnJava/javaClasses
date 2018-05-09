package com.cognitran.classes.topic5.exception;

public enum ProductType
{
    TOOLS("T"), VEGETABLE("V"), FRUIT("F"), GIFT("G");

    private final String shortcut;

    private ProductType(String shortcut)
    {
        this.shortcut = shortcut;
    }

    public String getShortcut()
    {
        return shortcut;
    }
}
