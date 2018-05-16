package com.cognitran.classes.topic5.exception;

public interface Parseable<ANY>
{
    /**
     * throws IllegalArgumentException - if the conversion fails
     */
    ANY parse(String value);
}
