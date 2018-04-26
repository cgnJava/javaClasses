package com.cognitran.classes.topic5.testing;

/**
 * Przykład mockowania.
 */
public class EmailSender
{
    protected DBRepository database;

    public void sendEmail(String username, String content)
    {
        String email = database.getEmail(username);
        System.out.println("Użytkownik " + username + " ma email: " + email);

        database.saveEmail(email, content);
        System.out.println("Wysłano email");
    }
}
