package com.cognitran.classes.topic5.exception;

public interface Parseable<ANY>
{
    ANY parse(String value);
}
