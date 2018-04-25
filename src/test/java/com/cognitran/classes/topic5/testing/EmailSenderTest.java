package com.cognitran.classes.topic5.testing;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class EmailSenderTest
{
    @Test
    public void shouldInvokeMethodFromMock()
    {
        //given
        EmailSender example = new EmailSender();
        DBRepository mock = mock(DBRepository.class);
        when(mock.getEmail(anyString())).thenReturn("aaa@wp.pl");
        example.database = mock;

        //when
        example.sendEmail("leszek", "email");

        //then
        // weryfikujemy że metody getEmail() i saveEmail() zostały wywołane
        verify(mock, atLeastOnce()).getEmail("leszek");
        verify(mock, atLeastOnce()).saveEmail(anyString(), anyString());
    }
}
