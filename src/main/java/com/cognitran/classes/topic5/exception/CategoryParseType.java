package com.cognitran.classes.topic5.exception;

public enum CategoryParseType implements Parseable<ProductType>
{
    BY_SHORTCUT, BY_NAME, BY_ORINAL;

    @Override
    public ProductType parse(String value)
    {
        return null;
    }
}
