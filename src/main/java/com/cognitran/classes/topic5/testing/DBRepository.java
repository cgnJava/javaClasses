package com.cognitran.classes.topic5.testing;

public interface DBRepository
{
    String getEmail(String username);

    void saveEmail(String email, String content);
}
